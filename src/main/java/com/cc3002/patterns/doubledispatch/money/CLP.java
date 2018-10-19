package com.cc3002.patterns.doubledispatch.money;

public class CLP extends Money {
    public CLP(double value) {
        super(value);
    }

    @Override
    public IMoney add(IMoney money) {
        return money.addToCLP(this);
    }

    @Override
    public USD addToUSD(USD usd) {
        return new USD(usd.getMoney() + getMoney() * 0.00165);
    }

    @Override
    public CLP addToCLP(CLP clp) {
        return new CLP(getMoney() + clp.getMoney());
    }

    @Override
    public JPY addToJPY(JPY jpy) {
        return new JPY(jpy.getMoney() + getMoney() * 0.17419);
    }
}
