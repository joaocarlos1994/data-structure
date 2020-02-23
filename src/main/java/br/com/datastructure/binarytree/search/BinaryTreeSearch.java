package br.com.datastructure.binarytree.search;

import br.com.datastructure.binarytree.AbstractTree;
import br.com.datastructure.binarytree.Node;

import java.util.Objects;

public class BinaryTreeSearch extends AbstractTree {

    public boolean containsNode(final Node node, final int value) {
        if (Objects.isNull(node)) {
            return false;
        } else if (node.getData() == value) {
            return  true;
        }
        return (value < node.getData()) ?  containsNode(node.getLeft(), value) : containsNode(node.getRight(), value);
    }
}
