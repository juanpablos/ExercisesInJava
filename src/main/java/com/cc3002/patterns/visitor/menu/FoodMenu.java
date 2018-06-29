package com.cc3002.patterns.visitor.menu;

import com.cc3002.patterns.visitor.menu.operations.Visitor;

import java.util.ArrayList;
import java.util.List;

public class FoodMenu implements Menu {
    private String name;
    private List<MenuComponent> items = new ArrayList<>();

    public FoodMenu(String name) {
        this.name = name;
    }

    @Override
    public long size() {
        return items.size();
    }

    @Override
    public void addItem(MenuComponent menuComponent) {
        items.add(menuComponent);
    }

    @Override
    public List<MenuComponent> getItems() {
        return items;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitFoodMenu(this);
    }

    @Override
    public String toString() {
        return "FoodMenu{" +
                "name='" + name + '\'' +
                '}';
    }
}
