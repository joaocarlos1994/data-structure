package br.com.datastructure.binarytree.totalnodes;


import br.com.datastructure.binarytree.Node;
import br.com.datastructure.binarytree.height.BinaryThreeDepth;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class BinaryThreeTotalNodesTest {

    @Test
    public void testTreeDepth() {
        final BinaryTreeTotalNodes binaryTreeTotalNodes = new BinaryTreeTotalNodes();
        binaryTreeTotalNodes.addNode(new Node(6));
        binaryTreeTotalNodes.addNode(new Node(4));
        binaryTreeTotalNodes.addNode(new Node(8));
        binaryTreeTotalNodes.addNode(new Node(3));
        binaryTreeTotalNodes.addNode(new Node(5));
        binaryTreeTotalNodes.addNode(new Node(7));
        binaryTreeTotalNodes.addNode(new Node(9));
        binaryTreeTotalNodes.addNode(new Node(10));

        int totalNodes = binaryTreeTotalNodes.totalNodes(binaryTreeTotalNodes.getNode());
        Assert.assertEquals(8, totalNodes);
    }
}
