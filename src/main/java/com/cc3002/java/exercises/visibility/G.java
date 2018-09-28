package com.cc3002.java.exercises.visibility;

public class G {
    public static void main(String[] args) {
        System.out.println("1. " + new A().method2());
        System.out.println("2. " + new B().method2());
        System.out.println("3. " + new C().method2());
        System.out.println("4. " + new D().method2());
        System.out.println("5. " + new E().method2());
        System.out.println("6. " + new F().method2());
    }
}
