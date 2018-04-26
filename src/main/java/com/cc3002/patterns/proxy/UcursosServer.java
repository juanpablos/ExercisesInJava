package com.cc3002.patterns.proxy;

import java.util.Hashtable;
import java.util.Map;
import java.util.Random;

public class UcursosServer implements HTTPServer {
    private Map<String, HTTPClient> userTable;
    private Map<String, Integer> marksTable;
    private String todaysInfo = "No deje que le roben su dinero del banco del pais!";
    private String images = "/cats.jpg";

    public UcursosServer() {
        userTable = new Hashtable<>();
        marksTable = new Hashtable<>();
    }

    @Override
    public void registerUser(HTTPClient user) {
        userTable.put(user.getName(), user);
        marksTable.put(user.getName(), new Random().nextInt(8));
        System.out.println("[UCursos]: New user: " + user.getName());
    }

    @Override
    public void sendMarksTo(int mark, String userName) {
        sendContentsTo(Integer.toString(mark), "Mark", userName);
    }

    @Override
    public void sendImageTo(String image, String userName) {
        sendContentsTo(image, "Image", userName);
    }

    @Override
    public void sendInfoTo(String message, String userName) {
        sendContentsTo(message, "Info", userName);
    }

    @Override
    public void sendContentsTo(String message, String contentType, String userName) {
        switch (contentType) {
            case "Mark":
                System.out.println("[UCursos - Marks]: " + userName + ": " + message);
                break;
            case "Image":
                System.out.println("[UCursos - Image]: " + userName + ": " + message);
                break;
            default:
                System.out.println("[UCursos - Info]: " + userName + ": " + message);
                break;
        }

        userTable.get(userName).receiveInfo(message, contentType);
    }

    @Override
    public void requestInfoBy(String contentType, String name) {
        switch (contentType) {
            case "Mark":
                sendMarksTo(marksTable.get(name), name);
                break;
            case "Image":
                sendImageTo(images, name);
                break;
            default:
                sendInfoTo(todaysInfo, name);
                break;
        }
    }
}
