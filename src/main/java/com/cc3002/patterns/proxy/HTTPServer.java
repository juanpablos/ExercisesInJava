package com.cc3002.patterns.proxy;

public interface HTTPServer {
    void registerUser(HTTPClient user);

    void sendMarksTo(int mark, String userName);

    void sendImageTo(String image, String userName);

    void sendInfoTo(String message, String userName);

    void sendContentsTo(String message, String contentType, String userName);

    void requestInfoBy(String contentType, String name);
}
