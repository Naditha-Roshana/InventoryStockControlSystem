package com.inventory.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    void emptyStringsAreDetected() {
        assertTrue(Validator.isEmpty(null));
        assertTrue(Validator.isEmpty("   "));
        assertFalse(Validator.isEmpty("abc"));
    }

    @Test
    void emailValidation() {
        assertTrue(Validator.isEmail("user@example.com"));
        assertFalse(Validator.isEmail("user@"));
        assertFalse(Validator.isEmail("not-an-email"));
    }

    @Test
    void phoneValidation() {
        assertTrue(Validator.isPhone("0771234567"));
        assertFalse(Validator.isPhone("12ab"));
    }

    @Test
    void quantityValidation() {
        assertTrue(Validator.isPositiveInt("5"));
        assertFalse(Validator.isPositiveInt("0"));
        assertFalse(Validator.isPositiveInt("-3"));
        assertFalse(Validator.isPositiveInt("abc"));
        assertTrue(Validator.isNonNegativeInt("0"));
    }

    @Test
    void priceValidation() {
        assertTrue(Validator.isNonNegativeDecimal("1250.50"));
        assertFalse(Validator.isNonNegativeDecimal("-1"));
        assertFalse(Validator.isNonNegativeDecimal("abc"));
    }

    @Test
    void dateValidation() {
        assertTrue(Validator.isValidDate("2026-10-08"));
        assertFalse(Validator.isValidDate("08/10/2026"));
    }
}
