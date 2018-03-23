package com.cc3002.threads.example04;

public class Robot implements IRobot {

    private String name;
    private int position;

    public Robot() {
        this("a robot");
    }

    public Robot(final String name) {
        this(name, 1);
    }

    public Robot(final String name, final int position) {
        this.setName(name);
        this.position = position;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void stepLeft() {
        position--;
    }

    public void stepRight() {
        position++;
    }

    public boolean isWith(final IRobot friend) {
        return this.getPosition() == friend.getPosition();
    }

}
