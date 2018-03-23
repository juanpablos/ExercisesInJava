package com.cc3002.patterns.template.StarbuzzV1;


public class Coffe extends CafeineBeverage {

    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");

    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");

    }
}
