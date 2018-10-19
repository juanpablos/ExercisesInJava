package com.cc3002.patterns.doubledispatch.money;

public abstract class Money implements IMoney {
    private double value;

    public Money(double value) {
        this.value = value;
    }

    @Override
    public double getMoney() {
        return value;
    }

    @Override
    public abstract IMoney add(IMoney money);

    @Override
    public abstract USD addToUSD(USD usd);

    @Override
    public abstract CLP addToCLP(CLP clp);

    @Override
    public abstract JPY addToJPY(JPY jpy);
}
