package com.cc3002.datastruct.hashtable;

import java.util.Hashtable;
import java.util.Map;

public class HashTableEx {
    public static void main(String[] args) {
        Map<Integer, String> calendario = new Hashtable<>();
        calendario.put(1, "Enero");
        calendario.put(2, "Febrero");
        calendario.put(3, "Marzo");
        calendario.put(12, "December");
        calendario.put(13, "upps me equivoque");

        System.out.println(calendario.get(12));
        System.out.println(calendario.get(1));

        calendario.replace(12, "Diciembre");
        System.out.println(calendario.get(12));

        calendario.remove(13);
        System.out.println(calendario.get(13));

    }
}
