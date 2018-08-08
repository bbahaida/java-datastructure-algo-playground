package sorting;

public class MergeSort {

    public static int[] mergeSort(int[] arr) {
        partitionPhase(arr, 0, arr.length);
        return arr;
    }

    private static void partitionPhase(int[] input, int start, int end){
        if(end - start < 2)
            return;
        int mid = (start+end)/2;
        partitionPhase(input, start, mid);
        partitionPhase(input, mid, end);
        mergePhase(input, start, mid, end);
    }
    private static void mergePhase(int[] input, int start, int mid, int end){
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
