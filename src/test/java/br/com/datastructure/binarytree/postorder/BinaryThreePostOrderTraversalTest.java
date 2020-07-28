package br.com.datastructure.binarytree.postorder;

import br.com.datastructure.binarytree.BinaryNode;
import br.com.datastructure.binarytree.preorder.BinaryThreePreOrderTraversal;
import org.junit.jupiter.api.Test;

public class BinaryThreePostOrderTraversalTest {

    @Test
    public void testTreeTraversalInsertOrder() {
        final BinaryThreePostOrderTraversal binaryThreePostOrderTraversal = new BinaryThreePostOrderTraversal();
        binaryThreePostOrderTraversal.addNode(new BinaryNode(1));
        binaryThreePostOrderTraversal.addNode(new BinaryNode(2));
        binaryThreePostOrderTraversal.addNode(new BinaryNode(5));
        binaryThreePostOrderTraversal.addNode(new BinaryNode(3));
        binaryThreePostOrderTraversal.addNode(new BinaryNode(4));
        binaryThreePostOrderTraversal.addNode(new BinaryNode(6));
        binaryThreePostOrderTraversal.postOrder();
    }


}
