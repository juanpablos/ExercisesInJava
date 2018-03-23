package com.cc3002.threads.example03.movement;

import com.cc3002.threads.example03.IRobot;

public class MeetToRight extends AbstractMeetFriend {

    public MeetToRight(final IRobot robot, final IRobot friend) {
        super(robot, friend);
    }

    @Override
    protected void step() {
        robot.stepRight();
    }

}
