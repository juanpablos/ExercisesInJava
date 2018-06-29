package com.cc3002.patterns.visitor.menu.operations.search;

import com.cc3002.patterns.visitor.menu.FoodItem;
import com.cc3002.patterns.visitor.menu.FoodMenu;
import com.cc3002.patterns.visitor.menu.MenuComponent;

public abstract class ByPredicate extends AbstractSearch {
    String predicate;

    public ByPredicate(String predicate) {
        this.predicate = predicate;
    }

    @Override
    public void visitFoodMenu(FoodMenu foodMenu) {
        if (match(foodMenu)) {
            matching.add(foodMenu);
        }
        super.visitFoodMenu(foodMenu);
    }

    @Override
    public void visitFoodItem(FoodItem foodItem) {
        if (match(foodItem)) {
            matching.add(foodItem);
        }
    }

    @Override
    public abstract boolean match(MenuComponent menuComponent);
}
