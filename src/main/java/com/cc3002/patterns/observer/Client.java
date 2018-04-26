package com.cc3002.patterns.observer;

import java.util.Observable;
import java.util.Observer;

public class Client implements Observer {
    private int id;

    public Client(int i) {
        id = i;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof String) {
            String message = (String) arg;
            System.out.println("[Client " + id + "]: " + message);
        }
    }

    public int getId() {
        return id;
    }
}
