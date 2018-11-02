package backtracking;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueenTest {

    @Test
    public void shouldReturnNull(){
        Queen queen = new Queen(2);

        String expected = null;

        String actual = queen.solve();

        assertEquals(expected, actual);
    }

    /*
     --N-
     N---
     ---N
     -N--
     */

    @Test
    public void shouldReturnSolutionFor4(){
        Queen queen = new Queen(4);

        String expected = "--N-\n" +
                "N---\n" +
                "---N\n" +
                "-N--\n";

        String actual = queen.solve();

        assertEquals(expected, actual);
    }
}