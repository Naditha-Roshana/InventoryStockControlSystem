package com.inventory.ui;

import com.inventory.db.DBHelper;
import com.inventory.util.PasswordUtil;
import com.inventory.util.Session;
import com.inventory.util.Validator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.SQLException;

/** User management (Admin only). */
public class UserPanel extends JPanel implements Refreshable {

    private static final Logger log = LogManager.getLogger(UserPanel.class);

    private final JTextField txtUsername = new JTextField();
    private final JTextField txtFullName = new JTextField();
    private final JPasswordField txtPassword = new JPasswordField();
    private final JComboBox<String> cmbRole = new JComboBox<>(new String[]{"ADMIN", "STAFF"});
    private final JCheckBox chkActive = new JCheckBox("Active", true);
    private final JTextField txtSearch = new JTextField(20);
    private final DefaultTableModel model;
    private final JTable tbl;
    private int selectedId = -1;

    public UserPanel() {
        setLayout(new BorderLayout(10, 10));
        setBorder(new EmptyBorder(15, 15, 15, 15));

        JPanel form = new JPanel(new GridLayout(0, 4, 10, 10));
        form.add(new JLabel("Username *"));
        form.add(txtUsername);
        form.add(new JLabel("Full Name *"));
        form.add(txtFullName);
        form.add(new JLabel("Password * (leave blank to keep)"));
        form.add(txtPassword);
        form.add(new JLabel("Role"));
        form.add(cmbRole);
        form.add(new JLabel("Status"));
        form.add(chkActive);

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
        north.setBorder(BorderFactory.createTitledBorder("User Details"));
        north.add(form, BorderLayout.CENTER);
        north.add(buttons, BorderLayout.SOUTH);

        model = new DefaultTableModel(new String[]{"ID", "Username", "Full Name", "Role", "Active"}, 0) {
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
        searchBar.add(new JLabel("Search:"));
        searchBar.add(txtSearch);
        searchBar.add(btnSearch);
        searchBar.add(btnAll);

        JPanel center = new JPanel(new BorderLayout());
        center.add(searchBar, BorderLayout.NORTH);
        center.add(new JScrollPane(tbl), BorderLayout.CENTER);

        add(north, BorderLayout.NORTH);
        add(center, BorderLayout.CENTER);

        btnAdd.addActionListener(e -> addUser());
        btnUpdate.addActionListener(e -> updateUser());
        btnDelete.addActionListener(e -> deleteUser());
        btnClear.addActionListener(e -> clearForm());
        btnSearch.addActionListener(e -> load(txtSearch.getText().trim()));
        txtSearch.addActionListener(e -> load(txtSearch.getText().trim()));
        btnAll.addActionListener(e -> {
            txtSearch.setText("");
            load("");
        });
        tbl.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) fillForm();
        });

        load("");
    }

    @Override
    public void refresh() {
        load("");
    }

    private void load(String search) {
        String sql = "SELECT id, username, full_name, role, active FROM users ";
        try {
            if (search.isEmpty()) {
                DBHelper.loadTable(model, sql + "ORDER BY id");
            } else {
                String like = "%" + search + "%";
                DBHelper.loadTable(model, sql + "WHERE username LIKE ? OR full_name LIKE ? ORDER BY id", like, like);
            }
        } catch (SQLException ex) {
            log.error("User load failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void fillForm() {
        int r = tbl.getSelectedRow();
        if (r < 0) return;
        selectedId = Integer.parseInt(model.getValueAt(r, 0).toString());
        txtUsername.setText(String.valueOf(model.getValueAt(r, 1)));
        txtFullName.setText(String.valueOf(model.getValueAt(r, 2)));
        cmbRole.setSelectedItem(String.valueOf(model.getValueAt(r, 3)));
        String active = String.valueOf(model.getValueAt(r, 4));
        chkActive.setSelected(active.equals("1") || active.equalsIgnoreCase("true"));
        txtPassword.setText("");
    }

    private void clearForm() {
        txtUsername.setText("");
        txtFullName.setText("");
        txtPassword.setText("");
        cmbRole.setSelectedIndex(1);
        chkActive.setSelected(true);
        selectedId = -1;
        tbl.clearSelection();
    }

    private String validateInputs(boolean passwordRequired) {
        if (Validator.isEmpty(txtUsername.getText())) return "Username is required.";
        if (Validator.isEmpty(txtFullName.getText())) return "Full name is required.";
        String pw = new String(txtPassword.getPassword());
        if (passwordRequired && pw.isEmpty()) return "Password is required.";
        if (!pw.isEmpty() && pw.length() < 6) return "Password must be at least 6 characters.";
        return null;
    }

    private void addUser() {
        String error = validateInputs(true);
        if (error != null) {
            JOptionPane.showMessageDialog(this, error, "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            DBHelper.execute("INSERT INTO users (username, password_hash, full_name, role, active) VALUES (?, ?, ?, ?, ?)",
                    txtUsername.getText().trim(), PasswordUtil.hash(new String(txtPassword.getPassword())),
                    txtFullName.getText().trim(), cmbRole.getSelectedItem(), chkActive.isSelected() ? 1 : 0);
            log.info("User added: {}", txtUsername.getText().trim());
            JOptionPane.showMessageDialog(this, "User added successfully.");
            clearForm();
            load("");
        } catch (SQLException ex) {
            log.error("User insert failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateUser() {
        if (selectedId < 0) {
            JOptionPane.showMessageDialog(this, "Select a user from the table first.");
            return;
        }
        String error = validateInputs(false);
        if (error != null) {
            JOptionPane.showMessageDialog(this, error, "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            String pw = new String(txtPassword.getPassword());
            if (pw.isEmpty()) {
                DBHelper.execute("UPDATE users SET username=?, full_name=?, role=?, active=? WHERE id=?",
                        txtUsername.getText().trim(), txtFullName.getText().trim(),
                        cmbRole.getSelectedItem(), chkActive.isSelected() ? 1 : 0, selectedId);
            } else {
                DBHelper.execute("UPDATE users SET username=?, full_name=?, role=?, active=?, password_hash=? WHERE id=?",
                        txtUsername.getText().trim(), txtFullName.getText().trim(),
                        cmbRole.getSelectedItem(), chkActive.isSelected() ? 1 : 0, PasswordUtil.hash(pw), selectedId);
            }
            log.info("User {} updated", selectedId);
            JOptionPane.showMessageDialog(this, "User updated successfully.");
            clearForm();
            load("");
        } catch (SQLException ex) {
            log.error("User update failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deleteUser() {
        if (selectedId < 0) {
            JOptionPane.showMessageDialog(this, "Select a user from the table first.");
            return;
        }
        if (selectedId == Session.userId) {
            JOptionPane.showMessageDialog(this, "You cannot delete your own account.");
            return;
        }
        if (JOptionPane.showConfirmDialog(this, "Delete the selected user?", "Confirm",
                JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION) return;
        try {
            DBHelper.execute("DELETE FROM users WHERE id = ?", selectedId);
            log.info("User {} deleted", selectedId);
            clearForm();
            load("");
        } catch (SQLException ex) {
            log.error("User delete failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex)
                    + "\n(Tip: users with stock transactions cannot be deleted - set them inactive instead.)",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
