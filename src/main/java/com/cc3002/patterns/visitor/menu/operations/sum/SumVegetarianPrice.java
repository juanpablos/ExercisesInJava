package com.cc3002.patterns.visitor.menu.operations.sum;

import com.cc3002.patterns.visitor.menu.FoodItem;

public class SumVegetarianPrice extends SumPrice {

    @Override
    public void visitFoodItem(FoodItem foodItem) {
        if (foodItem.isVegetarian()) {
            price += foodItem.getPrice();
        }
    }
}
