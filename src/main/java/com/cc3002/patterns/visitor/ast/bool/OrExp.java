package com.cc3002.patterns.visitor.ast.bool;

import com.cc3002.patterns.visitor.ast.visitor.Visitor;

public class OrExp implements BoolExp {
    private BoolExp left, right;

    public OrExp(BoolExp left, BoolExp right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean eval() {
        if (left.eval()) {
            return true;
        }
        return right.eval();
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
