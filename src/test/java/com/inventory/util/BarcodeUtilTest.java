package com.inventory.util;

import org.junit.jupiter.api.Test;

import java.awt.image.BufferedImage;

import static org.junit.jupiter.api.Assertions.*;

class BarcodeUtilTest {

    @Test
    void barcodeImageIsGenerated() {
        BufferedImage img = BarcodeUtil.generate("ELE001", 200, 60);
        assertNotNull(img);
        assertTrue(img.getWidth() >= 200);
        assertEquals(60, img.getHeight());
    }
}
