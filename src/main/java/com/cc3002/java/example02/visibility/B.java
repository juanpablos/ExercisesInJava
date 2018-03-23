package com.cc3002.java.example02.visibility;

public class B extends A {
    public String method1() {
        return "B.method1()";
    }

    static public void main(String[] args) {
        System.out.println(new B().method2());

    }
}
