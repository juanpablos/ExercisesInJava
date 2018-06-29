package com.cc3002.patterns.visitor.menu.operations.search;

import com.cc3002.patterns.visitor.menu.FoodItem;
import com.cc3002.patterns.visitor.menu.FoodMenu;
import com.cc3002.patterns.visitor.menu.MenuComponent;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSearch implements Search {
    List<MenuComponent> matching = new ArrayList<>();

    @Override
    public void visitFoodMenu(FoodMenu foodMenu) {
        for (MenuComponent item : foodMenu.getItems()) {
            item.accept(this);
        }
    }

    @Override
    public void visitFoodItem(FoodItem foodItem) {

    }

    @Override
    public abstract boolean match(MenuComponent menuComponent);

    @Override
    public List<MenuComponent> getMatching() {
        return matching;
    }
}
