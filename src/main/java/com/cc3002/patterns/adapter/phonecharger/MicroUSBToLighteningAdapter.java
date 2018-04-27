package com.cc3002.patterns.adapter.phonecharger;

public class MicroUSBToLighteningAdapter {
    private IPhone phone;

    public MicroUSBToLighteningAdapter(IPhone phone) {
        this.phone = phone;
    }

    public void recharge() {
        phone.recharge();
    }

    public void useMicroUSB() {
        System.out.println("Connected Micro USB ---");
        phone.useLightening();
    }

}
