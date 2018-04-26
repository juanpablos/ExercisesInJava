package com.cc3002.patterns.proxy;

public interface HTTPClient {
    void receiveContents(String contentType, String message);

    String getUserName();
}
