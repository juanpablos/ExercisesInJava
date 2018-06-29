package com.cc3002.patterns.visitor.ast.visitor;

import com.cc3002.patterns.visitor.ast.bool.AndExp;
import com.cc3002.patterns.visitor.ast.bool.Literal;
import com.cc3002.patterns.visitor.ast.bool.OrExp;

public class EvalVisitor implements Visitor {
    private boolean value;

    @Override
    public void visitLiteral(Literal l) {
        value = l.eval();
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
