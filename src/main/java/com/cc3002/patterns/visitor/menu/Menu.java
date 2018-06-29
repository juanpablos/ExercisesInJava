package com.cc3002.patterns.visitor.menu;

import java.util.List;

public interface Menu extends MenuComponent {
    long size();

    void addItem(MenuComponent menuComponent);

    List<MenuComponent> getItems();
}
