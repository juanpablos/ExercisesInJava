package com.cc3002.patterns.template.sorting.before;


public class QuickSortAscMed {

    public void sort(int arr[], int low, int high) {
        int temp;
        int center = (low + high) >>> 1;

        if (arr[low] > arr[center]) {
            temp = arr[low];
            arr[low] = arr[center];
            arr[center] = temp;
        }

        if (arr[low] > arr[high]) {
            temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
        }

        if (arr[center] > arr[high]) {
            temp = arr[center];
            arr[center] = arr[high];
            arr[high] = temp;
        }

        temp = arr[center];
        arr[center] = arr[high - 1];
        arr[high - 1] = temp;


        int pivot = arr[high - 1];

        int i = low;
        int j = high;
        while (i <= j) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j) {
                int temp2 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp2;
                i++;
                j--;
            }
        }
        if (low < j)
            sort(arr, low, j);
        if (i < high)
            sort(arr, i, high);
    }

    public static void printArray(int arr[]) {
        for (int anArr : arr) {
            System.out.print(anArr + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {48, 1, 6, 4, 6, 41, 8, 4, 6, 2, 1, 56, 6, 4};
        int n = arr.length;

        QuickSortAscMed qs = new QuickSortAscMed();
        qs.sort(arr, 0, n - 1);
        printArray(arr);
    }
}
