package com.inventory.ui;

import com.inventory.db.DBHelper;
import com.inventory.util.BarcodeUtil;
import com.inventory.util.Item;
import com.inventory.util.Validator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.File;
import java.sql.SQLException;

/** Product management screen with barcode generation. */
public class ProductPanel extends JPanel implements Refreshable {

    private static final Logger log = LogManager.getLogger(ProductPanel.class);

    private final JTextField txtCode = new JTextField();
    private final JTextField txtName = new JTextField();
    private final JComboBox<Item> cmbCategory = new JComboBox<>();
    private final JComboBox<Item> cmbSupplier = new JComboBox<>();
    private final JTextField txtCost = new JTextField();
    private final JTextField txtPrice = new JTextField();
    private final JTextField txtReorder = new JTextField();
    private final JTextField txtQty = new JTextField("0");
    private final JTextField txtSearch = new JTextField(20);
    private final JLabel lblBarcode = new JLabel("", SwingConstants.CENTER);
    private final DefaultTableModel model;
    private final JTable tbl;
    private int selectedId = -1;

    public ProductPanel() {
        setLayout(new BorderLayout(10, 10));
        setBorder(new EmptyBorder(15, 15, 15, 15));

        txtQty.setEditable(false);   // quantity changes only through Stock In / Out / Adjustment

        JPanel form = new JPanel(new GridLayout(0, 4, 10, 10));
        form.add(new JLabel("Product Code *"));
        form.add(txtCode);
        form.add(new JLabel("Product Name *"));
        form.add(txtName);
        form.add(new JLabel("Category *"));
        form.add(cmbCategory);
        form.add(new JLabel("Supplier *"));
        form.add(cmbSupplier);
        form.add(new JLabel("Cost Price *"));
        form.add(txtCost);
        form.add(new JLabel("Selling Price *"));
        form.add(txtPrice);
        form.add(new JLabel("Reorder Level *"));
        form.add(txtReorder);
        form.add(new JLabel("Current Quantity"));
        form.add(txtQty);

        JButton btnAdd = new JButton("Add");
        JButton btnUpdate = new JButton("Update");
        JButton btnDelete = new JButton("Delete");
        JButton btnClear = new JButton("Clear");
        JButton btnBarcode = new JButton("Generate Barcode");
        JButton btnSaveBarcode = new JButton("Save Barcode PNG");
        JButton btnPrintBarcode = new JButton("Print Barcode");
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
        buttons.add(btnAdd);
        buttons.add(btnUpdate);
        buttons.add(btnDelete);
        buttons.add(btnClear);
        buttons.add(btnBarcode);
        buttons.add(btnSaveBarcode);
        buttons.add(btnPrintBarcode);

        lblBarcode.setPreferredSize(new Dimension(310, 110));
        lblBarcode.setBorder(BorderFactory.createTitledBorder("Barcode"));

        JPanel north = new JPanel(new BorderLayout(10, 5));
        north.setBorder(BorderFactory.createTitledBorder("Product Details"));
        north.add(form, BorderLayout.CENTER);
        north.add(lblBarcode, BorderLayout.EAST);
        north.add(buttons, BorderLayout.SOUTH);

        model = new DefaultTableModel(new String[]{"ID", "Code", "Name", "Category", "Supplier",
                "Cost", "Price", "Qty", "Reorder"}, 0) {
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
        JButton btnScan = new JButton("Scan with Camera");
        JPanel searchBar = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
        searchBar.add(new JLabel("Search / Scan:"));
        searchBar.add(txtSearch);
        searchBar.add(btnSearch);
        searchBar.add(btnAll);
        searchBar.add(btnScan);

        JPanel center = new JPanel(new BorderLayout());
        center.add(searchBar, BorderLayout.NORTH);
        center.add(new JScrollPane(tbl), BorderLayout.CENTER);

        add(north, BorderLayout.NORTH);
        add(center, BorderLayout.CENTER);

        btnAdd.addActionListener(e -> addProduct());
        btnUpdate.addActionListener(e -> updateProduct());
        btnDelete.addActionListener(e -> deleteProduct());
        btnClear.addActionListener(e -> clearForm());
        btnBarcode.addActionListener(e -> showBarcode());
        btnSaveBarcode.addActionListener(e -> saveBarcode());
        btnPrintBarcode.addActionListener(e -> printBarcode());
        btnSearch.addActionListener(e -> doSearch());
        txtSearch.addActionListener(e -> doSearch());   // USB scanners type the code + Enter here
        btnScan.addActionListener(e -> {
            String code = CameraScanDialog.scan(this);
            if (code != null) {
                txtSearch.setText(code);
                doSearch();
            }
        });
        btnAll.addActionListener(e -> {
            txtSearch.setText("");
            load("");
        });
        tbl.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) fillForm();
        });

        refresh();
    }

    @Override
    public void refresh() {
        loadCombos();
        load("");
    }

    private void loadCombos() {
        try {
            cmbCategory.removeAllItems();
            for (Item i : DBHelper.items("SELECT id, name FROM categories ORDER BY name")) cmbCategory.addItem(i);
            cmbSupplier.removeAllItems();
            for (Item i : DBHelper.items("SELECT id, name FROM suppliers ORDER BY name")) cmbSupplier.addItem(i);
        } catch (SQLException ex) {
            log.error("Could not load combos", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void load(String search) {
        String sql = "SELECT p.id, p.code, p.name, c.name, s.name, p.cost_price, p.unit_price, p.quantity, p.reorder_level "
                + "FROM products p JOIN categories c ON p.category_id = c.id JOIN suppliers s ON p.supplier_id = s.id ";
        try {
            if (search.isEmpty()) {
                DBHelper.loadTable(model, sql + "ORDER BY p.id DESC");
            } else {
                String like = "%" + search + "%";
                DBHelper.loadTable(model, sql + "WHERE p.code LIKE ? OR p.name LIKE ? OR c.name LIKE ? ORDER BY p.id DESC",
                        like, like, like);
            }
        } catch (SQLException ex) {
            log.error("Product load failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void selectByLabel(JComboBox<Item> combo, String label) {
        for (int i = 0; i < combo.getItemCount(); i++) {
            if (combo.getItemAt(i).getLabel().equals(label)) {
                combo.setSelectedIndex(i);
                return;
            }
        }
    }

    private void fillForm() {
        int r = tbl.getSelectedRow();
        if (r < 0) return;
        selectedId = Integer.parseInt(model.getValueAt(r, 0).toString());
        txtCode.setText(String.valueOf(model.getValueAt(r, 1)));
        txtName.setText(String.valueOf(model.getValueAt(r, 2)));
        selectByLabel(cmbCategory, String.valueOf(model.getValueAt(r, 3)));
        selectByLabel(cmbSupplier, String.valueOf(model.getValueAt(r, 4)));
        txtCost.setText(String.valueOf(model.getValueAt(r, 5)));
        txtPrice.setText(String.valueOf(model.getValueAt(r, 6)));
        txtQty.setText(String.valueOf(model.getValueAt(r, 7)));
        txtReorder.setText(String.valueOf(model.getValueAt(r, 8)));
        showBarcode();
    }

    private void clearForm() {
        txtCode.setText("");
        txtName.setText("");
        txtCost.setText("");
        txtPrice.setText("");
        txtReorder.setText("");
        txtQty.setText("0");
        lblBarcode.setIcon(null);
        selectedId = -1;
        tbl.clearSelection();
    }

    private String validateInputs() {
        if (Validator.isEmpty(txtCode.getText())) return "Product code is required.";
        if (Validator.isEmpty(txtName.getText())) return "Product name is required.";
        if (cmbCategory.getSelectedItem() == null) return "Please add a category first.";
        if (cmbSupplier.getSelectedItem() == null) return "Please add a supplier first.";
        if (!Validator.isNonNegativeDecimal(txtCost.getText())) return "Cost price must be a number (0 or more).";
        if (!Validator.isNonNegativeDecimal(txtPrice.getText())) return "Selling price must be a number (0 or more).";
        if (!Validator.isNonNegativeInt(txtReorder.getText())) return "Reorder level must be a whole number (0 or more).";
        return null;
    }

    private void addProduct() {
        String error = validateInputs();
        if (error != null) {
            JOptionPane.showMessageDialog(this, error, "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            DBHelper.execute("INSERT INTO products (code, name, category_id, supplier_id, cost_price, unit_price, reorder_level) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)",
                    txtCode.getText().trim(), txtName.getText().trim(),
                    ((Item) cmbCategory.getSelectedItem()).getId(), ((Item) cmbSupplier.getSelectedItem()).getId(),
                    Double.parseDouble(txtCost.getText().trim()), Double.parseDouble(txtPrice.getText().trim()),
                    Integer.parseInt(txtReorder.getText().trim()));
            log.info("Product added: {}", txtCode.getText().trim());
            JOptionPane.showMessageDialog(this, "Product added successfully.");
            clearForm();
            load("");
        } catch (SQLException ex) {
            log.error("Product insert failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateProduct() {
        if (selectedId < 0) {
            JOptionPane.showMessageDialog(this, "Select a product from the table first.");
            return;
        }
        String error = validateInputs();
        if (error != null) {
            JOptionPane.showMessageDialog(this, error, "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            DBHelper.execute("UPDATE products SET code=?, name=?, category_id=?, supplier_id=?, cost_price=?, "
                            + "unit_price=?, reorder_level=? WHERE id=?",
                    txtCode.getText().trim(), txtName.getText().trim(),
                    ((Item) cmbCategory.getSelectedItem()).getId(), ((Item) cmbSupplier.getSelectedItem()).getId(),
                    Double.parseDouble(txtCost.getText().trim()), Double.parseDouble(txtPrice.getText().trim()),
                    Integer.parseInt(txtReorder.getText().trim()), selectedId);
            log.info("Product {} updated", selectedId);
            JOptionPane.showMessageDialog(this, "Product updated successfully.");
            clearForm();
            load("");
        } catch (SQLException ex) {
            log.error("Product update failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deleteProduct() {
        if (selectedId < 0) {
            JOptionPane.showMessageDialog(this, "Select a product from the table first.");
            return;
        }
        if (JOptionPane.showConfirmDialog(this, "Delete the selected product?", "Confirm",
                JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION) return;
        try {
            DBHelper.execute("DELETE FROM products WHERE id = ?", selectedId);
            log.info("Product {} deleted", selectedId);
            clearForm();
            load("");
        } catch (SQLException ex) {
            log.error("Product delete failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void showBarcode() {
        String code = txtCode.getText().trim();
        if (code.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter a product code first.");
            return;
        }
        try {
            lblBarcode.setIcon(new ImageIcon(BarcodeUtil.generate(code, 280, 80)));
        } catch (Exception ex) {
            log.error("Barcode generation failed", ex);
            JOptionPane.showMessageDialog(this, "Cannot generate barcode: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void saveBarcode() {
        String code = txtCode.getText().trim();
        if (code.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter a product code first.");
            return;
        }
        JFileChooser fc = new JFileChooser();
        fc.setSelectedFile(new File(code + ".png"));
        if (fc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {
                BarcodeUtil.saveAsPng(code, fc.getSelectedFile());
                log.info("Barcode saved for {}", code);
                JOptionPane.showMessageDialog(this, "Barcode saved:\n" + fc.getSelectedFile().getAbsolutePath());
            } catch (Exception ex) {
                log.error("Barcode save failed", ex);
                JOptionPane.showMessageDialog(this, "Cannot save barcode: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void printBarcode() {
        String code = txtCode.getText().trim();
        if (code.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter or select a product first.");
            return;
        }

        // ---- print options dialog ----
        String[] layoutNames = {
                "Single label per page (label printer)",
                "A4 sheet - 3 x 8  (24 labels)",
                "A4 sheet - 4 x 10 (40 labels)",
                "A4 sheet - 2 x 5  (10 labels)"
        };
        int[] layoutCols = {1, 3, 4, 2};
        int[] layoutRows = {1, 8, 10, 5};

        JSpinner spnCopies = new JSpinner(new SpinnerNumberModel(1, 1, 1000, 1));
        JComboBox<String> cmbLayout = new JComboBox<>(layoutNames);
        JCheckBox chkPrice = new JCheckBox("Include price on label", true);

        JPanel p = new JPanel(new GridLayout(0, 1, 5, 8));
        p.add(new JLabel("Number of labels:"));
        p.add(spnCopies);
        p.add(new JLabel("Layout:"));
        p.add(cmbLayout);
        p.add(chkPrice);

        int ok = JOptionPane.showConfirmDialog(this, p, "Print Barcode Labels",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (ok != JOptionPane.OK_OPTION) return;

        int copies = (Integer) spnCopies.getValue();
        int idx = cmbLayout.getSelectedIndex();

        String priceText = null;
        if (chkPrice.isSelected()) {
            if (!Validator.isNonNegativeDecimal(txtPrice.getText())) {
                JOptionPane.showMessageDialog(this, "Enter a valid selling price first (or untick the price option).",
                        "Validation", JOptionPane.WARNING_MESSAGE);
                return;
            }
            priceText = String.format("Rs. %,.2f", Double.parseDouble(txtPrice.getText().trim()));
        }

        try {
            if (BarcodeUtil.print(code, txtName.getText().trim(), priceText,
                    copies, layoutCols[idx], layoutRows[idx])) {
                log.info("Barcode printed for {} x{} ({})", code, copies, layoutNames[idx]);
                JOptionPane.showMessageDialog(this, "Barcode sent to printer.");
            }
        } catch (Exception ex) {
            log.error("Barcode print failed", ex);
            JOptionPane.showMessageDialog(this, "Cannot print barcode: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void doSearch() {
        load(txtSearch.getText().trim());
        if (model.getRowCount() == 1) {
            tbl.setRowSelectionInterval(0, 0);
        }
    }
}
