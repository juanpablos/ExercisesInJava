package com.cc3002.patterns.proxy;

public class Main {
    public static void main(String[] args) {
        HTTPServer ucursos = new UCursosServer();

        HTTPClient juanito = new UCursosClient("Juanito");
        HTTPClient maria = new UCursosClient("Maria");

        ucursos.sendContents("Mark", juanito);
        ucursos.sendContents("Image", maria);
        ucursos.sendContents("Info", maria);

        System.out.println("----------------");

        ucursos = new HTTPProxy(ucursos);
        ucursos.sendContents("Mark", juanito);
        ucursos.sendContents("Image", maria);
        ucursos.sendContents("Info", maria);
    }
}
