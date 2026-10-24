package com.inventory.util;

import java.time.LocalDate;

/** Input validation helpers. */
public class Validator {

    public static boolean isEmpty(String s) {
        return s == null || s.trim().isEmpty();
    }

    public static boolean isEmail(String s) {
        return s != null && s.trim().matches("^[\\w.+-]+@[\\w-]+(\\.[\\w-]+)+$");
    }

    public static boolean isPhone(String s) {
        return s != null && s.trim().matches("^[0-9+\\-\\s]{7,15}$");
    }

    /** Whole number greater than zero. */
    public static boolean isPositiveInt(String s) {
        try {
            return Integer.parseInt(s.trim()) > 0;
        } catch (Exception e) {
            return false;
        }
    }

    /** Whole number zero or more. */
    public static boolean isNonNegativeInt(String s) {
        try {
            return Integer.parseInt(s.trim()) >= 0;
        } catch (Exception e) {
            return false;
        }
    }

    /** Decimal number zero or more. */
    public static boolean isNonNegativeDecimal(String s) {
        try {
            return Double.parseDouble(s.trim()) >= 0;
        } catch (Exception e) {
            return false;
        }
    }

    /** Date in yyyy-MM-dd format. */
    public static boolean isValidDate(String s) {
        try {
            LocalDate.parse(s.trim());
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
