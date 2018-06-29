package com.cc3002.patterns.visitor.ast.visitor;

import com.cc3002.patterns.visitor.ast.bool.AndExp;
import com.cc3002.patterns.visitor.ast.bool.Literal;
import com.cc3002.patterns.visitor.ast.bool.OrExp;

public interface Visitor {
    void visitLiteral(Literal l);

    void visitAnd(AndExp and);

    void visitOr(OrExp or);
}
