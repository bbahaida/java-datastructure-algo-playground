package Utils;

public class Utils {
    /**
     *
     * @param arr
     * @param i
     * @param j
     */
    public static void swap(final int[] arr, final int i, final int j) {
        if (i == j) return;
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
