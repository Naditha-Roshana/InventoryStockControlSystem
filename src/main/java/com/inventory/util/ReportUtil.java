package com.inventory.util;

import com.inventory.db.DBConnection;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.InputStream;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

/** Compiles / fills Jasper reports and exports them to PDF and Excel. */
public class ReportUtil {

    private static final Logger log = LogManager.getLogger(ReportUtil.class);

    /** reportFile example: "stock_report.jrxml" (inside resources/reports). */
    public static JasperPrint fill(String reportFile) throws Exception {
        try (InputStream in = ReportUtil.class.getResourceAsStream("/reports/" + reportFile)) {
            JasperReport report = JasperCompileManager.compileReport(in);
            Map<String, Object> params = new HashMap<>();
            try (Connection con = DBConnection.getConnection()) {
                JasperPrint print = JasperFillManager.fillReport(report, params, con);
                log.info("Report generated: {}", reportFile);
                return print;
            }
        }
    }

    public static void view(JasperPrint print) {
        JasperViewer.viewReport(print, false);
    }

    public static void exportPdf(JasperPrint print, File file) throws Exception {
        JasperExportManager.exportReportToPdfFile(print, file.getAbsolutePath());
        log.info("Report exported to PDF: {}", file.getAbsolutePath());
    }

    public static void exportExcel(JasperPrint print, File file) throws Exception {
        JRXlsxExporter exporter = new JRXlsxExporter();
        exporter.setExporterInput(new SimpleExporterInput(print));
        exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(file));
        exporter.exportReport();
        log.info("Report exported to Excel: {}", file.getAbsolutePath());
    }
}
