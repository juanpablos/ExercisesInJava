package com.cc3002.patterns.visitor.menu.operations.search;

import com.cc3002.patterns.visitor.menu.FoodMenu;
import com.cc3002.patterns.visitor.menu.MenuComponent;

public class ItemNumberLessEq extends AbstractSearch {
    private int minNumber;

    public ItemNumberLessEq(int minNumber) {
        this.minNumber = minNumber;
    }

    @Override
    public void visitFoodMenu(FoodMenu foodMenu) {
        if (match(foodMenu)) {
            matching.add(foodMenu);
        }
        super.visitFoodMenu(foodMenu);
    }

    @Override
    public boolean match(MenuComponent menuComponent) {
        return ((FoodMenu) menuComponent).size() <= minNumber;
    }
}
