package com.cc3002.patterns.visitor.visitor;

import com.cc3002.patterns.visitor.bool.AndExp;
import com.cc3002.patterns.visitor.bool.Literal;
import com.cc3002.patterns.visitor.bool.OrExp;

public class EvalVisitor implements Visitor {

    private boolean value;

    @Override
    public void visitLiteral(Literal l) {
        value = l.getValue();
    }

    @Override
    public void visitAnd(AndExp and) {
        and.getLeft().accept(this);
        if (!value) {
            value = false;
            return;
        }
        boolean left = value;
        and.getRight().accept(this);
        boolean right = value;
        value = left && right;
    }

    @Override
    public void visitOr(OrExp or) {
        or.getLeft().accept(this);
        if (value) return;
        or.getRight().accept(this);
    }

    public boolean getValue() {
        return value;
    }
}
