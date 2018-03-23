package com.cc3002.java.example02.visibility;

public class C {
    protected String method1() {
        return "C.method1()";
    }

    public String method2() {
        return "C.method2() > " + this.method1();
    }
}
