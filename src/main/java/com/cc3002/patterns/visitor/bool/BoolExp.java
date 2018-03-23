package com.cc3002.patterns.visitor.bool;

import com.cc3002.patterns.visitor.visitor.Visitor;

public interface BoolExp {
    boolean getValue();

    void accept(Visitor v);
}
