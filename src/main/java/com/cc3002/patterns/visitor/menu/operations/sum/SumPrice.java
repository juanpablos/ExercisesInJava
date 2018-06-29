package com.cc3002.patterns.visitor.menu.operations.sum;

import com.cc3002.patterns.visitor.menu.FoodItem;
import com.cc3002.patterns.visitor.menu.FoodMenu;
import com.cc3002.patterns.visitor.menu.MenuComponent;

public abstract class SumPrice implements Sum {
    double price;

    @Override
    public void visitFoodMenu(FoodMenu foodMenu) {
        for (MenuComponent item : foodMenu.getItems()) {
            item.accept(this);
        }
    }

    @Override
    public abstract void visitFoodItem(FoodItem foodItem);

    @Override
    public double getPrice() {
        return price;
    }
}
