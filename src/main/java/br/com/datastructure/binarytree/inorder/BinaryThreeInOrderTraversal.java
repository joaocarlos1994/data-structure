package br.com.datastructure.binarytree.inorder;

import br.com.datastructure.binarytree.BinaryNode;
import br.com.datastructure.binarytree.height.BinaryThreeDepth;

public class BinaryThreeInOrderTraversal extends BinaryThreeDepth {

    public void inOrder() {
        this.inOrder(this.binaryNode);
    }

    public void inOrder(final BinaryNode root) {
        if (root ==  null) {
            return;
        }
        inOrder(root.getLeft());
        System.out.print(root.getData() + " ");
        inOrder(root.getRight());
    }
}
