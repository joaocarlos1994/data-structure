package br.com.datastructure.binarytree.read;


import br.com.datastructure.binarytree.Node;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class BinaryThreeReadTest {

    @Test
    public void testTreeDepth() {
        final BinaryTreeRead binaryTreeTotalNodes = new BinaryTreeRead();
        binaryTreeTotalNodes.addNode(new Node(6));
        binaryTreeTotalNodes.addNode(new Node(4));
        binaryTreeTotalNodes.addNode(new Node(8));
        binaryTreeTotalNodes.addNode(new Node(3));
        binaryTreeTotalNodes.addNode(new Node(5));
        binaryTreeTotalNodes.addNode(new Node(7));
        binaryTreeTotalNodes.addNode(new Node(9));
        binaryTreeTotalNodes.addNode(new Node(10));

        binaryTreeTotalNodes.read();
    }
}
