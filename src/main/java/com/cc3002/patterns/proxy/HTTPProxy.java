package com.cc3002.patterns.proxy;

public class HTTPProxy implements HTTPServer, HTTPClient {

    private HTTPServer server;
    private HTTPClient user;

    public HTTPProxy(HTTPServer server) {
        this.server = server;
    }

    @Override
    public void receiveContents(String contentType, String message) {
        System.out.println("[Proxy Intercepting " + user.getUserName() + "]: " + message);
        user.receiveContents(contentType, message);
    }

    @Override
    public String getUserName() {
        return user.getUserName();
    }

    @Override
    public void sendContents(String contentType, HTTPClient client) {
        user = client;
        System.out.println("[Proxy Intercepting " + user.getUserName() + " Request]: " + contentType);
        server.sendContents(contentType, this);
    }
}
