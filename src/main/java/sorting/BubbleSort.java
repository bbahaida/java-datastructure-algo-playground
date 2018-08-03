package sorting;

import Utils.Utils;

public class BubbleSort {
    // stable O(n^2)
    public static int[] bubbleSort(int[] arr) {

        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    Utils.swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }
    public static double[] bubbleSort(double[] arr) {

        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    Utils.swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }
}