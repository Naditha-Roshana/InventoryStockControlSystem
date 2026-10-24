package com.inventory.util;

/** (id, label) pair used in combo boxes. */
public class Item {
    private final int id;
    private final String label;

    public Item(int id, String label) {
        this.id = id;
        this.label = label;
    }

    public int getId() { return id; }

    public String getLabel() { return label; }

    @Override
    public String toString() { return label; }
}
