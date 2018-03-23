package com.cc3002.threads.example01.test;

import com.cc3002.threads.example01.IRobot;
import com.cc3002.threads.example01.Robot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RobotTest {

    private IRobot robot;

    @Before
    public void setUp() {
        robot = new Robot("robot one");
    }

    @Test
    public void testDefaultName() {
        assertEquals("a robot", new Robot().getName());
    }

    @Test
    public void testGetName() {
        assertEquals("robot one", robot.getName());
    }

    @Test
    public void testSetName() {
        robot.setName("defined name");
        assertEquals("defined name", robot.getName());
    }

}
