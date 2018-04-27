package com.cc3002.patterns.template.sorting.after;

public class Main {

    public static void printArray(int arr[]) {
        for (int anArr : arr) {
            System.out.print(anArr + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {48, 1, 6, 4, 6, 41, 8, 4, 6, 2, 1, 56, 6, 4};
        int n = arr.length;

        System.out.println("Quick Asc High");
        QuickSort qs = new QuickSortAscHigh();
        int arr2[] = arr.clone();
        qs.sort(arr2, 0, n - 1);
        printArray(arr2);

        System.out.println("Quick Asc Low");
        qs = new QuickSortAscLow();
        arr2 = arr.clone();
        qs.sort(arr2, 0, n - 1);
        printArray(arr2);

        System.out.println("Quick Asc Med");
        qs = new QuickSortAscMed();
        arr2 = arr.clone();
        qs.sort(arr2, 0, n - 1);
        printArray(arr2);

        System.out.println("Quick Desc High");
        qs = new QuickSortDescHigh();
        arr2 = arr.clone();
        qs.sort(arr2, 0, n - 1);
        printArray(arr2);
    }
}
