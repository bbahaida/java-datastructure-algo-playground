package sorting;

import utils.Utils;

public class SelectionSort {

    private SelectionSort(){

    }

    /**
     *
     * @param arr
     * @return
     */

    // unstable O(n^2) better than bubble because of the number of swaps
    public static int[] selectionSort(final int [] arr){
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
