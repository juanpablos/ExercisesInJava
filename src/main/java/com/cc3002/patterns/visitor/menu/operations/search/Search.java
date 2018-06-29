package com.cc3002.patterns.visitor.menu.operations.search;

import com.cc3002.patterns.visitor.menu.MenuComponent;
import com.cc3002.patterns.visitor.menu.operations.Visitor;

import java.util.List;

public interface Search extends Visitor {
    boolean match(MenuComponent menuComponent);

    List<MenuComponent> getMatching();
}
