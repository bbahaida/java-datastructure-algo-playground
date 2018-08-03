package sorting;

import Utils.Utils;

public class SelectionSort {
    // unstable O(n^2)
    public static int[] selectionSort(int [] arr){
        int index;

        for (int i = arr.length - 1 ; i > 0; i--){
            index = 0;
            for (int j = 1; j <= i; j++){
                if(arr[index] < arr[j]){
                    index = j;
                }
            }
            Utils.swap(arr,i,index);
        }

        return arr;

    }


}
