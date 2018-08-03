package com.cc3002.patterns.state.phone;

public class InHomeState extends State {
    @Override
    public void pressCamera() {
        phone.setState(new CameraState());
    }

    @Override
    public void pressLock() {
        phone.setState(new LockState());
    }

    @Override
    public void pressHome() {
        System.out.println("ALREADY IN HOME");
    }
}
