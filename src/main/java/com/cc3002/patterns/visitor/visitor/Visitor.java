package com.cc3002.patterns.visitor.visitor;

import com.cc3002.patterns.visitor.bool.AndExp;
import com.cc3002.patterns.visitor.bool.Literal;
import com.cc3002.patterns.visitor.bool.OrExp;

public interface Visitor {
    void visitLiteral(Literal l);

    void visitAnd(AndExp and);

    void visitOr(OrExp or);
}
