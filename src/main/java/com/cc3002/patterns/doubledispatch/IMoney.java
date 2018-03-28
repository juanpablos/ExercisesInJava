package com.cc3002.patterns.doubledispatch;

public interface IMoney {
    double getMoney();
    IMoney add(IMoney money);
    USD addUSD(USD usd);
    CLP addCLP(CLP clp);
    JPY addJPY(JPY jpy);
}
