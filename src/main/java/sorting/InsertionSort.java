package sorting;

/**
 * @author Brahim Bahaida
 */
public final class InsertionSort {
    /**
     * private constructor.
     */
    private InsertionSort() {

    }

    /**
     *
     * @param arr to be sorted
     * @return sorted array
     */

    // stable O(n^2)
    public static int[] insertionSort(final int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int newElement = arr[i];
            int j;
            for (j = i; j > 0 && arr[j - 1] > newElement; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = newElement;
        }

        return arr;
    }
}
