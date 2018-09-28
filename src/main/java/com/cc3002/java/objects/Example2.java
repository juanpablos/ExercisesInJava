package com.cc3002.java.objects;

public class Example2 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A(10);

        System.out.println("new A() == new A(10): " + (a1 == a2));
        System.out.println("new A().equals(new A(10)): " + a1.equals(a2));
        System.out.println("Objetos distintos, no hay sorpresa");

        System.out.println("---------------------\n");

        a1 = new A();
        a2 = new A();

        System.out.println("new A() == new A(): " + (a1 == a2));
        System.out.println("new A().equals(new A()): " + a1.equals(a2));
        System.out.println("Objetos distintos, con el mismo contenido, pero no son iguales?");

        System.out.println("---------------------\n");

        // We define B that does implement equals
        // in this case:
        // An object b1, instance of class B, is equal to another b2 iff b2 is instance of B and b1.number == b2.number
        B b1 = new B();
        B b2 = new B();
        B b3 = new B(10);

        System.out.println("new B() == new B(): " + (b1 == b2)); // false because they are not the same object
        System.out.println("new B().equals(new B()): " + b1.equals(b2)); // true because they fulfill the condition
        System.out.println("new B().equals(new B(10)): " + b1.equals(b3)); // false because it does not fulfill b1.number == b2.number

    }
}
