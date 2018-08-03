package com.cc3002.patterns.state.phone;

public class CameraState extends State {
    public void pressLock() {
        phone.setState(new LockState());
    }

    public void pressHome() {
        phone.setState(new InHomeState());
    }

    public void pressVolumeUp() {
        phone.takePhoto();
    }

    public void pressVolumeDown() {
        phone.takePhoto();
    }
}
