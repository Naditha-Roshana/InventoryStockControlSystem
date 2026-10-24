package com.inventory.ui;

import com.inventory.db.DBHelper;
import com.inventory.util.Item;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;
import java.util.function.Consumer;

/**
 * Shared scan support.
 * - USB / Bluetooth scanners work like a keyboard: they type the code and press Enter,
 *   so the Scan text field only needs an Enter (action) listener.
 * - The "Scan with Camera" button uses the laptop camera.
 */
public class ScanHelper {

    private static final Logger log = LogManager.getLogger(ScanHelper.class);

    /** Builds [ scan text field ][ Scan with Camera ] and calls onCode when a code is entered / scanned. */
    public static JPanel createScanPanel(Component parent, Consumer<String> onCode) {
        JTextField txtScan = new JTextField();
        txtScan.setToolTipText("Click here and scan (or type the product code and press Enter)");
        JButton btnCamera = new JButton("Scan with Camera");

        txtScan.addActionListener(e -> {
            String code = txtScan.getText().trim();
            txtScan.setText("");
            if (!code.isEmpty()) onCode.accept(code);
        });
        btnCamera.addActionListener(e -> {
            String code = CameraScanDialog.scan(parent);
            if (code != null && !code.isEmpty()) onCode.accept(code);
        });

        JPanel p = new JPanel(new BorderLayout(6, 0));
        p.add(txtScan, BorderLayout.CENTER);
        p.add(btnCamera, BorderLayout.EAST);
        return p;
    }

    /** Finds the product with this barcode (= product code) and selects it in the combo box. */
    public static boolean selectProduct(Component parent, JComboBox<Item> combo, String code) {
        try {
            Object id = DBHelper.scalar("SELECT id FROM products WHERE code = ?", code.trim());
            if (id == null) {
                JOptionPane.showMessageDialog(parent, "No product found with barcode: " + code,
                        "Not Found", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            int productId = ((Number) id).intValue();
            for (int i = 0; i < combo.getItemCount(); i++) {
                if (combo.getItemAt(i).getId() == productId) {
                    combo.setSelectedIndex(i);
                    log.info("Product selected by scan: {}", code);
                    return true;
                }
            }
            return false;
        } catch (SQLException ex) {
            log.error("Scan lookup failed", ex);
            JOptionPane.showMessageDialog(parent, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}