package com.inventory.db;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/** Creates JDBC connections using the settings in db.properties. */
public class DBConnection {

    private static final Logger log = LogManager.getLogger(DBConnection.class);
    private static final Properties props = new Properties();

    static {
        try {
            File dir = new File(DBConnection.class.getProtectionDomain()
                    .getCodeSource().getLocation().toURI()).getParentFile();
            File external = new File(dir, "db.properties");
            if (external.exists()) {
                try (InputStream in = new FileInputStream(external)) { props.load(in); }
            } else {
                try (InputStream in = DBConnection.class.getResourceAsStream("/db.properties")) { props.load(in); }
            }
        } catch (Exception e) {
            log.error("Could not load db.properties", e);
        }
    }

    public static String get(String key, String defaultValue) {
        return props.getProperty(key, defaultValue).trim();
    }

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://" + get("db.host", "localhost") + ":" + get("db.port", "3306")
                + "/" + get("db.name", "inventory_db")
                + "?useSSL=false&allowPublicKeyRetrieval=true";
        return DriverManager.getConnection(url, get("db.user", "root"), get("db.password", ""));
    }
}
