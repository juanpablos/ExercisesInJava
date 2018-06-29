package com.cc3002.patterns.visitor.menu;

public interface MenuItem extends MenuComponent {
    String getDescription();

    double getPrice();

    boolean isVegetarian();
}
