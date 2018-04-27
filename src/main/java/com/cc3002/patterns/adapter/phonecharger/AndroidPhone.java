package com.cc3002.patterns.adapter.phonecharger;

public class AndroidPhone {
    private boolean connected;

    public AndroidPhone() {
        this.connected = false;
    }

    public void recharge() {
        if (connected) {
            System.out.println("Android Phone is charging.");
            System.out.println("Android - Done recharging.");
        } else {
            System.out.println("You should connect a Micro USB Cable.");
        }
    }

    public void useMicroUSB() {
        System.out.println("Connected Micro USB ---");
        connected = true;
    }
}
