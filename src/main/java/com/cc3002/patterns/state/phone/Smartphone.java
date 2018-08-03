package com.cc3002.patterns.state.phone;

public class Smartphone {
    private State state;
    private String password;
    private int volume = 10;

    public Smartphone(String password) {
        this.password = password;
        setState(new LockState());
    }

    void setState(State state) {
        this.state = state;
        state.setPhone(this);
    }

    public void volumeUp() {
        state.pressVolumeUp();
    }

    public void volumeDown() {
        state.pressVolumeDown();
    }

    public void homeButton() {
        state.pressHome();
    }

    public void unlockPhone(String password) {
        state.pressLock(password);
    }

    public void lockPhone() {
        state.pressLock();
    }

    public void openCamera() {
        state.pressCamera();
    }

    public int getVolume() {
        return volume;
    }

    String getPassword() {
        return password;
    }

    void changeVolume(int volume) {
        this.volume = volume;
    }

    void takePhoto() {
        System.out.println("Photo taken");
    }

}
