package com.cc3002.patterns.doubledispatch;

public class Main {
    public static void main(String[] args) {
        IMoney usd = new USD(100);
        IMoney clp = new CLP(1000);

        System.out.println(usd.add(clp).getMoney()+"USD");
        System.out.println(clp.add(usd).getMoney()+"CLP");
    }
}
