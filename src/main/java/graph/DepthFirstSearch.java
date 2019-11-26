package graph;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.Stack;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DepthFirstSearch {
    private int size;
    private AdjacencyList[] array;

    public DepthFirstSearch(int size) {
        this.size = size;
        array = new AdjacencyList[size];
        for (int i = 0; i < size; i++) {
            array[i] = new AdjacencyList();
            array[i].setHead(null);
        }
    }

    public void add(int src, int dest) {
        Node node = new Node(dest, null);
        node.setNext(array[src].getHead());
        array[src].setHead(node);
    }

    public void explore(int startVertex) {
        boolean[] visited = new boolean[size];
        for (int i = 0; i < size; i++) visited[i] = false;
        Stack<Integer> stack = new Stack<>();
        stack.push(startVertex);
        while (!stack.isEmpty()) {
            int n = stack.pop();
            stack.push(n);
            visited[n] = true;
            Node head = array[n].getHead();
            boolean isDone = true;
            while (head != null) {
                if (!visited[head.getValue()]) {
                    stack.push(head.getValue());
                    visited[head.getValue()] = true;
                    isDone = false;
                    break;
                } else {
                    head = head.getNext();
                }
            }
            if (isDone) {
                int out = stack.pop();
                System.out.println("visited node: " + out);
            }
        }
    }
}
