package com.cc3002.threads.example01;

public class Robot implements IRobot {

    private String name;

    public Robot() {
        this("a robot");
    }

    public Robot(final String name) {
        this.setName(name);
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
