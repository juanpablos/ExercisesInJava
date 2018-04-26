package com.cc3002.patterns.proxy;

public class HTTPClient {
    private String name;
    private HTTPServer server;

    public HTTPClient(String name, HTTPServer server) {
        this.name = name;
        this.server = server;
        this.server.registerUser(this);
    }

    public String getName() {
        return name;
    }

    public void requestServer(String contentType) {
        System.out.println("[Client]: " + name + " Requested --" + contentType + "-- to server");
        server.requestInfoBy(contentType, name);
    }

    public void receiveInfo(String message, String contentType) {
        switch (contentType) {
            case "Mark":
                System.out.println("[Client]: I got a: " + message);
                break;
            case "Image":
                System.out.println("[Client]: Image path is: " + message);
                break;
            default:
                System.out.println("[Client - Info]: " + message);
                break;
        }
    }
}

