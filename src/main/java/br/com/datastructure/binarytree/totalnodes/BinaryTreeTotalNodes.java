package br.com.datastructure.binarytree.totalnodes;

import br.com.datastructure.binarytree.AbstractTree;
import br.com.datastructure.binarytree.Node;

import java.util.Objects;

public class BinaryTreeTotalNodes extends AbstractTree {

    public int totalNodes(final Node node) {
        if (Objects.isNull(node)) {
            return 0;
        }
        return totalNodes(node.getLeft()) + 1 + totalNodes(node.getRight());
    }
}
