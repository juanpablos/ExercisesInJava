package com.cc3002.patterns.template.StarbuzzV1;

//CafeineBeverage
public class Tea extends CafeineBeverage {

    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }

}