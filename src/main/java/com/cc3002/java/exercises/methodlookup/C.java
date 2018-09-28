package com.cc3002.java.exercises.methodlookup;

public class C extends B {
    public String method2() {
        return "C.method2() > " + this.method1();
    }

    public static void main(String[] args) {
        /* basic method look-up */
        System.out.println("1. " + new C().method1());
        System.out.println("2. " + new B().method1());
        System.out.println("3. " + new A().method1());

        /* this */
        System.out.println("4. " + new C().method2());
        System.out.println("5. " + new B().method2());
        System.out.println("6. " + new A().method2());

        /* super */
        System.out.println("7. " + new B().method3());
        System.out.println("8. " + new C().method4());
        System.out.println("9. " + new C().method5());
    }

}
