package sorting;

/**
 * @author Brahim Bahaida
 */
public final class MergeSort {
    /**
     * private constructor.
     */
    private MergeSort() {

    }

    /**
     *
     * @param arr to be sorted
     * @return sorted array
     */

    public static int[] mergeSort(final int[] arr) {
        partitionPhase(arr, 0, arr.length);
        return arr;
    }

    /**
     *
     * @param input array
     * @param start index
     * @param end index
     */

    private static void partitionPhase(
            final int[] input, final int start,
            final int end) {
        if (end - start < 2) {
            return;
        }
        int mid = (start + end) / 2;
        partitionPhase(input, start, mid);
        partitionPhase(input, mid, end);
        mergePhase(input, start, mid, end);
    }

    /**
     *
     * @param input array
     * @param start index
     * @param mid index
     * @param end index
     */
    private static void mergePhase(
            final int[] input, final int start,
            final int mid, final int end) {
        if (input[mid - 1] <= input[mid]) {
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            if (input[i] <= input[j]) {
                temp[tempIndex++] = input[i++];
            } else {
                temp[tempIndex++] = input[j++];
            }

        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
