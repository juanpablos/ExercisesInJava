package com.cc3002.patterns.adapter.phonecharger;

public class IPhone {
    private boolean connected;

    public IPhone() {
        this.connected = false;
    }

    public void recharge() {
        if (connected) {
            System.out.println("IPhone is charging.");
            System.out.println("IPhone - Done recharging.");
        } else {
            System.out.println("You should connect a Lightening Cable.");
        }
    }

    public void useLightening() {
        System.out.println("Connected Lightening ---");
        connected = true;
    }
}
