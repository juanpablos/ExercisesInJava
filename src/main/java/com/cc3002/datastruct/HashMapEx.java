package com.cc3002.datastruct;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        Map<Integer, String> calendar = new HashMap<>();
        calendar.put(1, "Enero");
        calendar.put(2, "Febrero");
        calendar.put(3, "Marzo");
        // ...
        calendar.put(12, "December");
        calendar.put(13, "upps me equivoque");

        System.out.println("Dame el mes 12: " + calendar.get(12));
        System.out.println("¿Cómo se llama el primer mes? " + calendar.get(1));

        calendar.replace(12, "Diciembre");
        System.out.println("Ahora sí, dame el mes 12 en español: " + calendar.get(12));

        calendar.remove(13);
        System.out.println("¿Mes 13? " + (calendar.get(13) == null ? "No" : "Sí"));

    }
}
