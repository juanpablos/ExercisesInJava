package com.cc3002.patterns.visitor.menu.operations;

import com.cc3002.patterns.visitor.menu.FoodItem;
import com.cc3002.patterns.visitor.menu.FoodMenu;

public interface Visitor {
    void visitFoodMenu(FoodMenu foodMenu);

    void visitFoodItem(FoodItem foodItem);
}
