package sorting;

import Performence.Timeit;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class SortingTest {

    int[] entry     = {20,35,-15,7,55,1,-22,43,45,67,-25,77,9,-1};
    int[] expecteds = {-25,-22,-15,-1,1,7,9,20,35,43,45,55,67,77};

    @Test
    public void testBubbleSort(){
        // arrange

        // act
        int[] actuales = BubbleSort.bubbleSort(entry);
        // assert
        assertArrayEquals(expecteds,actuales);
    }

    @Test
    public void testSelectionSort(){
        // arrange

        // act
        int[] actuales = SelectionSort.selectionSort(entry);
        // assert
        assertArrayEquals(expecteds,actuales);
    }
    @Test
    public void testInsertionSort(){
        // arrange

        // act
        int[] actuales = InsertionSort.insertionSort(entry);
        // assert
        assertArrayEquals(expecteds,actuales);
    }

    @Test
    public void testShellSort(){
        // arrange

        // act
        int[] actuales = ShellSort.shellsort(entry);
        // assert
        assertArrayEquals(expecteds,actuales);
    }


}