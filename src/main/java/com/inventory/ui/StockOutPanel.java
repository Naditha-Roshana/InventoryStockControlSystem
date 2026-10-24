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

/** Stock Out (goods issued / sold to customers). Decreases product quantity. */
public class StockOutPanel extends JPanel implements Refreshable {

    private static final Logger log = LogManager.getLogger(StockOutPanel.class);

    private final JComboBox<Item> cmbProduct = new JComboBox<>();
    private final JComboBox<Item> cmbCustomer = new JComboBox<>();
    private final JLabel lblAvailable = new JLabel("Available: -");
    private final JTextField txtQty = new JTextField();
    private final JTextField txtPrice = new JTextField();
    private final JTextField txtDate = new JTextField(LocalDate.now().toString());
    private final JTextField txtRemarks = new JTextField();
    private final JTextField txtSearch = new JTextField(20);
    private final DefaultTableModel model;
    private final JTable tbl;

    public StockOutPanel() {
        setLayout(new BorderLayout(10, 10));
        setBorder(new EmptyBorder(15, 15, 15, 15));

        JPanel form = new JPanel(new GridLayout(0, 4, 10, 10));
        form.add(new JLabel("Product *"));
        form.add(cmbProduct);
        form.add(new JLabel("Customer *"));
        form.add(cmbCustomer);
        form.add(new JLabel("Quantity *"));
        form.add(txtQty);
        form.add(new JLabel("Unit Price *"));
        form.add(txtPrice);
        form.add(new JLabel("Date (yyyy-MM-dd) *"));
        form.add(txtDate);
        form.add(new JLabel("Remarks"));
        form.add(txtRemarks);
        form.add(lblAvailable);

        // scan row: USB scanner (types code + Enter) or laptop camera
        JPanel scanRow = new JPanel(new BorderLayout(10, 0));
        scanRow.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
        scanRow.add(new JLabel("Scan Barcode"), BorderLayout.WEST);
        scanRow.add(ScanHelper.createScanPanel(this, code -> {
            if (ScanHelper.selectProduct(this, cmbProduct, code)) txtQty.requestFocusInWindow();
        }), BorderLayout.CENTER);

        JButton btnSave = new JButton("Save Stock Out");
        JButton btnDelete = new JButton("Delete (return stock)");
        JButton btnClear = new JButton("Clear");
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
        buttons.add(btnSave);
        buttons.add(btnDelete);
        buttons.add(btnClear);

        JPanel north = new JPanel(new BorderLayout());
        north.setBorder(BorderFactory.createTitledBorder("Stock Out (Goods Issued)"));
        north.add(scanRow, BorderLayout.NORTH);
        north.add(form, BorderLayout.CENTER);
        north.add(buttons, BorderLayout.SOUTH);

        model = new DefaultTableModel(new String[]{"ID", "Code", "Product", "Customer", "Qty",
                "Unit Price", "Date", "User", "Remarks"}, 0) {
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
        searchBar.add(new JLabel("Search (product / customer):"));
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
        cmbProduct.addActionListener(e -> productChanged());

        refresh();
    }

    @Override
    public void refresh() {
        try {
            cmbProduct.removeAllItems();
            for (Item i : DBHelper.items("SELECT id, CONCAT(code, ' - ', name) FROM products ORDER BY code")) cmbProduct.addItem(i);
            cmbCustomer.removeAllItems();
            for (Item i : DBHelper.items("SELECT id, name FROM customers ORDER BY name")) cmbCustomer.addItem(i);
        } catch (SQLException ex) {
            log.error("Combo load failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
        load("");
    }

    /** Shows available quantity and the default selling price of the selected product. */
    private void productChanged() {
        Item p = (Item) cmbProduct.getSelectedItem();
        if (p == null) return;
        try {
            Object qty = DBHelper.scalar("SELECT quantity FROM products WHERE id = ?", p.getId());
            Object price = DBHelper.scalar("SELECT unit_price FROM products WHERE id = ?", p.getId());
            lblAvailable.setText("Available: " + qty);
            if (price != null) txtPrice.setText(price.toString());
        } catch (SQLException ex) {
            log.error("Could not read product", ex);
        }
    }

    private void load(String search) {
        String sql = "SELECT so.id, p.code, p.name, c.name, so.quantity, so.unit_price, so.issue_date, u.username, so.remarks "
                + "FROM stock_out so JOIN products p ON so.product_id = p.id JOIN customers c ON so.customer_id = c.id "
                + "JOIN users u ON so.user_id = u.id ";
        try {
            if (search.isEmpty()) {
                DBHelper.loadTable(model, sql + "ORDER BY so.id DESC");
            } else {
                String like = "%" + search + "%";
                DBHelper.loadTable(model, sql + "WHERE p.code LIKE ? OR p.name LIKE ? OR c.name LIKE ? ORDER BY so.id DESC",
                        like, like, like);
            }
        } catch (SQLException ex) {
            log.error("Stock out load failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearForm() {
        txtQty.setText("");
        txtDate.setText(LocalDate.now().toString());
        txtRemarks.setText("");
        tbl.clearSelection();
        productChanged();
    }

    private void save() {
        if (cmbProduct.getSelectedItem() == null || cmbCustomer.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Select a product and a customer.", "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!Validator.isPositiveInt(txtQty.getText())) {
            JOptionPane.showMessageDialog(this, "Quantity must be a whole number greater than 0.", "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!Validator.isNonNegativeDecimal(txtPrice.getText())) {
            JOptionPane.showMessageDialog(this, "Unit price must be a valid number.", "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!Validator.isValidDate(txtDate.getText())) {
            JOptionPane.showMessageDialog(this, "Date must be in yyyy-MM-dd format.", "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int productId = ((Item) cmbProduct.getSelectedItem()).getId();
        int customerId = ((Item) cmbCustomer.getSelectedItem()).getId();
        int qty = Integer.parseInt(txtQty.getText().trim());
        double price = Double.parseDouble(txtPrice.getText().trim());

        try (Connection con = DBConnection.getConnection()) {
            con.setAutoCommit(false);
            try {
                // Reduce stock only if enough quantity is available
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
                    JOptionPane.showMessageDialog(this, "Not enough stock available for this product.",
                            "Insufficient Stock", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                try (PreparedStatement ps = con.prepareStatement(
                        "INSERT INTO stock_out (product_id, customer_id, quantity, unit_price, issue_date, user_id, remarks) "
                                + "VALUES (?, ?, ?, ?, ?, ?, ?)")) {
                    ps.setInt(1, productId);
                    ps.setInt(2, customerId);
                    ps.setInt(3, qty);
                    ps.setDouble(4, price);
                    ps.setDate(5, java.sql.Date.valueOf(LocalDate.parse(txtDate.getText().trim())));
                    ps.setInt(6, Session.userId);
                    ps.setString(7, txtRemarks.getText().trim());
                    ps.executeUpdate();
                }
                con.commit();
            } catch (SQLException ex) {
                con.rollback();
                throw ex;
            }
            log.info("Stock out: product {} qty {}", productId, qty);
            JOptionPane.showMessageDialog(this, "Stock issued successfully.");
            clearForm();
            load("");
        } catch (SQLException ex) {
            log.error("Stock out failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void delete() {
        int row = tbl.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Select a record from the table first.");
            return;
        }
        if (JOptionPane.showConfirmDialog(this, "Delete this record and return the quantity to stock?", "Confirm",
                JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION) return;
        int id = Integer.parseInt(model.getValueAt(row, 0).toString());

        try (Connection con = DBConnection.getConnection()) {
            con.setAutoCommit(false);
            try {
                int productId;
                int qty;
                try (PreparedStatement ps = con.prepareStatement("SELECT product_id, quantity FROM stock_out WHERE id = ?")) {
                    ps.setInt(1, id);
                    try (ResultSet rs = ps.executeQuery()) {
                        if (!rs.next()) throw new SQLException("Record not found");
                        productId = rs.getInt(1);
                        qty = rs.getInt(2);
                    }
                }
                try (PreparedStatement ps = con.prepareStatement("UPDATE products SET quantity = quantity + ? WHERE id = ?")) {
                    ps.setInt(1, qty);
                    ps.setInt(2, productId);
                    ps.executeUpdate();
                }
                try (PreparedStatement ps = con.prepareStatement("DELETE FROM stock_out WHERE id = ?")) {
                    ps.setInt(1, id);
                    ps.executeUpdate();
                }
                con.commit();
            } catch (SQLException ex) {
                con.rollback();
                throw ex;
            }
            log.info("Stock out record {} deleted", id);
            load("");
        } catch (SQLException ex) {
            log.error("Stock out delete failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
