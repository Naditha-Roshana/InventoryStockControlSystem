package com.inventory.util;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.Code128Writer;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;

/** Generates Code128 barcodes using ZXing and prints barcode labels. */
public class BarcodeUtil {

    public static BufferedImage generate(String text, int width, int height) {
        BitMatrix matrix = new Code128Writer().encode(text, BarcodeFormat.CODE_128, width, height);
        return MatrixToImageWriter.toBufferedImage(matrix);
    }

    public static void saveAsPng(String text, File file) throws Exception {
        ImageIO.write(generate(text, 300, 100), "png", file);
    }

    /**
     * Prints barcode labels (product name + barcode + code + optional price).
     *
     * @param priceText text printed on the label, or null to skip the price line
     * @param copies    total number of labels
     * @param cols      labels per row on one page   (1 = single label per page)
     * @param rows      label rows on one page       (1 = single label per page)
     * @return false if the user cancelled the print dialog
     */
    public static boolean print(String code, String productName, String priceText,
                                int copies, int cols, int rows) throws PrinterException {
        final BufferedImage img = generate(code, 600, 160);   // high resolution for sharp bars
        final int perPage = cols * rows;
        final int pages = (copies + perPage - 1) / perPage;
        final String name = productName == null ? "" : productName;

        PrinterJob job = PrinterJob.getPrinterJob();
        job.setJobName("Barcode - " + code);
        job.setPrintable((Graphics g, PageFormat pf, int pageIndex) -> {
            if (pageIndex >= pages) {
                return Printable.NO_SUCH_PAGE;
            }
            Graphics2D g2 = (Graphics2D) g;
            g2.translate(pf.getImageableX(), pf.getImageableY());
            g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

            int cellW = (int) (pf.getImageableWidth() / cols);
            int cellH = (int) (pf.getImageableHeight() / rows);

            for (int k = 0; k < perPage; k++) {
                int n = pageIndex * perPage + k;
                if (n >= copies) break;
                int col = k % cols;
                int row = k / cols;
                drawLabel(g2, img, code, name, priceText, col * cellW, row * cellH, cellW, cellH, perPage > 1);
            }
            return Printable.PAGE_EXISTS;
        });

        if (job.printDialog()) {      // choose printer (or "Microsoft Print to PDF")
            job.print();
            return true;
        }
        return false;
    }

    /** Draws one label inside the rectangle (x, y, w, h). */
    private static void drawLabel(Graphics2D g2, BufferedImage img, String code, String name, String price,
                                  int x, int y, int w, int h, boolean border) {
        if (border) {                                  // thin guide line for cutting
            g2.setColor(Color.LIGHT_GRAY);
            g2.drawRect(x, y, w - 1, h - 1);
        }
        g2.setColor(Color.BLACK);

        int size = border ? 8 : 11;                    // smaller text on sheet labels
        Font nameFont = new Font("SansSerif", Font.BOLD, size);
        Font codeFont = new Font("Monospaced", Font.PLAIN, size);
        Font priceFont = new Font("SansSerif", Font.BOLD, size + 1);
        FontMetrics nf = g2.getFontMetrics(nameFont);
        FontMetrics cf = g2.getFontMetrics(codeFont);
        FontMetrics pf = g2.getFontMetrics(priceFont);

        int pad = 6;
        int maxW = w - 2 * pad;
        int barW = Math.min(maxW, 220);
        int barH = barW * 160 / 600;                   // keep aspect ratio

        int textH = nf.getHeight() + cf.getHeight() + (price != null ? pf.getHeight() : 0) + 6;
        if (barH + textH > h - 2 * pad) {              // shrink bars if the label is small
            barH = Math.max(20, h - 2 * pad - textH);
        }
        int total = barH + textH;
        int yy = y + Math.max(pad, (h - total) / 2);   // vertically centred

        // product name
        g2.setFont(nameFont);
        drawCentered(g2, fit(name, nf, maxW), nf, x, w, yy + nf.getAscent());
        yy += nf.getHeight() + 2;

        // barcode
        g2.drawImage(img, x + (w - barW) / 2, yy, barW, barH, null);
        yy += barH + 2;

        // code text
        g2.setFont(codeFont);
        drawCentered(g2, code, cf, x, w, yy + cf.getAscent());
        yy += cf.getHeight() + 2;

        // price
        if (price != null) {
            g2.setFont(priceFont);
            drawCentered(g2, fit(price, pf, maxW), pf, x, w, yy + pf.getAscent());
        }
    }

    private static void drawCentered(Graphics2D g2, String text, FontMetrics fm, int x, int w, int baseline) {
        g2.drawString(text, x + Math.max(0, (w - fm.stringWidth(text)) / 2), baseline);
    }

    /** Cuts the text with "..." if it is wider than maxW. */
    private static String fit(String s, FontMetrics fm, int maxW) {
        if (fm.stringWidth(s) <= maxW) return s;
        while (s.length() > 1 && fm.stringWidth(s + "...") > maxW) {
            s = s.substring(0, s.length() - 1);
        }
        return s + "...";
    }
}