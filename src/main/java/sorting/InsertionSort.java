package sorting;

public class InsertionSort {
    // stable O(n^2)
    public static int[] insertionSort(int[] arr){
        for (int i=1; i<arr.length; i++){
            int newElement = arr[i];
            int j;
            for (j = i ; j>0 && arr[j-1] > newElement; j--){
                arr[j] = arr[j-1];
            }
            arr[j] = newElement;
        }

        return arr;
    }
}
