package com.cc3002.java.example01.methodlookup;

public class B extends A {
    public String method1() {
        return "B.method1()";
    }

    public String method3() {
        return "B.method3() > " + super.method1();
    }

    public String method4() {
        return "B.method4() > " + super.method2();
    }

    public String method5() {
        return "B.method5() > " + super.method5();
    }
}
