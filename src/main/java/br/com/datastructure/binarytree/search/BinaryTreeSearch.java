package br.com.datastructure.binarytree.search;

import br.com.datastructure.binarytree.AbstractTree;
import br.com.datastructure.binarytree.BinaryNode;

import java.util.Objects;

public class BinaryTreeSearch extends AbstractTree {

    public boolean containsNode(final BinaryNode binaryNode, final int value) {
        if (Objects.isNull(binaryNode)) {
            return false;
        } else if (binaryNode.getData() == value) {
            return  true;
        }
        return (value < binaryNode.getData()) ?  containsNode(binaryNode.getLeft(), value) : containsNode(binaryNode.getRight(), value);
    }
}
