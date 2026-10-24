package com.inventory;

import com.inventory.db.DBConnection;
import com.inventory.ui.LoginFrame;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import java.sql.Connection;

/** Application entry point. */
public class Main {

    private static final Logger log = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {
            // default look and feel is fine
        }
        SwingUtilities.invokeLater(() -> {
            try (Connection ignored = DBConnection.getConnection()) {
                log.info("Application started, database connection OK");
            } catch (Exception ex) {
                log.error("Database connection failed", ex);
                JOptionPane.showMessageDialog(null,
                        "Cannot connect to the database.\nCheck MySQL is running and db.properties is correct.\n\n" + ex.getMessage(),
                        "Database Error", JOptionPane.ERROR_MESSAGE);
                System.exit(1);
            }
            new LoginFrame().setVisible(true);
        });
    }
}
