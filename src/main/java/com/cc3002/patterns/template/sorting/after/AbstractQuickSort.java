package com.cc3002.patterns.template.sorting.after;

public abstract class AbstractQuickSort implements QuickSort {

    public abstract int getPivot(int arr[], int low, int high);

    public abstract boolean shouldSwapForward(int a, int b);

    public abstract boolean shouldSwapBackward(int a, int b);

    protected void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    @Override
    public void sort(int arr[], int low, int high) {
        int pivot = getPivot(arr, low, high);
        int i = low;
        int j = high;
        while (i <= j) {
            while (shouldSwapForward(arr[i], pivot))
                i++;
            while (shouldSwapBackward(arr[j], pivot))
                j--;
            if (i <= j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        if (low < j)
            sort(arr, low, j);
        if (i < high)
            sort(arr, i, high);
    }
}
