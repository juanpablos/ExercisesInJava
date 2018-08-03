package com.cc3002.patterns.state;

import com.cc3002.patterns.state.phone.Smartphone;

public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("123");
        smartphone.homeButton();
        smartphone.lockPhone();
        smartphone.unlockPhone("1234");

        smartphone.unlockPhone("123");
        System.out.println(smartphone.getVolume());
        smartphone.volumeUp();
        smartphone.volumeUp();
        System.out.println(smartphone.getVolume());

        smartphone.openCamera();
        smartphone.volumeUp();

        smartphone.lockPhone();
    }
}
