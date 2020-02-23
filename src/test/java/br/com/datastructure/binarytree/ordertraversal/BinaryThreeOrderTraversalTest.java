package br.com.datastructure.binarytree.ordertraversal;


import br.com.datastructure.binarytree.Node;
import br.com.datastructure.binarytree.height.BinaryThreeDepth;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class BinaryThreeOrderTraversalTest {


    @Test
    public void testTreeDepth() {
        final BinaryThreeOrderTraversal binaryThreeOrderTraversal = new BinaryThreeOrderTraversal();
        binaryThreeOrderTraversal.addNode(new Node(6));
        binaryThreeOrderTraversal.addNode(new Node(4));
        binaryThreeOrderTraversal.addNode(new Node(8));
        binaryThreeOrderTraversal.addNode(new Node(3));
        binaryThreeOrderTraversal.addNode(new Node(5));
        binaryThreeOrderTraversal.addNode(new Node(7));
        binaryThreeOrderTraversal.addNode(new Node(9));
        binaryThreeOrderTraversal.addNode(new Node(10));

        Assert.assertEquals("6 4 8 3 5 7 9 10 ",  binaryThreeOrderTraversal.printLevelOrder());
    }
}
