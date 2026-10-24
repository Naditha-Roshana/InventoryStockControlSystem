package com.inventory.ui;

import com.inventory.db.DBHelper;
import com.inventory.util.Validator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.SQLException;

/**
 * Reusable CRUD screen (Add / Update / Delete / Search) for simple tables.
 * Used for Categories, Suppliers and Customers.
 */
public class CrudPanel extends JPanel implements Refreshable {

    private static final Logger log = LogManager.getLogger(CrudPanel.class);

    private final String title;
    private final String table;
    private final String[] columns;      // DB column names (without id)
    private final String[] labels;       // labels shown on screen
    private final int[] requiredIndexes; // which fields are mandatory

    private final JTextField[] fields;
    private final JTextField txtSearch = new JTextField(20);
    private final DefaultTableModel model;
    private final JTable tbl;
    private int selectedId = -1;

    public CrudPanel(String title, String table, String[] columns, String[] labels, int[] requiredIndexes) {
        this.title = title;
        this.table = table;
        this.columns = columns;
        this.labels = labels;
        this.requiredIndexes = requiredIndexes;

        setLayout(new BorderLayout(10, 10));
        setBorder(new EmptyBorder(15, 15, 15, 15));

        // ---- form ----
        JPanel form = new JPanel(new GridLayout(0, 4, 10, 10));
        fields = new JTextField[columns.length];
        for (int i = 0; i < columns.length; i++) {
            fields[i] = new JTextField();
            form.add(new JLabel(labels[i] + (isRequired(i) ? " *" : "")));
            form.add(fields[i]);
        }
        if (columns.length % 2 != 0) {          // keep grid aligned
            form.add(new JLabel());
            form.add(new JLabel());
        }

        JButton btnAdd = new JButton("Add");
        JButton btnUpdate = new JButton("Update");
        JButton btnDelete = new JButton("Delete");
        JButton btnClear = new JButton("Clear");
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
        buttons.add(btnAdd);
        buttons.add(btnUpdate);
        buttons.add(btnDelete);
        buttons.add(btnClear);

        JPanel north = new JPanel(new BorderLayout());
        north.setBorder(BorderFactory.createTitledBorder(title));
        north.add(form, BorderLayout.CENTER);
        north.add(buttons, BorderLayout.SOUTH);

        // ---- search + table ----
        String[] headers = new String[columns.length + 1];
        headers[0] = "ID";
        System.arraycopy(labels, 0, headers, 1, labels.length);
        model = new DefaultTableModel(headers, 0) {
            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };
        tbl = new JTable(model);
        tbl.setRowHeight(24);
        tbl.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JButton btnSearch = new JButton("Search");
        JButton btnAll = new JButton("Show All");
        JPanel searchBar = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
        searchBar.add(new JLabel("Search:"));
        searchBar.add(txtSearch);
        searchBar.add(btnSearch);
        searchBar.add(btnAll);

        JPanel center = new JPanel(new BorderLayout());
        center.add(searchBar, BorderLayout.NORTH);
        center.add(new JScrollPane(tbl), BorderLayout.CENTER);

        add(north, BorderLayout.NORTH);
        add(center, BorderLayout.CENTER);

        // ---- events ----
        btnAdd.addActionListener(e -> addRecord());
        btnUpdate.addActionListener(e -> updateRecord());
        btnDelete.addActionListener(e -> deleteRecord());
        btnClear.addActionListener(e -> clearForm());
        btnSearch.addActionListener(e -> load(txtSearch.getText().trim()));
        txtSearch.addActionListener(e -> load(txtSearch.getText().trim()));
        btnAll.addActionListener(e -> {
            txtSearch.setText("");
            load("");
        });
        tbl.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                fillFormFromTable();
            }
        });

        load("");
    }

    private boolean isRequired(int index) {
        for (int r : requiredIndexes) {
            if (r == index) return true;
        }
        return false;
    }

    @Override
    public void refresh() {
        load("");
    }

    private void load(String search) {
        try {
            String sql = "SELECT id, " + String.join(", ", columns) + " FROM " + table;
            if (search.isEmpty()) {
                DBHelper.loadTable(model, sql + " ORDER BY id DESC");
            } else {
                sql += " WHERE CONCAT_WS(' ', " + String.join(", ", columns) + ") LIKE ? ORDER BY id DESC";
                DBHelper.loadTable(model, sql, "%" + search + "%");
            }
        } catch (SQLException ex) {
            log.error("Load failed for {}", table, ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void fillFormFromTable() {
        int row = tbl.getSelectedRow();
        if (row < 0) return;
        selectedId = Integer.parseInt(model.getValueAt(row, 0).toString());
        for (int i = 0; i < fields.length; i++) {
            Object v = model.getValueAt(row, i + 1);
            fields[i].setText(v == null ? "" : v.toString());
        }
    }

    private void clearForm() {
        for (JTextField f : fields) f.setText("");
        selectedId = -1;
        tbl.clearSelection();
    }

    /** Returns an error message or null if all inputs are valid. */
    private String validateInputs() {
        for (int i = 0; i < fields.length; i++) {
            String value = fields[i].getText().trim();
            if (isRequired(i) && Validator.isEmpty(value)) {
                return labels[i] + " is required.";
            }
            if (columns[i].equals("email") && !value.isEmpty() && !Validator.isEmail(value)) {
                return "Invalid email address.";
            }
            if (columns[i].equals("phone") && !value.isEmpty() && !Validator.isPhone(value)) {
                return "Invalid phone number (7-15 digits).";
            }
        }
        return null;
    }

    private Object[] values() {
        Object[] v = new Object[fields.length];
        for (int i = 0; i < fields.length; i++) v[i] = fields[i].getText().trim();
        return v;
    }

    private void addRecord() {
        String error = validateInputs();
        if (error != null) {
            JOptionPane.showMessageDialog(this, error, "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            String marks = "?" + ", ?".repeat(columns.length - 1);
            DBHelper.execute("INSERT INTO " + table + " (" + String.join(", ", columns) + ") VALUES (" + marks + ")", values());
            log.info("{} record added", title);
            JOptionPane.showMessageDialog(this, "Record added successfully.");
            clearForm();
            load("");
        } catch (SQLException ex) {
            log.error("Insert failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateRecord() {
        if (selectedId < 0) {
            JOptionPane.showMessageDialog(this, "Select a record from the table first.");
            return;
        }
        String error = validateInputs();
        if (error != null) {
            JOptionPane.showMessageDialog(this, error, "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            StringBuilder set = new StringBuilder();
            for (int i = 0; i < columns.length; i++) {
                set.append(i > 0 ? ", " : "").append(columns[i]).append(" = ?");
            }
            Object[] v = values();
            Object[] params = new Object[v.length + 1];
            System.arraycopy(v, 0, params, 0, v.length);
            params[v.length] = selectedId;
            DBHelper.execute("UPDATE " + table + " SET " + set + " WHERE id = ?", params);
            log.info("{} record {} updated", title, selectedId);
            JOptionPane.showMessageDialog(this, "Record updated successfully.");
            clearForm();
            load("");
        } catch (SQLException ex) {
            log.error("Update failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deleteRecord() {
        if (selectedId < 0) {
            JOptionPane.showMessageDialog(this, "Select a record from the table first.");
            return;
        }
        int ok = JOptionPane.showConfirmDialog(this, "Delete the selected record?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (ok != JOptionPane.YES_OPTION) return;
        try {
            DBHelper.execute("DELETE FROM " + table + " WHERE id = ?", selectedId);
            log.info("{} record {} deleted", title, selectedId);
            clearForm();
            load("");
        } catch (SQLException ex) {
            log.error("Delete failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
