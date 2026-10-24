package com.inventory.ui;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.util.Enumeration;

/**
 * Central place for all colours and styles of the application.
 * Call Theme.apply(container, background) once after a screen is built.
 */
public class Theme {

    // ---- colour palette ----
    public static final Color BG        = new Color(0xF1F5F9);   // window background
    public static final Color WHITE     = Color.WHITE;
    public static final Color TEXT      = new Color(0x1E293B);
    public static final Color BORDER    = new Color(0xCBD5E1);
    public static final Color NAVY      = new Color(0x1E3A8A);   // header / table header
    public static final Color SIDEBAR   = new Color(0x1E293B);
    public static final Color PRIMARY   = new Color(0x2563EB);   // blue
    public static final Color SUCCESS   = new Color(0x16A34A);   // green
    public static final Color DANGER    = new Color(0xDC2626);   // red
    public static final Color WARNING   = new Color(0xEA580C);   // orange
    public static final Color NEUTRAL   = new Color(0x64748B);   // grey
    public static final Color ROW_ALT   = new Color(0xF8FAFC);
    public static final Color SELECTION = new Color(0xDBEAFE);

    /** Set a nicer default font for all Swing components. Call once at startup. */
    public static void init() {
        Font base = new Font("Segoe UI", Font.PLAIN, 13);
        Enumeration<Object> keys = UIManager.getDefaults().keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            if (key.toString().endsWith(".font")) {
                UIManager.put(key, new FontUIResource(base));
            }
        }
    }

    // ================= main entry =================

    /** Styles every component inside the container (recursively). */
    public static void apply(Container c, Color bg) {
        if (c instanceof JPanel) {
            JPanel p = (JPanel) c;
            Color accent = (Color) p.getClientProperty("accent");
            if (p.getBorder() instanceof TitledBorder) {
                TitledBorder old = (TitledBorder) p.getBorder();
                Color line = accent != null ? accent : BORDER;
                TitledBorder tb = BorderFactory.createTitledBorder(new LineBorder(line, accent != null ? 2 : 1, true), old.getTitle());
                tb.setTitleColor(accent != null ? accent : NAVY);
                tb.setTitleFont(new Font("Segoe UI", Font.BOLD, 13));
                p.setBorder(tb);
                bg = WHITE;
            }
            p.setBackground(bg);
        }
        for (Component k : c.getComponents()) {
            if (k instanceof JButton) {
                styleButton((JButton) k);
            } else if (k instanceof JTable) {
                styleTable((JTable) k);
            } else if (k instanceof JTextField) {
                styleField((JTextField) k);
            } else if (k instanceof JLabel) {
                JLabel l = (JLabel) k;
                if (l.getClientProperty("keep") == null) l.setForeground(TEXT);
            } else if (k instanceof JCheckBox) {
                k.setBackground(bg);
                k.setForeground(TEXT);
            } else if (k instanceof JScrollPane) {
                JScrollPane sp = (JScrollPane) k;
                sp.setBorder(new LineBorder(BORDER));
                sp.getViewport().setBackground(WHITE);
            } else if (k instanceof JTextArea) {
                ((JTextArea) k).setMargin(new Insets(8, 8, 8, 8));
            }
            // do not go inside combo boxes / scroll bars / tables (they contain internal components)
            if (k instanceof Container && !(k instanceof JComboBox) && !(k instanceof JScrollBar)
                    && !(k instanceof JTable) && !(k instanceof JButton)) {
                apply((Container) k, bg);
            }
        }
    }

    // ================= buttons =================

    private static Color colorFor(String text) {
        String t = text == null ? "" : text.toLowerCase();
        if (t.contains("delete") || t.equals("exit")) return DANGER;
        if (t.startsWith("add") || t.startsWith("save") || t.startsWith("apply")) return SUCCESS;
        if (t.contains("restore")) return WARNING;
        if (t.equals("clear") || t.equals("show all")) return NEUTRAL;
        return PRIMARY;   // update, search, view, export, generate, backup, login
    }

    public static void styleButton(JButton b) {
        paintButton(b, colorFor(b.getText()), Color.WHITE);
        b.setBorder(new EmptyBorder(7, 16, 7, 16));
    }

    /** Left menu button. active = currently opened screen. */
    public static void styleMenuButton(JButton b, boolean active) {
        paintButton(b, active ? PRIMARY : SIDEBAR, Color.WHITE);
        b.setHorizontalAlignment(SwingConstants.LEFT);
        b.setBorder(new EmptyBorder(10, 16, 10, 16));
    }

    public static void styleLogoutButton(JButton b) {
        paintButton(b, DANGER, Color.WHITE);
        b.setHorizontalAlignment(SwingConstants.LEFT);
        b.setBorder(new EmptyBorder(10, 16, 10, 16));
    }

    private static void paintButton(JButton b, Color bg, Color fg) {
        b.setUI(new RoundedButtonUI());
        b.setBackground(bg);
        b.setForeground(fg);
        b.setFont(new Font("Segoe UI", Font.BOLD, 13));
        b.setOpaque(false);
        b.setContentAreaFilled(false);
        b.setBorderPainted(false);
        b.setFocusPainted(false);
        b.setRolloverEnabled(true);
        b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    /** Paints a rounded coloured button (works on every look and feel). */
    private static class RoundedButtonUI extends BasicButtonUI {
        @Override
        public void paint(Graphics g, JComponent c) {
            AbstractButton b = (AbstractButton) c;
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            Color color = b.getBackground();
            if (!b.isEnabled()) {
                color = BORDER;
            } else if (b.getModel().isPressed()) {
                color = color.darker();
            } else if (b.getModel().isRollover()) {
                color = blend(color, Color.WHITE, 0.18f);
            }
            g2.setColor(color);
            g2.fillRoundRect(0, 0, c.getWidth(), c.getHeight(), 10, 10);
            g2.dispose();
            super.paint(g, c);
        }
    }

    private static Color blend(Color a, Color b, float ratio) {
        int r = (int) (a.getRed() * (1 - ratio) + b.getRed() * ratio);
        int g = (int) (a.getGreen() * (1 - ratio) + b.getGreen() * ratio);
        int bl = (int) (a.getBlue() * (1 - ratio) + b.getBlue() * ratio);
        return new Color(r, g, bl);
    }

    // ================= text fields =================

    public static void styleField(JTextField f) {
        f.setBorder(new CompoundBorder(new LineBorder(BORDER, 1, true), new EmptyBorder(5, 8, 5, 8)));
        if (f.isEditable()) {
            f.setBackground(WHITE);
        } else {
            f.setBackground(new Color(0xE2E8F0));   // read-only fields look grey
        }
        f.setForeground(TEXT);
    }

    // ================= tables =================

    public static void styleTable(JTable t) {
        t.setRowHeight(28);
        t.setShowGrid(false);
        t.setIntercellSpacing(new Dimension(0, 0));
        t.setSelectionBackground(SELECTION);
        t.setSelectionForeground(TEXT);
        t.setFillsViewportHeight(true);

        t.setDefaultRenderer(Object.class, new RowRenderer(false));
        t.setDefaultRenderer(Number.class, new RowRenderer(true));
        t.setDefaultRenderer(java.util.Date.class, new RowRenderer(false));

        JTableHeader h = t.getTableHeader();
        h.setReorderingAllowed(false);
        h.setPreferredSize(new Dimension(0, 34));
        h.setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean sel,
                                                           boolean focus, int row, int col) {
                super.getTableCellRendererComponent(table, value, false, false, row, col);
                setBackground(NAVY);
                setForeground(Color.WHITE);
                setFont(new Font("Segoe UI", Font.BOLD, 13));
                setOpaque(true);
                setBorder(new EmptyBorder(0, 8, 0, 8));
                setHorizontalAlignment(SwingConstants.LEFT);
                return this;
            }
        });
    }

    /** Alternating row colours. */
    private static class RowRenderer extends DefaultTableCellRenderer {
        private final boolean right;

        RowRenderer(boolean right) {
            this.right = right;
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean sel,
                                                       boolean focus, int row, int col) {
            super.getTableCellRendererComponent(table, value, sel, false, row, col);
            setBorder(new EmptyBorder(0, 8, 0, 8));
            setHorizontalAlignment(right ? SwingConstants.RIGHT : SwingConstants.LEFT);
            setForeground(TEXT);
            if (!sel) {
                setBackground(row % 2 == 0 ? WHITE : ROW_ALT);
            }
            return this;
        }
    }
}
