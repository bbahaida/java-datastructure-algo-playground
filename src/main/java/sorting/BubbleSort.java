package sorting;

import utils.Utils;

/**
 * @author Brahim Bahaida
 */
public final class BubbleSort {

    /**
     * private constructor.
     */
    private BubbleSort() {

    }


    /**
     *
     * @param arr to be sorted
     * @return sorted array
     */

    // stable O(n^2)
    public static int[] bubbleSort(final int[] arr) {

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
