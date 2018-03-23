package com.cc3002.threads.example03.test;

import com.cc3002.threads.example03.IRobot;
import com.cc3002.threads.example03.Robot;
import com.cc3002.threads.example03.movement.MeetToLeft;
import com.cc3002.threads.example03.movement.MeetToRight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MeetFriendTest {

    private static final int LEFT_POSITION = 1;
    private static final int RIGHT_POSITION = 100;
    private static final int WAIT_MILLISECONDS = 100;

    private IRobot robot;
    private IRobot friend;
    private Thread threadRobot;
    private Thread threadFriend;

    @Before
    public void setUp() {
        robot = new Robot("robot one", LEFT_POSITION);
        friend = new Robot("robot two", RIGHT_POSITION);
    }

    /*
     * They never meet.
     */

    @Test
    public void testNeverMeetOnLeft() throws InterruptedException {
        final MeetToLeft movement = new MeetToLeft(robot, friend);
        threadRobot = new Thread(movement);
        threadRobot.start();
        threadRobot.join(WAIT_MILLISECONDS);
        assertTrue("Robot should not find its friend.", threadRobot.isAlive());
    }

    /*
     * Meet on the right
     */

    @Test
    public void testMeetOnRightThread() throws InterruptedException {
        final MeetToRight movement = new MeetToRight(robot, friend);
        threadRobot = new Thread(movement);
        threadRobot.start();
        threadRobot.join(WAIT_MILLISECONDS);
        assertFalse(threadRobot.isAlive());
    }

    @Test
    public void testMeetOnRight() throws InterruptedException {
        testMeetOnRightThread();
        assertTrue("Robot should be with its friend.", robot.isWith(friend));
    }

    @Test
    public void testMeetOnRightOnPosition() throws InterruptedException {
        testMeetOnRightThread();
        assertEquals("Expects position of the friend.", RIGHT_POSITION, robot.getPosition());
    }

    /*
     * Meet on the left
     */

    @Test
    public void testMeetOnLeftThread() throws InterruptedException {
        threadFriend = new Thread(new MeetToLeft(friend, robot));
        threadFriend.start();
        threadFriend.join(WAIT_MILLISECONDS);
        assertFalse(threadFriend.isAlive());
    }

    @Test
    public void testMeetOnLeft() throws InterruptedException {
        testMeetOnLeftThread();
        assertTrue("Friend should be with the robot.", friend.isWith(robot));
    }

    @Test
    public void testMeetOnLeftOnPosition() throws InterruptedException {
        testMeetOnLeftThread();
        assertEquals("Expects position of the robot.", LEFT_POSITION, friend.getPosition());
    }


    /*
     * Meet in the middle
     */

    @Test
    public void testMeetInTheMiddleThread() throws InterruptedException {
        threadRobot = new Thread(new MeetToRight(robot, friend));
        threadFriend = new Thread(new MeetToLeft(friend, robot));
        threadRobot.start();
        threadFriend.start();
        threadRobot.join(WAIT_MILLISECONDS);
        threadFriend.join(WAIT_MILLISECONDS);
        assertFalse(threadRobot.isAlive());
        assertFalse(threadFriend.isAlive());
    }

    @Test
    public void testMeetInTheMiddle() throws InterruptedException {
        testMeetInTheMiddleThread();
        assertTrue("Robot should be with its friend.", robot.isWith(friend));
    }

    @Test
    public void testMeetInTheMiddleOnRobotPosition() throws InterruptedException {
        testMeetInTheMiddleThread();
        assertEquals("Expects to be in the middle.", friend.getPosition(), robot.getPosition());
    }

    @Test
    public void testMeetInTheMiddleOnFriendPosition() throws InterruptedException {
        testMeetInTheMiddleThread();
        assertEquals("Expects to be in the middle.", robot.getPosition(), friend.getPosition());
    }
}
