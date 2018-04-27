package com.cc3002.patterns.template.recipe.after;


public abstract class CaffeineBeverage implements HotBeverage {
    /**
     * template method
     */
    @Override
    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public abstract void brew();

    public abstract void addCondiments();

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
}