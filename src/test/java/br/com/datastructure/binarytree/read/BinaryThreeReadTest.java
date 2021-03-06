package br.com.datastructure.binarytree.read;


import br.com.datastructure.binarytree.BinaryNode;
import org.junit.jupiter.api.Test;

public class BinaryThreeReadTest {

    @Test
    public void testTreeDepth() {
        final BinaryTreeRead binaryTreeTotalNodes = new BinaryTreeRead();
        binaryTreeTotalNodes.addNode(new BinaryNode(6));
        binaryTreeTotalNodes.addNode(new BinaryNode(4));
        binaryTreeTotalNodes.addNode(new BinaryNode(8));
        binaryTreeTotalNodes.addNode(new BinaryNode(3));
        binaryTreeTotalNodes.addNode(new BinaryNode(5));
        binaryTreeTotalNodes.addNode(new BinaryNode(7));
        binaryTreeTotalNodes.addNode(new BinaryNode(9));
        binaryTreeTotalNodes.addNode(new BinaryNode(10));

        binaryTreeTotalNodes.read();
    }
}
