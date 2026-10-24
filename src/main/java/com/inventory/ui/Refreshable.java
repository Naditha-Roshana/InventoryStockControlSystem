package com.inventory.ui;

/** Screens implementing this reload their data every time they are opened. */
public interface Refreshable {
    void refresh();
}
