package com.cc3002.patterns.template.recipe.after;


public class Main {
    public static void main(String[] args) {
        HotBeverage coffee = new Coffee();
        HotBeverage tea = new Tea();

        coffee.prepareRecipe();
        System.out.println("------------");
        tea.prepareRecipe();
    }
}
