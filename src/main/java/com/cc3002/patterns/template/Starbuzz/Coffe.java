package com.cc3002.patterns.template.Starbuzz;


public class Coffe {

    public void prepareCoffe() {
        boilWater();
        brewCoffe();
        pourInCup();
        addSugarAndMilk();
    }

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public void brewCoffe() {
        System.out.println("Dripping Coffee through filter");

    }

    public void addSugarAndMilk() {
        System.out.println("Adding Sugar and Milk");

    }
}
