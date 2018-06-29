package com.cc3002.patterns.visitor.menu;

import com.cc3002.patterns.visitor.menu.operations.Visitor;

public interface MenuComponent {
    String getName();

    void accept(Visitor visitor);
}
