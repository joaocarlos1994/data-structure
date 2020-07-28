package br.com.datastructure.binarytree.preorder;

import br.com.datastructure.binarytree.BinaryNode;
import br.com.datastructure.binarytree.height.BinaryThreeDepth;

public class BinaryThreePreOrderTraversal extends BinaryThreeDepth {

    public void preOrder() {
        preOrder(this.binaryNode);
    }

    public void preOrder(final BinaryNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.getData() + " ");
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }
}
