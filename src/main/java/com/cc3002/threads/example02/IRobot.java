package com.cc3002.threads.example02;

public interface IRobot {

    String getName();

    void setName(String name);

    int getPosition();

    void stepLeft();

    void stepRight();

    boolean isWith(IRobot friend);

}
