package br.com.datastructure.binarytree.height;

import br.com.datastructure.binarytree.AbstractTree;
import br.com.datastructure.binarytree.Node;

import java.util.Objects;

public class BinaryThreeDepth extends AbstractTree {

    public int maxDepth(final Node node) {

        if (Objects.isNull(node)) {
            return 0;
        } else {

            int leftDepth = maxDepth(node.getLeft());
            int rightDepth = maxDepth(node.getRight());

            if (leftDepth > rightDepth) {
                return (leftDepth + 1);
            }
            return (rightDepth + 1);
        }
    }

}
