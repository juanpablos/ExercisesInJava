package com.cc3002.patterns.observer;

import java.util.Observable;

public class Server extends Observable implements Runnable {
    @Override
    public void run() {
        try {
            publishMessage("Bienvenidos al servidor!");
            Thread.sleep(1000);
            publishMessage("Les voy a mandar spam cada 2 segundos.");
            Thread.sleep(2000);
            publishMessage("*****SPAM*****");
            Thread.sleep(2000);
            publishMessage("El Servicio de Impuestos Internos, se ha percatado que en diversos " +
                    "despachos alrededor del pais, Ud. ha propuesto esquemas para evadir el pago de impuestos");
            Thread.sleep(2000);
            publishMessage("y hemos detectado anomalias en su situacion fiscal. Para evitar una " +
                    "sancion en su contra que puede ser una multa de hasta 75 UTM.");
            Thread.sleep(2000);
            publishMessage("le recomendamos seguir nuestro manual de recomendaciones en [LINK].exe");
            Thread.sleep(5000);
            publishMessage("... no somos spam... es .exe porque es interactivo...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void connect(Client... clients) {
        for (Client client : clients) {
            addObserver(client);
            System.out.println("[Server] Client " + client.getId() + " connected to server.");
        }
    }

    public void publishMessage(String message) {
        setChanged();
        System.out.println("[Server] " + "Message to publish: " + message);
        notifyObservers(message);
    }
}
