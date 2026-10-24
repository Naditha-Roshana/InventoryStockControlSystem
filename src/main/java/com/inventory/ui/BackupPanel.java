package com.inventory.ui;

import com.inventory.util.BackupUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.io.File;
import java.time.LocalDate;

/** Database backup and restore (Admin only). */
public class BackupPanel extends JPanel {

    private static final Logger log = LogManager.getLogger(BackupPanel.class);

    private final JTextArea txtStatus = new JTextArea();

    public BackupPanel() {
        setLayout(new BorderLayout(10, 10));
        setBorder(new EmptyBorder(15, 15, 15, 15));

        JButton btnBackup = new JButton("Backup Database");
        JButton btnRestore = new JButton("Restore Database");
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT, 15, 15));
        p.setBorder(BorderFactory.createTitledBorder("Database Maintenance"));
        p.add(btnBackup);
        p.add(btnRestore);

        txtStatus.setEditable(false);
        txtStatus.setText("Backup creates a .sql file using mysqldump.\n"
                + "Restore runs a .sql file using the mysql tool (existing data will be replaced).\n"
                + "If these tools are not found, set mysql.bin.path in db.properties.\n");

        add(p, BorderLayout.NORTH);
        add(new JScrollPane(txtStatus), BorderLayout.CENTER);

        btnBackup.addActionListener(e -> backup());
        btnRestore.addActionListener(e -> restore());
    }

    private void backup() {
        JFileChooser fc = new JFileChooser();
        fc.setSelectedFile(new File("inventory_backup_" + LocalDate.now() + ".sql"));
        if (fc.showSaveDialog(this) != JFileChooser.APPROVE_OPTION) return;
        try {
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            BackupUtil.backup(fc.getSelectedFile());
            txtStatus.append("Backup created: " + fc.getSelectedFile().getAbsolutePath() + "\n");
            JOptionPane.showMessageDialog(this, "Backup completed successfully.");
        } catch (Exception ex) {
            log.error("Backup failed", ex);
            txtStatus.append("Backup failed: " + ex.getMessage() + "\n");
            JOptionPane.showMessageDialog(this, "Backup failed:\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            setCursor(Cursor.getDefaultCursor());
        }
    }

    private void restore() {
        JFileChooser fc = new JFileChooser();
        if (fc.showOpenDialog(this) != JFileChooser.APPROVE_OPTION) return;
        int ok = JOptionPane.showConfirmDialog(this,
                "Restoring will overwrite current data. Continue?", "Confirm Restore", JOptionPane.YES_NO_OPTION);
        if (ok != JOptionPane.YES_OPTION) return;
        try {
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            BackupUtil.restore(fc.getSelectedFile());
            txtStatus.append("Database restored from: " + fc.getSelectedFile().getAbsolutePath() + "\n");
            JOptionPane.showMessageDialog(this, "Restore completed successfully.");
        } catch (Exception ex) {
            log.error("Restore failed", ex);
            txtStatus.append("Restore failed: " + ex.getMessage() + "\n");
            JOptionPane.showMessageDialog(this, "Restore failed:\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            setCursor(Cursor.getDefaultCursor());
        }
    }
}
