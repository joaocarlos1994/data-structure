package br.com.datastructure.binarytree.inorder;

import br.com.datastructure.binarytree.BinaryNode;
import br.com.datastructure.binarytree.postorder.BinaryThreePostOrderTraversal;
import org.junit.jupiter.api.Test;

public class BinaryThreeInOrderTraversalTest {

    @Test
    public void testTreeTraversalInsertOrder() {
        final BinaryThreeInOrderTraversal binaryThreePostOrderTraversal = new BinaryThreeInOrderTraversal();
        binaryThreePostOrderTraversal.addNode(new BinaryNode(1));
        binaryThreePostOrderTraversal.addNode(new BinaryNode(2));
        binaryThreePostOrderTraversal.addNode(new BinaryNode(5));
        binaryThreePostOrderTraversal.addNode(new BinaryNode(3));
        binaryThreePostOrderTraversal.addNode(new BinaryNode(4));
        binaryThreePostOrderTraversal.addNode(new BinaryNode(6));
        binaryThreePostOrderTraversal.inOrder();
    }


}
