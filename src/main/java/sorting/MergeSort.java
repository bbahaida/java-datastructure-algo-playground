package sorting;

public class MergeSort {

    /**
     *
     * @param arr
     * @return
     */
    public static int[] mergeSort(final int[] arr) {
        partitionPhase(arr, 0, arr.length);
        return arr;
    }

    /**
     *
     * @param input
     * @param start
     * @param end
     */
    private static void partitionPhase(final int[] input, final int start, final int end){
        if(end - start < 2)
            return;
        int mid = (start+end)/2;
        partitionPhase(input, start, mid);
        partitionPhase(input, mid, end);
        mergePhase(input, start, mid, end);
    }
    private static void mergePhase(final int[] input, final int start, final int mid, final int end){
        if(input[mid - 1] <= input[mid])
            return;
        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end -start];
        while (i < mid && j < end){
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }


}
