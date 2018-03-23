package com.cc3002.java.example02.visibility;

public class E {
    public String method1() {
        return "E.method1()";
    }

    public String method2() {
        return "E.method2() > " + this.method1();
    }
}
