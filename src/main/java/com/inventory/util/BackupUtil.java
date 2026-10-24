package com.inventory.util;

import com.inventory.db.DBConnection;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/** Database backup and restore using the mysqldump and mysql command line tools. */
public class BackupUtil {

    private static final Logger log = LogManager.getLogger(BackupUtil.class);

    private static String exe(String name) {
        String bin = DBConnection.get("mysql.bin.path", "");
        return bin.isEmpty() ? name : new File(bin, name).getPath();
    }

    private static void addConnectionArgs(List<String> cmd) {
        cmd.add("--host=" + DBConnection.get("db.host", "localhost"));
        cmd.add("--port=" + DBConnection.get("db.port", "3306"));
        cmd.add("--user=" + DBConnection.get("db.user", "root"));
        String pw = DBConnection.get("db.password", "");
        if (!pw.isEmpty()) {
            cmd.add("--password=" + pw);
        }
    }

    public static void backup(File outputFile) throws Exception {
        List<String> cmd = new ArrayList<>();
        cmd.add(exe("mysqldump"));
        addConnectionArgs(cmd);
        cmd.add("--routines");
        cmd.add("--result-file=" + outputFile.getAbsolutePath());
        cmd.add(DBConnection.get("db.name", "inventory_db"));
        run(new ProcessBuilder(cmd), "Backup");
        log.info("Database backup created: {}", outputFile.getAbsolutePath());
    }

    public static void restore(File sqlFile) throws Exception {
        List<String> cmd = new ArrayList<>();
        cmd.add(exe("mysql"));
        addConnectionArgs(cmd);
        cmd.add(DBConnection.get("db.name", "inventory_db"));
        ProcessBuilder pb = new ProcessBuilder(cmd);
        pb.redirectInput(sqlFile);
        run(pb, "Restore");
        log.info("Database restored from: {}", sqlFile.getAbsolutePath());
    }

    private static void run(ProcessBuilder pb, String what) throws Exception {
        pb.redirectErrorStream(true);
        Process p = pb.start();
        String output = new String(p.getInputStream().readAllBytes());
        int code = p.waitFor();
        if (code != 0) {
            log.error("{} failed: {}", what, output);
            throw new Exception(what + " failed. " + output);
        }
    }
}
