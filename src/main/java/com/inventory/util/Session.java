package com.inventory.util;

/** Keeps the logged-in user details. */
public class Session {
    public static int userId;
    public static String username;
    public static String fullName;
    public static String role;

    public static boolean isAdmin() {
        return "ADMIN".equals(role);
    }
}
