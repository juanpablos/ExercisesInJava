package com.cc3002.exception;

import com.cc3002.java.exceptions.A;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class ExceptionTest {
    private A a;

    @Before
    public void setUp() {
        a = new A();
    }

    @Test
    public void exceptionTest1() throws Exception {
        boolean thrown = false;
        try {
            a.method();
        } catch (Exception e) {
            thrown = true;
        }
        assertTrue(thrown);
    }

    @Test(expected = Exception.class)
    public void exceptionTest2() throws Exception {
        a.method();
    }
}
