package sorting;

import Performence.Timeit;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class SortingTest {


    @Test
    public void testBubbleSort(){
        // arrange
        int[] entry     = {20,35,-15,7,55,1,-22,43,45,67,-25,77,9,-1};
        int[] expecteds = {-25,-22,-15,-1,1,7,9,20,35,43,45,55,67,77};
        // act
        int[] actuales = BubbleSort.bubbleSort(entry);
        // assert
        assertArrayEquals(expecteds,actuales);
    }

    @Test
    public void testSelectionSort(){
        // arrange
        int[] entry     = {20,35,-15,7,55,1,-22,43,45,67,-25,77,9,-1};
        int[] expecteds = {-25,-22,-15,-1,1,7,9,20,35,43,45,55,67,77};
        // act
        int[] actuales = SelectionSort.selectionSort(entry);
        // assert
        assertArrayEquals(expecteds,actuales);
    }
    @Test
    public void testInsertionSort(){
        // arrange
        int[] entry     = {20,35,-15,7,55,1,-22,43,45,67,-25,77,9,-1};
        int[] expecteds = {-25,-22,-15,-1,1,7,9,20,35,43,45,55,67,77};
        // act
        int[] actuales = InsertionSort.insertionSort(entry);
        // assert
        assertArrayEquals(expecteds,actuales);
    }

    @Test
    public void testShellSort(){
        // arrange
        int[] entry     = {20,35,-15,7,55,1,-22,43,45,67,-25,77,9,-1};
        int[] expecteds = {-25,-22,-15,-1,1,7,9,20,35,43,45,55,67,77};
        // act
        int[] actuales = ShellSort.shellsort(entry);
        // assert
        assertArrayEquals(expecteds,actuales);
    }

    @Test
    public void testMergeSort(){
        // arrange
        int[] entry     = {20,35,-15,7,55,1,-22,43,45,67,-25,77,9,-1};
        int[] expecteds = {-25,-22,-15,-1,1,7,9,20,35,43,45,55,67,77};
        // act
        int[] actuales = MergeSort.mergeSort(entry);
        // assert
        assertArrayEquals(expecteds,actuales);
    }

    @Test
    public void testSpeed(){
        // arrange
        int[] entry1     = {20,35,-15,7,55,1,-22,43,45,67,-25,77,9,-1};
        int[] entry2     = {20,35,-15,7,55,1,-22,43,45,67,-25,77,9,-1};
        // act
        double mergeSortTime = Timeit.code(() -> MergeSort.mergeSort(entry1));
        double bubbleSortTime = Timeit.code(() -> BubbleSort.bubbleSort(entry2));

        // assert
        assertTrue( mergeSortTime < bubbleSortTime);
    }
}