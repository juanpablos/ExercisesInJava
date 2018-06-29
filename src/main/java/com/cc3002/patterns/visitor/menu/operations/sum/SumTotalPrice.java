package com.cc3002.patterns.visitor.menu.operations.sum;

import com.cc3002.patterns.visitor.menu.FoodItem;

public class SumTotalPrice extends SumPrice {

    @Override
    public void visitFoodItem(FoodItem foodItem) {
        price += foodItem.getPrice();
    }
}
