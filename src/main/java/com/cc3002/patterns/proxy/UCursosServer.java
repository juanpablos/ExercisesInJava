package com.cc3002.patterns.proxy;

import java.util.Random;

public class UCursosServer implements HTTPServer {
    private String todaysInfo = "No deje que le roben su dinero del banco del pais!";
    private String images = "/cats.jpg";

    public void setTodaysInfo(String todaysInfo) {
        this.todaysInfo = todaysInfo;
    }

    public void setImages(String images) {
        this.images = images;
    }

    @Override
    public void sendContents(String contentType, HTTPClient client) {
        String message;
        switch (contentType) {
            case "Mark":
                message = Integer.toString(new Random().nextInt(7) + 1);
                System.out.println("[UCursos - Marks]: " + client.getUserName() + ": " + message);
                break;
            case "Image":
                message = images;
                System.out.println("[UCursos - Image]: " + client.getUserName() + ": " + message);
                break;
            default:
                message = todaysInfo;
                System.out.println("[UCursos - Info]: " + client.getUserName() + ": " + message);
                break;
        }

        client.receiveContents(contentType, message);
    }
}
