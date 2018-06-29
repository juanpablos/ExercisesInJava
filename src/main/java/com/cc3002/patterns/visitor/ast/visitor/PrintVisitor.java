package com.cc3002.patterns.visitor.ast.visitor;

import com.cc3002.patterns.visitor.ast.bool.AndExp;
import com.cc3002.patterns.visitor.ast.bool.Literal;
import com.cc3002.patterns.visitor.ast.bool.OrExp;

public class PrintVisitor implements Visitor {
    private StringBuilder builder = new StringBuilder();

    @Override
    public void visitLiteral(Literal l) {
        builder.append(l.toString());
    }

    @Override
    public void visitAnd(AndExp and) {
        builder.append("(");
        and.getLeft().accept(this);
        builder.append(" AND ");
        and.getRight().accept(this);
        builder.append(")");
    }

    @Override
    public void visitOr(OrExp or) {
        builder.append("(");
        or.getLeft().accept(this);
        builder.append(" OR ");
        or.getRight().accept(this);
        builder.append(")");
    }

    public void print() {
        System.out.println(builder.toString());
    }

}
