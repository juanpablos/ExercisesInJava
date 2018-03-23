package com.cc3002.java.example06.classmethod;

public class B extends A {
    public static String method1() {
        return "B.method1()";
    }

    public static void main(String[] args) {
        System.out.println("1. " + new A().method2());
        System.out.println("2. " + new B().method2());
        System.out.println("3. " + A.method1());
        System.out.println("4. " + B.method1());
        System.out.println("5. " + method1());
    }
}
