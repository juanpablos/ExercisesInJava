package com.cc3002.patterns.adapter.phonecharger;

public class Main {

    public static void chargeAndroid() {
        AndroidPhone androidPhone = new AndroidPhone();
        androidPhone.useMicroUSB();
        androidPhone.recharge();

    }

    public static void chargeIPhone() {
        IPhone iPhone = new IPhone();
        iPhone.useLightening();
        iPhone.recharge();
    }

    public static void chargeIPhoneWithMicroUSB() {
        IPhone iPhone = new IPhone();
        MicroUSBToLighteningAdapter adapter = new MicroUSBToLighteningAdapter(iPhone);
        adapter.useMicroUSB();
        adapter.recharge();
    }

    public static void main(String[] args) {
        chargeAndroid();
        System.out.println();
        chargeIPhone();
        System.out.println();
        chargeIPhoneWithMicroUSB();

    }
}
