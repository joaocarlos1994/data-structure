package br.com.datastructure.binarytree.preorder;

import br.com.datastructure.binarytree.BinaryNode;
import org.junit.jupiter.api.Test;

public class BinaryThreePreOrderTraversalTest {


    @Test
    public void testTreeTraversalInsertOrder() {
        final BinaryThreePreOrderTraversal binaryThreeOrderTraversal = new BinaryThreePreOrderTraversal();
        binaryThreeOrderTraversal.addNode(new BinaryNode(1));
        binaryThreeOrderTraversal.addNode(new BinaryNode(2));
        binaryThreeOrderTraversal.addNode(new BinaryNode(5));
        binaryThreeOrderTraversal.addNode(new BinaryNode(3));
        binaryThreeOrderTraversal.addNode(new BinaryNode(6));
        binaryThreeOrderTraversal.addNode(new BinaryNode(4));
        binaryThreeOrderTraversal.preOrder();
    }

}
