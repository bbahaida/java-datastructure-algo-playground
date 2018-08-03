package sorting;

import org.junit.Test;

import static org.junit.Assert.*;


public class SortingTest {

    @Test
    public void testBubbleSort(){
        // arrange

        int[] entry = {20,35,-15,7,55,1,-22};
        int[] expecteds = {-22,-15,1,7,20,35,55};
        // act
        int[] actueles = BubbleSort.bubbleSort(entry);
        // assert
        assertArrayEquals(expecteds,actueles);
    }

    @Test
    public void testSelectionSort(){
        // arrange
        int[] entry = {20,35,-15,7,55,1,-22};
        int[] expecteds = {-22,-15,1,7,20,35,55};
        // act
        int[] actueles = SelectionSort.selectionSort(entry);
        // assert
        assertArrayEquals(expecteds,actueles);
    }
    @Test
    public void testInsertionSort(){
        // arrange

        int[] entry = {20,35,-15,7,55,1,-22};
        int[] expecteds = {-22,-15,1,7,20,35,55};
        // act
        int[] actueles = InsertionSort.insertionSort(entry);
        // assert
        assertArrayEquals(expecteds,actueles);
    }
}