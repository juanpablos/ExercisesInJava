package com.cc3002.patterns.visitor.bool;

import com.cc3002.patterns.visitor.visitor.Visitor;

public class Literal implements BoolExp {

    private boolean value;

    public Literal(boolean value) {
        this.value = value;
    }

    @Override
    public boolean getValue() {
        return value;
    }

    @Override
    public void accept(Visitor v) {
        v.visitLiteral(this);
    }

    @Override
    public String toString() {
        return "" + value;
    }

}
