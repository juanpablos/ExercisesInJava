package com.cc3002.patterns.template.Starbuzz;


//CafeineBeverage
public class Tea {

    public void prepareTea() {
        boilWater();
        brewTea();
        pourInCup();
        addLemon();
    }

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public void brewTea() {
        System.out.println("Steeping the tea");
    }

    public void addLemon() {
        System.out.println("Adding Lemon");
    }

}
