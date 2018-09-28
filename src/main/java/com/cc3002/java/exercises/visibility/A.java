package com.cc3002.java.exercises.visibility;

public class A {
    private String method1() {
        return "A.method1()";
    }

    public String method2() {
        return "A.method2() > " + this.method1();
    }
}
