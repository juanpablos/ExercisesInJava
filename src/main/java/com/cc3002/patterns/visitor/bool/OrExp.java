package com.cc3002.patterns.visitor.bool;

import com.cc3002.patterns.visitor.visitor.Visitor;

public class OrExp implements BoolExp {
    private BoolExp left, right;

    public OrExp(BoolExp left, BoolExp right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean getValue() {
        if (left.getValue()) {
            return true;
        }
        return right.getValue();
    }

    @Override
    public void accept(Visitor v) {
        v.visitOr(this);
    }

    public BoolExp getLeft() {
        return left;
    }

    public BoolExp getRight() {
        return right;
    }


}
