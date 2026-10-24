package com.inventory.ui;

import com.inventory.db.DBConnection;
import com.inventory.db.DBHelper;
import com.inventory.util.Item;
import com.inventory.util.Session;
import com.inventory.util.Validator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/** Stock adjustments for damaged / lost items or stock count corrections (+ or -). */
public class AdjustmentPanel extends JPanel implements Refreshable {

    private static final Logger log = LogManager.getLogger(AdjustmentPanel.class);

    private final JComboBox<Item> cmbProduct = new JComboBox<>();
    private final JTextField txtChange = new JTextField();
    private final JTextField txtReason = new JTextField();
    private final DefaultTableModel model = new DefaultTableModel(
            new String[]{"ID", "Code", "Product", "Change", "Reason", "Date", "User"}, 0) {
        @Override
        public boolean isCellEditable(int r, int c) {
            return false;
        }
    };

    public AdjustmentPanel() {
        setLayout(new BorderLayout(10, 10));
        setBorder(new EmptyBorder(15, 15, 15, 15));

        JPanel form = new JPanel(new GridLayout(0, 4, 10, 10));
        form.add(new JLabel("Product *"));
        form.add(cmbProduct);
        form.add(new JLabel("Quantity Change * (e.g. -5 or 10)"));
        form.add(txtChange);
        form.add(new JLabel("Reason *"));
        form.add(txtReason);

        JButton btnSave = new JButton("Apply Adjustment");
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
        buttons.add(btnSave);

        JPanel north = new JPanel(new BorderLayout());
        north.setBorder(BorderFactory.createTitledBorder("Stock Adjustment"));
        north.add(form, BorderLayout.CENTER);
        north.add(buttons, BorderLayout.SOUTH);

        JTable tbl = new JTable(model);
        tbl.setRowHeight(24);

        add(north, BorderLayout.NORTH);
        add(new JScrollPane(tbl), BorderLayout.CENTER);

        btnSave.addActionListener(e -> save());
        refresh();
    }

    @Override
    public void refresh() {
        try {
            cmbProduct.removeAllItems();
            for (Item i : DBHelper.items("SELECT id, CONCAT(code, ' - ', name) FROM products ORDER BY code")) cmbProduct.addItem(i);
            DBHelper.loadTable(model, "SELECT a.id, p.code, p.name, a.quantity_change, a.reason, a.adjust_date, u.username "
                    + "FROM stock_adjustments a JOIN products p ON a.product_id = p.id JOIN users u ON a.user_id = u.id "
                    + "ORDER BY a.id DESC");
        } catch (SQLException ex) {
            log.error("Adjustment load failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void save() {
        if (cmbProduct.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Select a product.", "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int change;
        try {
            change = Integer.parseInt(txtChange.getText().trim());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Quantity change must be a whole number.", "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (change == 0) {
            JOptionPane.showMessageDialog(this, "Quantity change cannot be 0.", "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (Validator.isEmpty(txtReason.getText())) {
            JOptionPane.showMessageDialog(this, "Reason is required.", "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int productId = ((Item) cmbProduct.getSelectedItem()).getId();

        try (Connection con = DBConnection.getConnection()) {
            con.setAutoCommit(false);
            try {
                int updated;
                try (PreparedStatement ps = con.prepareStatement(
                        "UPDATE products SET quantity = quantity + ? WHERE id = ? AND quantity + ? >= 0")) {
                    ps.setInt(1, change);
                    ps.setInt(2, productId);
                    ps.setInt(3, change);
                    updated = ps.executeUpdate();
                }
                if (updated == 0) {
                    con.rollback();
                    JOptionPane.showMessageDialog(this, "Adjustment would make the stock negative.",
                            "Not allowed", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                try (PreparedStatement ps = con.prepareStatement(
                        "INSERT INTO stock_adjustments (product_id, quantity_change, reason, user_id) VALUES (?, ?, ?, ?)")) {
                    ps.setInt(1, productId);
                    ps.setInt(2, change);
                    ps.setString(3, txtReason.getText().trim());
                    ps.setInt(4, Session.userId);
                    ps.executeUpdate();
                }
                con.commit();
            } catch (SQLException ex) {
                con.rollback();
                throw ex;
            }
            log.info("Stock adjustment: product {} change {}", productId, change);
            JOptionPane.showMessageDialog(this, "Adjustment saved.");
            txtChange.setText("");
            txtReason.setText("");
            refresh();
        } catch (SQLException ex) {
            log.error("Adjustment failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
