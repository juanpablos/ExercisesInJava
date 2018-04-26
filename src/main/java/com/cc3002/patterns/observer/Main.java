package com.cc3002.patterns.observer;

public class Main {

    public static void main(String[] args) {
        Client client1 = new Client(1);
        Client client2 = new Client(2);
        Client client3 = new Client(3);
        Client client4 = new Client(4);

        Server server = new Server();

        server.connect(client1, client2, client3, client4);
        Thread serverThread = new Thread(server);
        serverThread.start();
    }

}
