package tree;

import java.util.Set;

public class TreeChecker {

    public boolean compare(BST treeA, BST treeB){
        return compareAsSet(treeA.toSet(), treeB.toSet());
    }

    private boolean compareAsSet(Set<Integer> treeSetA, Set<Integer> treeSetB) {
        return treeSetA.size() == treeSetB.size() && treeSetA.containsAll(treeSetB);
    }
}
