package com.inventory.ui;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamResolution;
import com.inventory.util.BarcodeScanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;

/**
 * Opens the laptop camera, shows live preview and closes automatically
 * when a barcode is detected.   Usage:  String code = CameraScanDialog.scan(this);
 */
public class CameraScanDialog extends JDialog {

    private static final Logger log = LogManager.getLogger(CameraScanDialog.class);

    private final JLabel lblPreview = new JLabel("Starting camera...", SwingConstants.CENTER);
    private volatile boolean running = true;
    private volatile String result;
    private Webcam webcam;

    private CameraScanDialog(Window owner) {
        super(owner, "Scan Barcode with Camera", ModalityType.APPLICATION_MODAL);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        lblPreview.setPreferredSize(new Dimension(640, 480));
        lblPreview.setOpaque(true);
        lblPreview.setBackground(Color.BLACK);
        lblPreview.setForeground(Color.WHITE);

        JLabel hint = new JLabel("Hold the barcode in front of the camera (good light, keep it flat and steady).",
                SwingConstants.CENTER);
        hint.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));

        JButton btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(e -> stop());
        JPanel bottom = new JPanel(new FlowLayout(FlowLayout.CENTER));
        bottom.add(btnCancel);

        add(hint, BorderLayout.NORTH);
        add(lblPreview, BorderLayout.CENTER);
        add(bottom, BorderLayout.SOUTH);
        Theme.apply((Container) getContentPane(), Theme.BG);
        lblPreview.setForeground(Color.WHITE);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                startCamera();
            }

            @Override
            public void windowClosing(WindowEvent e) {
                stop();
            }
        });
        pack();
        setLocationRelativeTo(owner);
    }

    /** Shows the dialog. Returns the scanned code, or null if cancelled / failed. */
    public static String scan(Component parent) {
        CameraScanDialog dialog = new CameraScanDialog(SwingUtilities.getWindowAncestor(parent));
        dialog.setVisible(true);   // blocks until closed
        return dialog.result;
    }

    private void stop() {
        running = false;
        dispose();
    }

    private void startCamera() {
        Thread t = new Thread(() -> {
            try {
                webcam = Webcam.getDefault();
                if (webcam == null) {
                    fail("No camera was found on this computer.");
                    return;
                }
                webcam.setViewSize(WebcamResolution.VGA.getSize());
                webcam.open();
                log.info("Camera opened: {}", webcam.getName());

                while (running) {
                    BufferedImage frame = webcam.getImage();
                    if (frame == null) {
                        Thread.sleep(50);
                        continue;
                    }
                    final BufferedImage shown = frame;
                    SwingUtilities.invokeLater(() -> {
                        lblPreview.setText("");
                        lblPreview.setIcon(new ImageIcon(shown));
                    });

                    String code = BarcodeScanner.decode(frame);
                    if (code != null) {
                        log.info("Barcode scanned by camera: {}", code);
                        result = code;
                        running = false;
                        SwingUtilities.invokeLater(this::dispose);
                    } else {
                        Thread.sleep(30);
                    }
                }
            } catch (Throwable ex) {
                log.error("Camera error", ex);
                fail("Cannot use the camera:\n" + ex.getMessage()
                        + "\n\nCheck that no other app is using it and that Windows camera access is allowed.");
            } finally {
                closeCamera();
            }
        }, "camera-scan");
        t.setDaemon(true);
        t.start();
    }

    private void fail(String message) {
        running = false;
        SwingUtilities.invokeLater(() -> {
            JOptionPane.showMessageDialog(this, message, "Camera", JOptionPane.ERROR_MESSAGE);
            dispose();
        });
    }

    private void closeCamera() {
        try {
            if (webcam != null && webcam.isOpen()) {
                webcam.close();
            }
        } catch (Throwable ignored) {
            // nothing more to do
        }
    }
}