package tree;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class TreeCheckerTest {
    TreeChecker treeChecker = new TreeChecker();
    @Test
    public void compare_ShouldBeTrue() {

        BST treeA= new BST();

        treeA.add(treeA.root, treeA.NodeCreate(10));
        treeA.add(treeA.root, treeA.NodeCreate(9));
        treeA.add(treeA.root, treeA.NodeCreate(11));
        treeA.add(treeA.root, treeA.NodeCreate(11));
        treeA.add(treeA.root, treeA.NodeCreate(3));

        BST treeB= new BST();

        treeB.add(treeB.root, treeB.NodeCreate(9));
        treeB.add(treeB.root, treeB.NodeCreate(10));
        treeB.add(treeB.root, treeB.NodeCreate(3));
        treeB.add(treeB.root, treeB.NodeCreate(11));
        System.out.println(treeA.root.left.hashCode());
        assertThat(treeChecker.compare(treeA, treeB)).isTrue();
    }
    @Test
    public void compare_ShouldBeFalse() {

        BST treeA= new BST();

        treeA.add(treeA.root, treeA.NodeCreate(13));
        treeA.add(treeA.root, treeA.NodeCreate(12));

        BST treeB= new BST();

        treeB.add(treeB.root, treeB.NodeCreate(12));
        treeB.add(treeB.root, treeB.NodeCreate(10));
        treeB.add(treeB.root, treeB.NodeCreate(11));
        assertThat(treeChecker.compare(treeA, treeB)).isFalse();
    }
}