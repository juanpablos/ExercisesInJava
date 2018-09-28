package com.cc3002.datastruct;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

    public static double sum(List<Double> grades) {
        double theSum = 0.0;
        for (Double grade : grades) {
            theSum += grade;
        }
        return theSum;
    }

    public static void main(String[] args) {
        List<Double> grades = new ArrayList<>();
        grades.add(5.5);

        grades.add(3.0);
        grades.add(5.1);

        System.out.println("Mi peor nota es la segunda: " + grades.get(1));

        System.out.println("Tengo " + grades.size() + " notas");
        System.out.println("Mis notas suman: " + sum(grades));
        System.out.println("Mi promedio es: " + sum(grades) / grades.size());

        System.out.println("Me borraron el " + 3.0 + "!");
        grades.remove(3.0);
        System.out.println("Mis nuevas notas: " + grades);

        System.out.println("Me saqué un 4.0 y un 7.0 y se borra el primer control");
        grades.add(4.0);
        grades.add(7.0);
        grades.remove(0);

        System.out.println("Mis nuevas notas: " + grades);
    }
}
