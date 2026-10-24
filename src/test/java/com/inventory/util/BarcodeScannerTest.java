package com.inventory.util;

import org.junit.jupiter.api.Test;

import java.awt.image.BufferedImage;

import static org.junit.jupiter.api.Assertions.*;

class BarcodeScannerTest {

    @Test
    void generatedBarcodeCanBeReadBack() {
        BufferedImage img = BarcodeUtil.generate("ELE001", 400, 110);
        assertEquals("ELE001", BarcodeScanner.decode(img));
    }

    @Test
    void imageWithoutBarcodeReturnsNull() {
        BufferedImage blank = new BufferedImage(200, 100, BufferedImage.TYPE_INT_RGB);
        assertNull(BarcodeScanner.decode(blank));
    }
}