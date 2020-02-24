package br.com.datastructure.binarytree.totalnodes;

import br.com.datastructure.binarytree.AbstractTree;
import br.com.datastructure.binarytree.BinaryNode;

import java.util.Objects;

public class BinaryTreeTotalNodes extends AbstractTree {

    public int totalNodes(final BinaryNode binaryNode) {
        if (Objects.isNull(binaryNode)) {
            return 0;
        }
        return totalNodes(binaryNode.getLeft()) + 1 + totalNodes(binaryNode.getRight());
    }
}
