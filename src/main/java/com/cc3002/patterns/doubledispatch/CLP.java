package com.cc3002.patterns.doubledispatch;

public class CLP extends Money {
    public CLP(double value) {
        super(value);
    }

    @Override
    public IMoney add(IMoney money) {
        return money.addCLP(this);
    }

    @Override
    public USD addUSD(USD usd) {
        return null;
    }

    @Override
    public CLP addCLP(CLP clp) {
        return new CLP(getMoney() + clp.getMoney());
    }

    @Override
    public JPY addJPY(JPY jpy) {
        return null;
    }
}
