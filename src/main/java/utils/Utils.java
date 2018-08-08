package utils;

/**
 * @author Brahim Bahaida
 */
public final class Utils {

    /**
     * private constructor.
     */
    private Utils() {

    }

    /**
     *
     * @param arr to be swapped
     * @param i first index
     * @param j second index
     */

    public static void swap(final int[] arr, final int i, final int j) {
        if (i == j) {
            return;
        }
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
