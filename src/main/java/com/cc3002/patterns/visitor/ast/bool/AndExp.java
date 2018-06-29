package com.cc3002.patterns.visitor.ast.bool;

import com.cc3002.patterns.visitor.ast.visitor.Visitor;

public class AndExp implements BoolExp {
    private BoolExp left, right;

    public AndExp(BoolExp left, BoolExp right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean eval() {
        if (left.eval()) {
            return right.eval();
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
