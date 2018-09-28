package com.cc3002.java.objects;

public class A {
    protected int number;

    public A() {
        this(0);
    }

    public A(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}