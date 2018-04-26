package com.cc3002.patterns.template.recipe.before;

public class Main {
    public static void main(String[] args) {
        Coffe coffe = new Coffe();
        Tea tea = new Tea();

        coffe.prepareCoffe();
        System.out.println("------------");
        tea.prepareTea();
    }
}
