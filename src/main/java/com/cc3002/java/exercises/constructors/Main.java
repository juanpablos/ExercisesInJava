package com.cc3002.java.exercises.constructors;

public class Main {
    public static void main(String[] args) {
        System.out.print("1. ");
        new A();
        System.out.println("end.");
        System.out.print("2. ");
        new B();
        System.out.println("end.");
        System.out.print("3. ");
        new C();
        System.out.println("end.");
        System.out.print("4. ");
        new C("animal");
        System.out.println("end.");
        System.out.print("5. ");
        new D();
        System.out.println("end.");
        System.out.print("6. ");
        new D("jirafa");
        System.out.println("end.");
        System.out.print("7. ");
        new D(3);
        System.out.println("end.");
    }
}
