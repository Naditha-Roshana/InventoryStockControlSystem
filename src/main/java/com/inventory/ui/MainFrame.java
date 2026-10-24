package com.inventory.ui;

import com.inventory.util.Session;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/** Main window: left menu + screens shown with CardLayout. */
public class MainFrame extends JFrame {

    private static final Logger log = LogManager.getLogger(MainFrame.class);

    private final CardLayout cards = new CardLayout();
    private final JPanel content = new JPanel(cards);
    private final Map<String, JPanel> screens = new LinkedHashMap<>();
    private final Map<String, JButton> menuButtons = new HashMap<>();

    public MainFrame() {
        setTitle("Inventory & Stock Control System");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1150, 700);
        setLocationRelativeTo(null);

        // ---- register screens ----
        screens.put("Dashboard", new DashboardPanel());
        screens.put("Categories", new CrudPanel("Category Details", "categories",
                new String[]{"name", "description"},
                new String[]{"Name", "Description"}, new int[]{0}));
        screens.put("Suppliers", new CrudPanel("Supplier Details", "suppliers",
                new String[]{"name", "contact_person", "phone", "email", "address"},
                new String[]{"Name", "Contact Person", "Phone", "Email", "Address"}, new int[]{0}));
        screens.put("Customers", new CrudPanel("Customer Details", "customers",
                new String[]{"name", "phone", "email", "address"},
                new String[]{"Name", "Phone", "Email", "Address"}, new int[]{0}));
        screens.put("Products", new ProductPanel());
        screens.put("Stock In", new StockInPanel());
        screens.put("Stock Out", new StockOutPanel());
        screens.put("Stock Adjustment", new AdjustmentPanel());
        screens.put("Reports", new ReportPanel());
        if (Session.isAdmin()) {
            screens.put("Users", new UserPanel());
            screens.put("Backup / Restore", new BackupPanel());
        }

        // ---- left menu ----
        JPanel menu = new JPanel(new GridLayout(0, 1, 0, 4));
        menu.setBackground(Theme.SIDEBAR);
        menu.setBorder(BorderFactory.createEmptyBorder(12, 10, 10, 10));
        for (String name : screens.keySet()) {
            content.add(screens.get(name), name);
            JButton b = new JButton(name);
            Theme.styleMenuButton(b, false);
            b.addActionListener(e -> show(name));
            menuButtons.put(name, b);
            menu.add(b);
        }
        JButton btnLogout = new JButton("Logout");
        Theme.styleLogoutButton(btnLogout);
        btnLogout.addActionListener(e -> logout());
        menu.add(btnLogout);

        JPanel menuWrap = new JPanel(new BorderLayout());
        menuWrap.setBackground(Theme.SIDEBAR);
        menuWrap.add(menu, BorderLayout.NORTH);
        menuWrap.setPreferredSize(new Dimension(210, 0));

        // ---- header ----
        JLabel header = new JLabel("  Inventory & Stock Control      |      Welcome, " + Session.fullName + " (" + Session.role + ")");
        header.setFont(new Font("Segoe UI", Font.BOLD, 15));
        header.setOpaque(true);
        header.setBackground(Theme.NAVY);
        header.setForeground(Color.WHITE);
        header.putClientProperty("keep", true);
        header.setBorder(BorderFactory.createEmptyBorder(14, 10, 14, 10));

        add(header, BorderLayout.NORTH);
        add(menuWrap, BorderLayout.WEST);
        add(content, BorderLayout.CENTER);

        // colours / styles for all screens
        Theme.apply(content, Theme.BG);

        show("Dashboard");
    }

    private void show(String name) {
        JPanel p = screens.get(name);
        if (p instanceof Refreshable) {
            ((Refreshable) p).refresh();
        }
        cards.show(content, name);
        for (Map.Entry<String, JButton> e : menuButtons.entrySet()) {
            Theme.styleMenuButton(e.getValue(), e.getKey().equals(name));
        }
    }

    private void logout() {
        log.info("User '{}' logged out", Session.username);
        new LoginFrame().setVisible(true);
        dispose();
    }
}
