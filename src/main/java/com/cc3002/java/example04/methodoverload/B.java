package com.cc3002.java.example04.methodoverload;

public class B extends A {
    String m(A o1, A o2) {
        return "B.m(A,A)";
    }

    public static void main(String[] argv) {
        System.out.println("1. " + new B().m(new A(), new A()));
        System.out.println("2. " + new B().m(new A(), new B()));

        A object1 = new B();
        A object2 = new B();

        System.out.println("3. " + new B().m(object1, object2));
        System.out.println("4. " + new B().m((B) object1, object2));
        System.out.println("5. " + new B().m((B) object1, (B) object2));
    }
}
