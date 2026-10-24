package com.inventory.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordUtilTest {

    @Test
    void sameInputGivesSameHash() {
        assertEquals(PasswordUtil.hash("admin123"), PasswordUtil.hash("admin123"));
    }

    @Test
    void differentInputGivesDifferentHash() {
        assertNotEquals(PasswordUtil.hash("admin123"), PasswordUtil.hash("admin124"));
    }

    @Test
    void knownHashMatchesDatabaseScript() {
        assertEquals("240be518fabd2724ddb6f04eeb1da5967448d7e831c08c8fa822809f74c720a9", PasswordUtil.hash("admin123"));
    }

    @Test
    void hashLengthIs64() {
        assertEquals(64, PasswordUtil.hash("anything").length());
    }
}
