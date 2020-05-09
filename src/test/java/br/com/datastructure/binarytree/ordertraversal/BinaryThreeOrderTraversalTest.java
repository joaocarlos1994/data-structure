package br.com.datastructure.binarytree.ordertraversal;


import br.com.datastructure.binarytree.BinaryNode;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * <i>https://www.hackerrank.com/challenges/tree-level-order-traversal/problem</i>
 * */
public class BinaryThreeOrderTraversalTest {


    @Test
    public void testTreeTraversalInsertOrder() {
        final BinaryThreeOrderTraversal binaryThreeOrderTraversal = new BinaryThreeOrderTraversal();
        binaryThreeOrderTraversal.addNode(new BinaryNode(6));
        binaryThreeOrderTraversal.addNode(new BinaryNode(4));
        binaryThreeOrderTraversal.addNode(new BinaryNode(8));
        binaryThreeOrderTraversal.addNode(new BinaryNode(3));
        binaryThreeOrderTraversal.addNode(new BinaryNode(5));
        binaryThreeOrderTraversal.addNode(new BinaryNode(7));
        binaryThreeOrderTraversal.addNode(new BinaryNode(9));
        binaryThreeOrderTraversal.addNode(new BinaryNode(10));

        Assert.assertEquals("6 4 8 3 5 7 9 10 ",  binaryThreeOrderTraversal.printLevelOrderInsertSequence());
    }


    @Test
    public void testTreeTraversal() {
        final BinaryThreeOrderTraversal binaryThreeOrderTraversal = new BinaryThreeOrderTraversal();
        binaryThreeOrderTraversal.addNode(new BinaryNode(1));
        binaryThreeOrderTraversal.addNode(new BinaryNode(2));
        binaryThreeOrderTraversal.addNode(new BinaryNode(5));
        binaryThreeOrderTraversal.addNode(new BinaryNode(3));
        binaryThreeOrderTraversal.addNode(new BinaryNode(4));
        binaryThreeOrderTraversal.addNode(new BinaryNode(6));

        binaryThreeOrderTraversal.printLevelTraversalOrder();
        Assert.assertEquals("1 -> 2 -> 5 -> 3 -> 6 -> 4",  "1 -> 2 -> 5 -> 3 -> 6 -> 4");
    }
}
