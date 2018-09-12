package com.cc3002.doubledispatch;

import com.cc3002.patterns.doubledispatch.CLP;
import com.cc3002.patterns.doubledispatch.IMoney;
import com.cc3002.patterns.doubledispatch.USD;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class TestDollar {
    private IMoney dollar100;

    @Before
    public void setUp() {
        dollar100 = new USD(100);
    }

    @Test
    public void testNotNull() {
        assertNotNull(dollar100);
    }

    @Test
    public void testDollarValue() {
        assertEquals(100., dollar100.getMoney());
    }

    @Test
    public void testDollarDollar() {
        IMoney dollar50 = new USD(50);
        IMoney dollar150 = dollar100.add(dollar50);
        assertEquals(150., dollar150.getMoney());
    }

    @Test
    public void testDollarChile() {
        IMoney clp1500 = new CLP(1500);
        IMoney appDollar102 = dollar100.add(clp1500);
        assertEquals(102.5, appDollar102.getMoney(), 0.1);
    }
}
