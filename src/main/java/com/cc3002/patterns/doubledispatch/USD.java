package com.cc3002.patterns.doubledispatch;

public class USD extends Money {
    public USD(double value) {
        super(value);
    }

    @Override
    public IMoney add(IMoney money) {
        return money.addUSD(this);
    }

    @Override
    public USD addUSD(USD usd) {
        return new USD(getMoney() + usd.getMoney());
    }

    @Override
    public CLP addCLP(CLP clp) {
        return null;
    }

    @Override
    public JPY addJPY(JPY jpy) {
        return null;
    }
}
