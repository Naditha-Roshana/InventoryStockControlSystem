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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

/** Stock In (goods received from suppliers). Increases product quantity. */
public class StockInPanel extends JPanel implements Refreshable {

    private static final Logger log = LogManager.getLogger(StockInPanel.class);

    private final JComboBox<Item> cmbProduct = new JComboBox<>();
    private final JComboBox<Item> cmbSupplier = new JComboBox<>();
    private final JTextField txtQty = new JTextField();
    private final JTextField txtCost = new JTextField();
    private final JTextField txtDate = new JTextField(LocalDate.now().toString());
    private final JTextField txtRemarks = new JTextField();
    private final JTextField txtSearch = new JTextField(20);
    private final DefaultTableModel model;
    private final JTable tbl;

    public StockInPanel() {
        setLayout(new BorderLayout(10, 10));
        setBorder(new EmptyBorder(15, 15, 15, 15));

        JPanel form = new JPanel(new GridLayout(0, 4, 10, 10));
        form.add(new JLabel("Product *"));
        form.add(cmbProduct);
        form.add(new JLabel("Supplier *"));
        form.add(cmbSupplier);
        form.add(new JLabel("Quantity *"));
        form.add(txtQty);
        form.add(new JLabel("Unit Cost *"));
        form.add(txtCost);
        form.add(new JLabel("Date (yyyy-MM-dd) *"));
        form.add(txtDate);
        form.add(new JLabel("Remarks"));
        form.add(txtRemarks);

        // scan row: USB scanner (types code + Enter) or laptop camera
        JPanel scanRow = new JPanel(new BorderLayout(10, 0));
        scanRow.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
        scanRow.add(new JLabel("Scan Barcode"), BorderLayout.WEST);
        scanRow.add(ScanHelper.createScanPanel(this, code -> {
            if (ScanHelper.selectProduct(this, cmbProduct, code)) txtQty.requestFocusInWindow();
        }), BorderLayout.CENTER);

        JButton btnSave = new JButton("Save Stock In");
        JButton btnDelete = new JButton("Delete (reverse stock)");
        JButton btnClear = new JButton("Clear");
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
        buttons.add(btnSave);
        buttons.add(btnDelete);
        buttons.add(btnClear);

        JPanel north = new JPanel(new BorderLayout());
        north.setBorder(BorderFactory.createTitledBorder("Stock In (Goods Received)"));
        north.add(scanRow, BorderLayout.NORTH);
        north.add(form, BorderLayout.CENTER);
        north.add(buttons, BorderLayout.SOUTH);

        model = new DefaultTableModel(new String[]{"ID", "Code", "Product", "Supplier", "Qty",
                "Unit Cost", "Date", "User", "Remarks"}, 0) {
            @Override
            public boolean isCellEditable(int r, int c) {
                return false;
            }
        };
        tbl = new JTable(model);
        tbl.setRowHeight(24);
        tbl.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JButton btnSearch = new JButton("Search");
        JButton btnAll = new JButton("Show All");
        JPanel searchBar = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
        searchBar.add(new JLabel("Search (product / supplier):"));
        searchBar.add(txtSearch);
        searchBar.add(btnSearch);
        searchBar.add(btnAll);

        JPanel center = new JPanel(new BorderLayout());
        center.add(searchBar, BorderLayout.NORTH);
        center.add(new JScrollPane(tbl), BorderLayout.CENTER);

        add(north, BorderLayout.NORTH);
        add(center, BorderLayout.CENTER);

        btnSave.addActionListener(e -> save());
        btnDelete.addActionListener(e -> delete());
        btnClear.addActionListener(e -> clearForm());
        btnSearch.addActionListener(e -> load(txtSearch.getText().trim()));
        txtSearch.addActionListener(e -> load(txtSearch.getText().trim()));
        btnAll.addActionListener(e -> {
            txtSearch.setText("");
            load("");
        });
        cmbProduct.addActionListener(e -> fillDefaultCost());

        refresh();
    }

