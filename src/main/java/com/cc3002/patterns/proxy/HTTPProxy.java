package com.cc3002.patterns.proxy;

public class HTTPProxy implements HTTPServer {
    private HTTPServer server;
    public HTTPProxy(HTTPServer ucursos) {
        server = ucursos;
    }

    @Override
    public void registerUser(HTTPClient user) {
        server.registerUser(user);
    }

    @Override
    public void sendMarksTo(int mark, String userName) {

    }

    @Override
    public void sendImageTo(String image, String userName) {

    }

    @Override
    public void sendInfoTo(String message, String userName) {

    }

    @Override
    public void sendContentsTo(String message, String contentType, String userName) {

    }

    @Override
    public void requestInfoBy(String contentType, String name) {

    }
}
