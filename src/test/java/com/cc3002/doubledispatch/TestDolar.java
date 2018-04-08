package com.cc3002.doubledispatch;

import com.cc3002.patterns.doubledispatch.CLP;
import com.cc3002.patterns.doubledispatch.IMoney;
import com.cc3002.patterns.doubledispatch.USD;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class TestDolar {
    private IMoney dolar100;

    @Before
    public void setUp() {
        dolar100 = new USD(100);
    }

    @Test
    public void testNotNull() {
        assertNotNull(dolar100);
    }

    @Test
    public void testDolarValue() {
        assertEquals(100., dolar100.getMoney());
    }

    @Test
    public void testDolarDolar() {
        IMoney dolar50 = new USD(50);
        IMoney dolar150 = dolar100.add(dolar50);
        assertEquals(150., dolar150.getMoney());
    }

    @Test
    public void testDolarChile() {
        IMoney clp1500 = new CLP(1500);
        IMoney appDolar102 = dolar100.add(clp1500);
        assertEquals(102.5, appDolar102.getMoney(), 0.1);
    }
}
