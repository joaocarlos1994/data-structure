package br.com.datastructure.binarytree.height;

import br.com.datastructure.binarytree.AbstractTree;
import br.com.datastructure.binarytree.BinaryNode;

import java.util.Objects;

public class BinaryThreeDepth extends AbstractTree {

    public int maxDepth(final BinaryNode binaryNode) {

        if (Objects.isNull(binaryNode)) {
            return 0;
        } else {

            int leftDepth = maxDepth(binaryNode.getLeft());
            int rightDepth = maxDepth(binaryNode.getRight());

            if (leftDepth > rightDepth) {
                return (leftDepth + 1);
            }
            return (rightDepth + 1);
        }
    }

    public int maxHeight(final BinaryNode root) {
        if (Objects.isNull(root)) {
            return -1;
        } else {

            int leftHeight = maxHeight(root.getLeft());
            int rightHeight = maxHeight(root.getRight());

            if (leftHeight > rightHeight) {
                return leftHeight + 1;
            }
            return rightHeight + 1;
        }
    }
}
