package com.cc3002.patterns.visitor.menu.operations.search;

import com.cc3002.patterns.visitor.menu.MenuComponent;

public class ExactSearch extends ByPredicate {
    public ExactSearch(String predicate) {
        super(predicate);
    }

    @Override
    public boolean match(MenuComponent menuComponent) {
        return menuComponent.getName().equals(predicate);
    }
}
