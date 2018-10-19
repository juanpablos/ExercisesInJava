package com.cc3002.patterns.doubledispatch.money;

public class JPY extends Money {
    public JPY(double value) {
        super(value);
    }

    @Override
    public IMoney add(IMoney money) {
        return money.addToJPY(this);
    }

    @Override
    public USD addToUSD(USD usd) {
        return new USD(usd.getMoney() + getMoney() * 0.0094);
    }

    @Override
    public CLP addToCLP(CLP clp) {
        return new CLP(clp.getMoney() + getMoney() * 5.74081);
    }

    @Override
    public JPY addToJPY(JPY jpy) {
        return new JPY(getMoney() + jpy.getMoney());
    }
}
