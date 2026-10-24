package com.inventory.db;

import com.inventory.util.Item;

import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/** Small helper methods so every screen does not repeat the same JDBC code. */
public class DBHelper {

    private static void bind(PreparedStatement ps, Object... params) throws SQLException {
        for (int i = 0; i < params.length; i++) {
            ps.setObject(i + 1, params[i]);
        }
    }

    /** Runs a SELECT and fills the table model with the result. */
    public static void loadTable(DefaultTableModel model, String sql, Object... params) throws SQLException {
        model.setRowCount(0);
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            bind(ps, params);
            try (ResultSet rs = ps.executeQuery()) {
                int cols = rs.getMetaData().getColumnCount();
                while (rs.next()) {
                    Object[] row = new Object[cols];
                    for (int i = 0; i < cols; i++) {
                        row[i] = rs.getObject(i + 1);
                    }
                    model.addRow(row);
                }
            }
        }
    }

    /** Runs INSERT / UPDATE / DELETE. Returns affected rows. */
    public static int execute(String sql, Object... params) throws SQLException {
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            bind(ps, params);
            return ps.executeUpdate();
        }
    }

    /** Returns the first column of the first row (or null). */
    public static Object scalar(String sql, Object... params) throws SQLException {
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            bind(ps, params);
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next() ? rs.getObject(1) : null;
            }
        }
    }

    /** Loads (id, label) pairs for combo boxes. SQL must select id then label. */
    public static List<Item> items(String sql) throws SQLException {
        List<Item> list = new ArrayList<>();
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                list.add(new Item(rs.getInt(1), rs.getString(2)));
            }
        }
        return list;
    }

    /** Converts common MySQL errors to a user friendly message. */
    public static String friendlyMessage(SQLException e) {
        switch (e.getErrorCode()) {
            case 1062: return "This record already exists (duplicate value).";
            case 1451: return "This record is being used by other data and cannot be deleted.";
            case 1452: return "A related record was not found.";
            case 1045: return "Database login failed. Check db.properties.";
            default:   return "Database error: " + e.getMessage();
        }
    }
}
