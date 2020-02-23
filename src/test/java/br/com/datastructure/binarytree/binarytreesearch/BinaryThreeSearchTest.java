package br.com.datastructure.binarytree.binarytreesearch;


import br.com.datastructure.binarytree.Node;
import br.com.datastructure.binarytree.search.BinaryTreeSearch;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class BinaryThreeSearchTest {

    @Test
    public void testTreeDepth() {
        final BinaryTreeSearch binaryThreeDepth = new BinaryTreeSearch();
        binaryThreeDepth.addNode(new Node(6));
        binaryThreeDepth.addNode(new Node(4));
        binaryThreeDepth.addNode(new Node(8));
        binaryThreeDepth.addNode(new Node(3));
        binaryThreeDepth.addNode(new Node(5));
        binaryThreeDepth.addNode(new Node(7));
        binaryThreeDepth.addNode(new Node(9));
        binaryThreeDepth.addNode(new Node(10));


        boolean containsNodeTrue = binaryThreeDepth.containsNode(binaryThreeDepth.getNode(), 10);
        boolean containsNodeFalse = binaryThreeDepth.containsNode(binaryThreeDepth.getNode(), 2);

        Assert.assertTrue(containsNodeTrue);
        Assert.assertFalse(containsNodeFalse);
    }
}
