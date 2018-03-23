package com.cc3002.threads.example03.movement;

import com.cc3002.threads.example03.IRobot;

public abstract class AbstractMeetFriend implements Runnable {

    protected IRobot robot;
    protected IRobot friend;

    public AbstractMeetFriend(final IRobot robot, final IRobot friend) {
        this.robot = robot;
        this.friend = friend;
    }

    public void run() {
        while (nextCycle()) {
            step();
            Thread.yield();
        }
    }

    protected abstract void step();

    protected boolean nextCycle() {
        return !robot.isWith(friend);
    }
}
