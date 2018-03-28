package com.cc3002.patterns.doubledispatch;

public class JPY extends Money {
    public JPY(double value) {
        super(value);
    }

    @Override
    public IMoney add(IMoney money) {
        return money.addJPY(this);
    }

    @Override
    public USD addUSD(USD usd) {
        return null;
    }

    @Override
    public CLP addCLP(CLP clp) {
        return null;
    }

    @Override
    public JPY addJPY(JPY jpy) {
        return new JPY(getMoney() + jpy.getMoney());
    }
}
