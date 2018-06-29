package com.cc3002.patterns.visitor.ast.bool;

import com.cc3002.patterns.visitor.ast.visitor.Visitor;

public interface BoolExp {
    boolean eval();

    void accept(Visitor v);
}
