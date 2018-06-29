package com.cc3002.patterns.visitor.menu;

import com.cc3002.patterns.visitor.menu.operations.Visitor;

public class FoodItem implements MenuItem {
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public FoodItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitFoodItem(this);
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", vegetarian=" + vegetarian +
                ", price=" + price +
                '}';
    }
}
