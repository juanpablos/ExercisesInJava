package com.cc3002.threads.example04.movement;

import com.cc3002.threads.example04.IRobot;

import java.util.concurrent.Semaphore;

public abstract class AbstractMeetFriend implements Runnable {

    protected IRobot robot;
    protected IRobot friend;
    protected static Semaphore LOCK = new Semaphore(1, true);

    public AbstractMeetFriend(final IRobot robot, final IRobot friend) {
        this.robot = robot;
        this.friend = friend;
    }

    public void run() {
        while (nextCycle()) {
            step();
            LOCK.release();
            Thread.yield();
        }
        LOCK.release();
    }

    protected abstract void step();

    protected boolean nextCycle() {
        try {
            LOCK.acquire();
        } catch (final InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return !robot.isWith(friend);
    }
}