    @Override
    public void refresh() {
        try {
            cmbProduct.removeAllItems();
            for (Item i : DBHelper.items("SELECT id, CONCAT(code, ' - ', name) FROM products ORDER BY code")) cmbProduct.addItem(i);
            cmbSupplier.removeAllItems();
            for (Item i : DBHelper.items("SELECT id, name FROM suppliers ORDER BY name")) cmbSupplier.addItem(i);
        } catch (SQLException ex) {
            log.error("Combo load failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
        load("");
    }

    private void fillDefaultCost() {
        Item p = (Item) cmbProduct.getSelectedItem();
        if (p == null) return;
        try {
            Object cost = DBHelper.scalar("SELECT cost_price FROM products WHERE id = ?", p.getId());
            if (cost != null) txtCost.setText(cost.toString());
        } catch (SQLException ex) {
            log.error("Could not read cost price", ex);
        }
    }

    private void load(String search) {
        String sql = "SELECT si.id, p.code, p.name, s.name, si.quantity, si.unit_cost, si.received_date, u.username, si.remarks "
                + "FROM stock_in si JOIN products p ON si.product_id = p.id JOIN suppliers s ON si.supplier_id = s.id "
                + "JOIN users u ON si.user_id = u.id ";
        try {
            if (search.isEmpty()) {
                DBHelper.loadTable(model, sql + "ORDER BY si.id DESC");
            } else {
                String like = "%" + search + "%";
                DBHelper.loadTable(model, sql + "WHERE p.code LIKE ? OR p.name LIKE ? OR s.name LIKE ? ORDER BY si.id DESC",
                        like, like, like);
            }
        } catch (SQLException ex) {
            log.error("Stock in load failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearForm() {
        txtQty.setText("");
        txtCost.setText("");
        txtDate.setText(LocalDate.now().toString());
        txtRemarks.setText("");
        tbl.clearSelection();
        fillDefaultCost();
    }

    private void save() {
        if (cmbProduct.getSelectedItem() == null || cmbSupplier.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Select a product and a supplier.", "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!Validator.isPositiveInt(txtQty.getText())) {
            JOptionPane.showMessageDialog(this, "Quantity must be a whole number greater than 0.", "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!Validator.isNonNegativeDecimal(txtCost.getText())) {
            JOptionPane.showMessageDialog(this, "Unit cost must be a valid number.", "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!Validator.isValidDate(txtDate.getText())) {
            JOptionPane.showMessageDialog(this, "Date must be in yyyy-MM-dd format.", "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int productId = ((Item) cmbProduct.getSelectedItem()).getId();
        int supplierId = ((Item) cmbSupplier.getSelectedItem()).getId();
        int qty = Integer.parseInt(txtQty.getText().trim());
        double cost = Double.parseDouble(txtCost.getText().trim());

        // Two SQL statements must succeed together -> JDBC transaction
        try (Connection con = DBConnection.getConnection()) {
            con.setAutoCommit(false);
            try {
                try (PreparedStatement ps = con.prepareStatement(
                        "INSERT INTO stock_in (product_id, supplier_id, quantity, unit_cost, received_date, user_id, remarks) "
                                + "VALUES (?, ?, ?, ?, ?, ?, ?)")) {
                    ps.setInt(1, productId);
                    ps.setInt(2, supplierId);
                    ps.setInt(3, qty);
                    ps.setDouble(4, cost);
                    ps.setDate(5, java.sql.Date.valueOf(LocalDate.parse(txtDate.getText().trim())));
                    ps.setInt(6, Session.userId);
                    ps.setString(7, txtRemarks.getText().trim());
                    ps.executeUpdate();
                }
                try (PreparedStatement ps = con.prepareStatement(
                        "UPDATE products SET quantity = quantity + ?, cost_price = ? WHERE id = ?")) {
                    ps.setInt(1, qty);
                    ps.setDouble(2, cost);
                    ps.setInt(3, productId);
                    ps.executeUpdate();
                }
                con.commit();
            } catch (SQLException ex) {
                con.rollback();
                throw ex;
            }
            log.info("Stock in: product {} qty {}", productId, qty);
            JOptionPane.showMessageDialog(this, "Stock added successfully.");
            clearForm();
            load("");
        } catch (SQLException ex) {
            log.error("Stock in failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void delete() {
        int row = tbl.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Select a record from the table first.");
            return;
        }
        if (JOptionPane.showConfirmDialog(this, "Delete this record and remove the quantity from stock?", "Confirm",
                JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION) return;
        int id = Integer.parseInt(model.getValueAt(row, 0).toString());

        try (Connection con = DBConnection.getConnection()) {
            con.setAutoCommit(false);
            try {
                int productId;
                int qty;
                try (PreparedStatement ps = con.prepareStatement("SELECT product_id, quantity FROM stock_in WHERE id = ?")) {
                    ps.setInt(1, id);
                    try (ResultSet rs = ps.executeQuery()) {
                        if (!rs.next()) throw new SQLException("Record not found");
                        productId = rs.getInt(1);
                        qty = rs.getInt(2);
                    }
                }
                int updated;
                try (PreparedStatement ps = con.prepareStatement(
                        "UPDATE products SET quantity = quantity - ? WHERE id = ? AND quantity >= ?")) {
                    ps.setInt(1, qty);
                    ps.setInt(2, productId);
                    ps.setInt(3, qty);
                    updated = ps.executeUpdate();
                }
                if (updated == 0) {
                    con.rollback();
                    JOptionPane.showMessageDialog(this, "Cannot delete: part of this stock has already been issued.",
                            "Not allowed", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                try (PreparedStatement ps = con.prepareStatement("DELETE FROM stock_in WHERE id = ?")) {
                    ps.setInt(1, id);
                    ps.executeUpdate();
                }
                con.commit();
            } catch (SQLException ex) {
                con.rollback();
                throw ex;
            }
            log.info("Stock in record {} deleted", id);
            load("");
        } catch (SQLException ex) {
            log.error("Stock in delete failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
