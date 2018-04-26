package com.cc3002.patterns.proxy;

public interface HTTPServer {
    void sendContents(String contentType, HTTPClient client);
}
