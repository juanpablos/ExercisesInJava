package com.cc3002.patterns.visitor.visitor;

import com.cc3002.patterns.visitor.bool.AndExp;
import com.cc3002.patterns.visitor.bool.BoolExp;
import com.cc3002.patterns.visitor.bool.Literal;
import com.cc3002.patterns.visitor.bool.OrExp;

public class DenyVisitor implements Visitor {

    private BoolExp denied;

    @Override
    public void visitLiteral(Literal l) {
        denied = new Literal(!l.getValue());
    }

    @Override
    public void visitAnd(AndExp and) {
        and.getLeft().accept(this);
        BoolExp noleft = denied;
        and.getRight().accept(this);
        BoolExp noright = denied;
        denied = new OrExp(noleft, noright);
    }

    @Override
    public void visitOr(OrExp or) {
        or.getLeft().accept(this);
        BoolExp noleft = denied;
        or.getRight().accept(this);
        BoolExp noright = denied;
        denied = new AndExp(noleft, noright);
    }

    public BoolExp getDenied() {
        return denied;
    }

}
