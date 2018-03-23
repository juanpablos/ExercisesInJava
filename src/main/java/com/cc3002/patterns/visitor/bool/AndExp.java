package com.cc3002.patterns.visitor.bool;

import com.cc3002.patterns.visitor.visitor.Visitor;

public class AndExp implements BoolExp {

    private BoolExp left, right;

    public AndExp(BoolExp left, BoolExp right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean getValue() {
        if (left.getValue()) {
            return right.getValue();
        }
        return false;
    }

    @Override
    public void accept(Visitor v) {
        v.visitAnd(this);
    }

    public BoolExp getLeft() {
        return left;
    }

    public BoolExp getRight() {
        return right;
    }

}
