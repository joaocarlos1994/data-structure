package br.com.datastructure.binarytree.totalnodes;


import br.com.datastructure.binarytree.BinaryNode;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class BinaryThreeTotalNodesTest {

    @Test
    public void testTreeDepth() {
        final BinaryTreeTotalNodes binaryTreeTotalNodes = new BinaryTreeTotalNodes();
        binaryTreeTotalNodes.addNode(new BinaryNode(6));
        binaryTreeTotalNodes.addNode(new BinaryNode(4));
        binaryTreeTotalNodes.addNode(new BinaryNode(8));
        binaryTreeTotalNodes.addNode(new BinaryNode(3));
        binaryTreeTotalNodes.addNode(new BinaryNode(5));
        binaryTreeTotalNodes.addNode(new BinaryNode(7));
        binaryTreeTotalNodes.addNode(new BinaryNode(9));
        binaryTreeTotalNodes.addNode(new BinaryNode(10));

        int totalNodes = binaryTreeTotalNodes.totalNodes(binaryTreeTotalNodes.getBinaryNode());
        Assert.assertEquals(8, totalNodes);
    }
}
