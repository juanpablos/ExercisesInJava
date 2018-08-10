package com.cc3002.java.exceptions;

public class Example2 {

    public static void m1() {
        System.out.println("A");
        try {
            System.out.println("B");
            throw new E();
        } catch (E e) {
            System.out.println("C");
        } finally {
            System.out.println("D");
        }
        System.out.println("E");
    }

    public static void m2(boolean b) {
        try {
            try {
                System.out.println("A");
                if (b) {
                    throw new E();
                }
            } finally {
                System.out.println("B");
            }
            System.out.println("C");
        } catch (E e) {
            System.out.println("D");
        }
        System.out.println("E");
    }

    public static int m3() {
        try {
            return 10;
        } finally {
            return 100;
        }
    }

    public static int m4(boolean b) {
        try {
            if (b) {
                throw new E();
            }
            return 10;
        } catch (E e) {
            return 100;
        } finally {
            return 1000;
        }
    }

    public static void main(String[] args) {
        System.out.println("M1");
        m1();
        System.out.println("\nM2 - true");
        m2(true);
        System.out.println("\nM2 - false");
        m2(false);
        System.out.println("\nM3\n" + m3());
        System.out.println("\n\nM4 - true\n" + m4(true));
        System.out.println("\n\nM4 - false\n" + m4(false));
    }
}
