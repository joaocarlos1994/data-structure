package br.com.datastructure.binarytree.binarytreesearch;


import br.com.datastructure.binarytree.BinaryNode;
import br.com.datastructure.binarytree.search.BinaryTreeSearch;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class BinaryThreeSearchTest {

    @Test
    public void testTreeDepth() {
        final BinaryTreeSearch binaryThreeDepth = new BinaryTreeSearch();
        binaryThreeDepth.addNode(new BinaryNode(6));
        binaryThreeDepth.addNode(new BinaryNode(4));
        binaryThreeDepth.addNode(new BinaryNode(8));
        binaryThreeDepth.addNode(new BinaryNode(3));
        binaryThreeDepth.addNode(new BinaryNode(5));
        binaryThreeDepth.addNode(new BinaryNode(7));
        binaryThreeDepth.addNode(new BinaryNode(9));
        binaryThreeDepth.addNode(new BinaryNode(10));


        boolean containsNodeTrue = binaryThreeDepth.containsNode(binaryThreeDepth.getBinaryNode(), 10);
        boolean containsNodeFalse = binaryThreeDepth.containsNode(binaryThreeDepth.getBinaryNode(), 2);

        Assert.assertTrue(containsNodeTrue);
        Assert.assertFalse(containsNodeFalse);
    }
}
