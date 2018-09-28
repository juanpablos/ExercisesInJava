package com.cc3002.java.objects;

public class Example1 {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "Bye";

        System.out.println("Hello == Bye: " + (string1 == string2));
        System.out.println("Hello.equals(Bye): " + string1.equals(string2));
        System.out.println("Objetos distintos, no hay sorpresa");

        System.out.println("---------------------\n");

        String hello1 = new String("Hello");
        String hello2 = new String("Hello");
        System.out.println("new Hello == new Hello: " + (hello1 == hello2));
        System.out.println("new Hello.equals(new Hello): " + hello1.equals(hello2));
        System.out.println("Objetos distintos, pero con el mismo contenido");

        System.out.println("---------------------\n");

        String hola1 = "Hola";
        String hola2 = "Hola";

        System.out.println("Hola == Hola: " + (hola1 == hola2));
        System.out.println("Hola.equals(Hola): " + hola1.equals(hola2));
        System.out.println("Literales string, el compilador arregla la referencia");

        System.out.println("---------------------\n");

        ObjectHolder container = new ObjectHolder("This is a string");
        Object variable = container.getVariable();
        System.out.println(container.checkSameReference(variable));
        System.out.println(container.checkEqualVariable(variable));
        System.out.println("No se crea un objeto nuevo");

        System.out.println("---------------------");

        System.out.println(container.checkSameReference(container.getVariable()));
        System.out.println(container.checkEqualVariable(container.getVariable()));
        System.out.println("Claramente todo es igual");
    }

}
