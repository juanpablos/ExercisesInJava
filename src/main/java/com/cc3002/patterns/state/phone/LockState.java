package com.cc3002.patterns.state.phone;

public class LockState extends State {

    @Override
    public void unlock(String password) {
        if (phone.getPassword().equals(password)) {
            phone.setState(new InHomeState());
        } else {
            System.out.println("INCORRECT PASSWORD");
        }
    }

    @Override
    public void pressHome() {
        System.out.println("PHONE IS LOCKED - Insert password");
    }

    @Override
    public void pressLock() {
        System.out.println("PHONE IS LOCKED - Insert password");
    }

    @Override
    public void pressCamera() {
        phone.setState(new CameraState());
    }
}
