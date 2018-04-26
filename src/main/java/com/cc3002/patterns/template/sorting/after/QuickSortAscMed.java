package com.cc3002.patterns.template.sorting.after;

public class QuickSortAscMed extends AbstractQuickSort {
    @Override
    public int getPivot(int[] arr, int low, int high) {
        int center = (low + high) / 2;

        if (arr[low] > arr[center])
            swap(arr, low, center);

        if (arr[low] > arr[high])
            swap(arr, low, high);

        if (arr[center] > arr[high])
            swap(arr, center, high);

        swap(arr, center, high - 1);
        return arr[high - 1];
    }

    @Override
    public boolean shouldSwapForward(int a, int b) {
        return a < b;
    }

    @Override
    public boolean shouldSwapBackward(int a, int b) {
        return a > b;
    }
}
