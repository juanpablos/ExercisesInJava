package com.cc3002.threads.example04.movement;

import com.cc3002.threads.example04.IRobot;

public class MeetToLeft extends AbstractMeetFriend {

    public MeetToLeft(final IRobot robot, final IRobot friend) {
        super(robot, friend);
    }

    @Override
    protected void step() {
        robot.stepLeft();
    }

}
