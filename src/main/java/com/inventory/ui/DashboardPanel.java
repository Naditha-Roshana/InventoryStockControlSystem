package com.inventory.ui;

import com.inventory.db.DBHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.SQLException;

/** Home screen with summary numbers and the low stock list. */
public class DashboardPanel extends JPanel implements Refreshable {

    private static final Logger log = LogManager.getLogger(DashboardPanel.class);

    private final JLabel lblProducts = card();
    private final JLabel lblCategories = card();
    private final JLabel lblSuppliers = card();
    private final JLabel lblLow = card();
    private final JLabel lblValue = card();
    private final DefaultTableModel model = new DefaultTableModel(
            new String[]{"Code", "Product", "Quantity", "Reorder Level"}, 0) {
        @Override
        public boolean isCellEditable(int r, int c) {
            return false;
        }
    };

    public DashboardPanel() {
        setLayout(new BorderLayout(10, 15));
        setBorder(new EmptyBorder(15, 15, 15, 15));

        JPanel cards = new JPanel(new GridLayout(1, 5, 10, 10));
        cards.add(wrap("Products", lblProducts, Theme.PRIMARY));
        cards.add(wrap("Categories", lblCategories, Theme.SUCCESS));
        cards.add(wrap("Suppliers", lblSuppliers, Theme.WARNING));
        cards.add(wrap("Low Stock Items", lblLow, Theme.DANGER));
        cards.add(wrap("Stock Value (Cost)", lblValue, Theme.NAVY));

        JTable tbl = new JTable(model);
        tbl.setRowHeight(24);
        JPanel low = new JPanel(new BorderLayout());
        low.setBorder(BorderFactory.createTitledBorder("Items at or below reorder level"));
        low.add(new JScrollPane(tbl), BorderLayout.CENTER);

        add(cards, BorderLayout.NORTH);
        add(low, BorderLayout.CENTER);
        refresh();
    }

    private static JLabel card() {
        JLabel l = new JLabel("0", SwingConstants.CENTER);
        l.setFont(new Font("Segoe UI", Font.BOLD, 26));
        l.putClientProperty("keep", true);
        return l;
    }

    private JPanel wrap(String title, JLabel value, Color accent) {
        JPanel p = new JPanel(new BorderLayout());
        p.putClientProperty("accent", accent);
        value.setForeground(accent);
        p.setBorder(BorderFactory.createTitledBorder(title));
        p.setPreferredSize(new Dimension(150, 90));
        p.add(value, BorderLayout.CENTER);
        return p;
    }

    @Override
    public void refresh() {
        try {
            lblProducts.setText(String.valueOf(DBHelper.scalar("SELECT COUNT(*) FROM products")));
            lblCategories.setText(String.valueOf(DBHelper.scalar("SELECT COUNT(*) FROM categories")));
            lblSuppliers.setText(String.valueOf(DBHelper.scalar("SELECT COUNT(*) FROM suppliers")));
            lblLow.setText(String.valueOf(DBHelper.scalar("SELECT COUNT(*) FROM products WHERE quantity <= reorder_level")));
            Object value = DBHelper.scalar("SELECT COALESCE(SUM(quantity * cost_price), 0) FROM products");
            lblValue.setText(String.format("%,.2f", Double.parseDouble(String.valueOf(value))));
            DBHelper.loadTable(model, "SELECT code, name, quantity, reorder_level FROM products "
                    + "WHERE quantity <= reorder_level ORDER BY quantity");
        } catch (SQLException ex) {
            log.error("Dashboard load failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
