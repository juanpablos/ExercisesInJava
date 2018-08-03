package com.cc3002.patterns.state.phone;

public class State {
    Smartphone phone;

    public void setPhone(Smartphone phone) {
        this.phone = phone;
    }

    public void unlock(String password) {

    }

    public void pressLock() {

    }

    public void pressHome() {

    }

    public void pressVolumeUp() {
        phone.changeVolume(phone.getVolume() + 1);
    }

    public void pressVolumeDown() {
        phone.changeVolume(phone.getVolume() - 1);
    }

    public void pressCamera() {

    }

}
