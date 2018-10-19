package com.cc3002.patterns.doubledispatch.money;

public class USD extends Money {
    public USD(double value) {
        super(value);
    }

    @Override
    public IMoney add(IMoney money) {
        return money.addToUSD(this);
    }

    @Override
    public USD addToUSD(USD usd) {
        return new USD(getMoney() + usd.getMoney());
    }

    @Override
    public CLP addToCLP(CLP clp) {
        return new CLP(clp.getMoney() + getMoney() * 606.29005);
    }

    @Override
    public JPY addToJPY(JPY jpy) {
        return new JPY(jpy.getMoney() + getMoney() * 105.61062);
    }
}
