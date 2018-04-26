package com.cc3002.patterns.template.sorting.before;


public class QuickSortAscLow {

    public void sort(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i <= j) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
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

        QuickSortAscLow qs = new QuickSortAscLow();
        qs.sort(arr, 0, n - 1);
        printArray(arr);
    }
}
