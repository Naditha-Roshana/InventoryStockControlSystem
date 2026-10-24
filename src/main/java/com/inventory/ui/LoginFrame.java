package com.inventory.ui;

import com.inventory.db.DBConnection;
import com.inventory.util.PasswordUtil;
import com.inventory.util.Session;
import com.inventory.util.Validator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/** Login screen. */
public class LoginFrame extends JFrame {

    private static final Logger log = LogManager.getLogger(LoginFrame.class);

    private final JTextField txtUser = new JTextField(15);
    private final JPasswordField txtPass = new JPasswordField(15);

    public LoginFrame() {
        setTitle("Inventory System - Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel title = new JLabel("Inventory & Stock Control", SwingConstants.CENTER);
        title.setFont(new Font("Segoe UI", Font.BOLD, 22));
        title.setBorder(BorderFactory.createEmptyBorder(22, 10, 22, 10));
        title.setOpaque(true);
        title.setBackground(Theme.NAVY);
        title.setForeground(Color.WHITE);
        title.putClientProperty("keep", true);

        JPanel form = new JPanel(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        gc.insets = new Insets(8, 8, 8, 8);
        gc.anchor = GridBagConstraints.WEST;
        gc.gridx = 0; gc.gridy = 0;
        form.add(new JLabel("Username"), gc);
        gc.gridx = 1;
        form.add(txtUser, gc);
        gc.gridx = 0; gc.gridy = 1;
        form.add(new JLabel("Password"), gc);
        gc.gridx = 1;
        form.add(txtPass, gc);

        JButton btnLogin = new JButton("Login");
        JButton btnExit = new JButton("Exit");
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
        buttons.add(btnLogin);
        buttons.add(btnExit);

        add(title, BorderLayout.NORTH);
        add(form, BorderLayout.CENTER);
        add(buttons, BorderLayout.SOUTH);

        btnLogin.addActionListener(e -> doLogin());
        txtPass.addActionListener(e -> doLogin());
        btnExit.addActionListener(e -> System.exit(0));
        getRootPane().setDefaultButton(btnLogin);

        getContentPane().setBackground(Theme.BG);
        form.setBorder(BorderFactory.createEmptyBorder(15, 20, 5, 20));
        Theme.apply((Container) getContentPane(), Theme.BG);

        pack();
        setSize(Math.max(getWidth(), 420), getHeight());
        setLocationRelativeTo(null);
    }

    private void doLogin() {
        String user = txtUser.getText().trim();
        String pass = new String(txtPass.getPassword());
        if (Validator.isEmpty(user) || pass.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter username and password.", "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String sql = "SELECT id, full_name, role FROM users WHERE username = ? AND password_hash = ? AND active = 1";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, user);
            ps.setString(2, PasswordUtil.hash(pass));
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Session.userId = rs.getInt("id");
                    Session.username = user;
                    Session.fullName = rs.getString("full_name");
                    Session.role = rs.getString("role");
                    log.info("User '{}' logged in", user);
                    new MainFrame().setVisible(true);
                    dispose();
                } else {
                    log.warn("Failed login attempt for '{}'", user);
                    JOptionPane.showMessageDialog(this, "Invalid username or password.", "Login Failed", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException ex) {
            log.error("Login database error", ex);
            JOptionPane.showMessageDialog(this, "Cannot connect to database:\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
