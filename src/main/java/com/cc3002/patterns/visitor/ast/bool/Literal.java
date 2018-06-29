package com.cc3002.patterns.visitor.ast.bool;

import com.cc3002.patterns.visitor.ast.visitor.Visitor;

public class Literal implements BoolExp {
    private boolean value;

    public Literal(boolean value) {
        this.value = value;
    }

    @Override
    public boolean eval() {
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
