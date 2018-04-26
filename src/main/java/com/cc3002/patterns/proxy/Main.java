package com.cc3002.patterns.proxy;

public class Main {
    public static void main(String[] args) {
        HTTPServer ucursos = new UcursosServer();
        //ucursos = new HTTPProxy(ucursos);

        HTTPClient juanito = new HTTPClient("Juanito", ucursos);
        HTTPClient paula = new HTTPClient("Paula", ucursos);

        paula.requestServer("Mark");
        juanito.requestServer("Image");
        paula.requestServer("Info");
        juanito.requestServer("Nothing");
    }
}
