package com.cc3002.patterns.visitor.menu;

import com.cc3002.patterns.visitor.menu.operations.search.ExactSearch;
import com.cc3002.patterns.visitor.menu.operations.search.ItemNumberLessEq;
import com.cc3002.patterns.visitor.menu.operations.search.Search;
import com.cc3002.patterns.visitor.menu.operations.sum.Sum;
import com.cc3002.patterns.visitor.menu.operations.sum.SumTotalPrice;
import com.cc3002.patterns.visitor.menu.operations.sum.SumVegetarianPrice;

public class Main {
    public static void main(String[] args) {
        FoodMenu mainMenu = new FoodMenu("Main Menu");

        FoodMenu subMenu1 = new FoodMenu("Sub Menu 1");
        subMenu1.addItem(new FoodItem("SubMenu1 Item1", "Item1", false, 100));
        subMenu1.addItem(new FoodItem("SubMenu1 Item2", "Item2", true, 200));
        subMenu1.addItem(new FoodItem("SubMenu1 Item3", "Item3", true, 50));
        subMenu1.addItem(new FoodItem("SubMenu1 Item4", "Item4", false, 1000));

        FoodMenu subMenu2 = new FoodMenu("Sub Menu 2");
        subMenu2.addItem(new FoodItem("SubMenu2 Item1", "Item1", false, 1000));
        subMenu2.addItem(new FoodItem("SubMenu2 Item2", "Item2", true, 2000));

        mainMenu.addItem(subMenu1);
        mainMenu.addItem(subMenu2);

        Search exactName1 = new ExactSearch("SubMenu1 Item2");
        mainMenu.accept(exactName1);
        System.out.println(exactName1.getMatching());

        Search exactName2 = new ExactSearch("Sub Menu 1");
        mainMenu.accept(exactName2);
        System.out.println(exactName2.getMatching());

        Search lessEq3 = new ItemNumberLessEq(3);
        mainMenu.accept(lessEq3);
        System.out.println(lessEq3.getMatching());

        Sum totalPrice = new SumTotalPrice();
        mainMenu.accept(totalPrice);
        System.out.println(totalPrice.getPrice());

        Sum totalPriceSub = new SumTotalPrice();
        subMenu2.accept(totalPriceSub);
        System.out.println(totalPriceSub.getPrice());

        Sum totalPriceVeg = new SumVegetarianPrice();
        mainMenu.accept(totalPriceVeg);
        System.out.println(totalPriceVeg.getPrice());
    }
}
