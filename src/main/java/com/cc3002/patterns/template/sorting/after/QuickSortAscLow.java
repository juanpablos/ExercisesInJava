package com.cc3002.patterns.template.sorting.after;

public class QuickSortAscLow extends AbstractQuickSort {
    @Override
    public int getPivot(int[] arr, int low, int high) {
        return arr[low];
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
