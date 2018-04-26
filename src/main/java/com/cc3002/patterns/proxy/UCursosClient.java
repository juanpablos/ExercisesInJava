package com.cc3002.patterns.proxy;

public class UCursosClient implements HTTPClient {
    private String name;

    public UCursosClient(String name) {
        this.name = name;
    }

    public String getUserName() {
        return name;
    }

    @Override
    public void receiveContents(String contentType, String message) {
        switch (contentType) {
            case "Mark":
                System.out.println("[Client " + name + "]: I got a: " + message);
                break;
            case "Image":
                System.out.println("[Client " + name + "]: Image path is: " + message);
                break;
            default:
                System.out.println("[Client " + name + " - Info]: " + message);
                break;
        }
    }

}

