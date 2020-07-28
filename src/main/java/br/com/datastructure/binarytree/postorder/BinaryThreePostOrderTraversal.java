package br.com.datastructure.binarytree.postorder;

import br.com.datastructure.binarytree.BinaryNode;
import br.com.datastructure.binarytree.height.BinaryThreeDepth;

public class BinaryThreePostOrderTraversal extends BinaryThreeDepth {

    public void postOrder() {
        this.postOrder(this.binaryNode);
    }

    public void postOrder(final BinaryNode root) {
        if (root ==  null) {
            return;
        }
        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.print(root.getData() + " ");
    }

}
