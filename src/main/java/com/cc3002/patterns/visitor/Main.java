package com.cc3002.patterns.visitor;

import com.cc3002.patterns.visitor.bool.AndExp;
import com.cc3002.patterns.visitor.bool.BoolExp;
import com.cc3002.patterns.visitor.bool.Literal;
import com.cc3002.patterns.visitor.bool.OrExp;
import com.cc3002.patterns.visitor.visitor.DenyVisitor;
import com.cc3002.patterns.visitor.visitor.EvalVisitor;
import com.cc3002.patterns.visitor.visitor.PrintVisitor;

public class Main {
    public static void main(String[] args) {
        BoolExp root = new AndExp(new OrExp(new OrExp(new Literal(true),
                new OrExp(new Literal(false),
                        new Literal(true))),
                new AndExp(new Literal(true),
                        new Literal(false))),
                new Literal(true));
        PrintVisitor printer = new PrintVisitor();
        root.accept(printer);
        printer.print();

        DenyVisitor denier = new DenyVisitor();
        root.accept(denier);
        BoolExp deniedRoot = denier.getDenied();
        printer = new PrintVisitor();
        deniedRoot.accept(printer);
        printer.print();

        EvalVisitor eval = new EvalVisitor();
        root.accept(eval);
        System.out.println(eval.getValue());
    }
}
