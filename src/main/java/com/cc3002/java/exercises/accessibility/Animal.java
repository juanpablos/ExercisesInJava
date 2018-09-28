package com.cc3002.java.exercises.accessibility;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
    }

    public String getPair(Animal paired) {
        return this.getName() + " with " + paired.getName();
    }

    public static void main(String[] args) {
        System.out.println("1. " + new Animal("Jirafa").getPair(new Animal("Antilope")));
        System.out.println("2. " + new Animal("Tigre").getName());
    }
}
