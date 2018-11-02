package sesame;

import org.junit.Test;

import static org.junit.Assert.*;

public class SesameTest {

    @Test
    public void testBrailleDecode() {
        // arrange
        String braille = "**----***-*-*-----**--*--*-*--*-**--";
        String expected = "brahim";
        // act
        String actual = Braille.decode(braille);
        // assert
        assertEquals(expected,actual);
    }

    @Test
    public void testMonotonousSuite(){
        // arrange
        int[] entry = {1,4,7,5,3,1,0,6};
        int[] expected = {7,5,3,1,0};
        // act
        int[] actual = SuiteMonotone.longestMonotonousSuite(entry);
        // assert
        assertArrayEquals(expected,actual);
    }

}