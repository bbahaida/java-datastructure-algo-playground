package graph;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DepthFirstSearchTest {
    DepthFirstSearch depthFirstSearch = new DepthFirstSearch(6);
    @BeforeEach
    public void setUp(){
        depthFirstSearch.add(0, 2);
        depthFirstSearch.add(0, 1);
        depthFirstSearch.add(1, 4);
        depthFirstSearch.add(1, 3);
        depthFirstSearch.add(1, 0);
        depthFirstSearch.add(3, 1);
        depthFirstSearch.add(4, 1);
        depthFirstSearch.add(2, 5);
        depthFirstSearch.add(2, 0);
        depthFirstSearch.add(5, 2);
    }
    @Test
    public void search() {

        depthFirstSearch.explore(5);
    }
}
