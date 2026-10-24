package com.inventory.ui;

import com.inventory.util.ReportUtil;
import net.sf.jasperreports.engine.JasperPrint;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.io.File;

/** Reports screen: view, export to PDF, export to Excel. */
public class ReportPanel extends JPanel {

    private static final Logger log = LogManager.getLogger(ReportPanel.class);

    private static final String[] NAMES = {"Current Stock Report", "Low Stock Report", "Stock Transactions Report"};
    private static final String[] FILES = {"stock_report.jrxml", "low_stock_report.jrxml", "transactions_report.jrxml"};
    private static final String[] OUT = {"stock_report", "low_stock_report", "transactions_report"};

    private final JComboBox<String> cmbReport = new JComboBox<>(NAMES);

    public ReportPanel() {
        setLayout(new BorderLayout());
        setBorder(new EmptyBorder(15, 15, 15, 15));

        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT, 15, 15));
        p.setBorder(BorderFactory.createTitledBorder("Reports"));
        JButton btnView = new JButton("View Report");
        JButton btnPdf = new JButton("Export to PDF");
        JButton btnExcel = new JButton("Export to Excel");
        p.add(new JLabel("Select Report:"));
        p.add(cmbReport);
        p.add(btnView);
        p.add(btnPdf);
        p.add(btnExcel);
        add(p, BorderLayout.NORTH);

        btnView.addActionListener(e -> view());
        btnPdf.addActionListener(e -> export(true));
        btnExcel.addActionListener(e -> export(false));
    }

    private JasperPrint build() {
        try {
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            return ReportUtil.fill(FILES[cmbReport.getSelectedIndex()]);
        } catch (Exception ex) {
            log.error("Report generation failed", ex);
            JOptionPane.showMessageDialog(this, "Cannot generate report:\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        } finally {
            setCursor(Cursor.getDefaultCursor());
        }
    }

    private void view() {
        JasperPrint print = build();
        if (print != null) ReportUtil.view(print);
    }

    private void export(boolean pdf) {
        JasperPrint print = build();
        if (print == null) return;
        JFileChooser fc = new JFileChooser();
        fc.setSelectedFile(new File(OUT[cmbReport.getSelectedIndex()] + (pdf ? ".pdf" : ".xlsx")));
        if (fc.showSaveDialog(this) != JFileChooser.APPROVE_OPTION) return;
        try {
            if (pdf) {
                ReportUtil.exportPdf(print, fc.getSelectedFile());
            } else {
                ReportUtil.exportExcel(print, fc.getSelectedFile());
            }
            JOptionPane.showMessageDialog(this, "Report exported:\n" + fc.getSelectedFile().getAbsolutePath());
        } catch (Exception ex) {
            log.error("Report export failed", ex);
            JOptionPane.showMessageDialog(this, "Export failed:\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
