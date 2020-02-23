package br.com.datastructure.binarytree.height;


import br.com.datastructure.binarytree.Node;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class BinaryThreeDepthTest {

    @Test
    public void testCreateTree() {
        final BinaryThreeDepth binaryThreeDepth = new BinaryThreeDepth();
        binaryThreeDepth.addNode(new Node(6));
        binaryThreeDepth.addNode(new Node(4));
        binaryThreeDepth.addNode(new Node(8));
        binaryThreeDepth.addNode(new Node(3));
        binaryThreeDepth.addNode(new Node(5));
        binaryThreeDepth.addNode(new Node(7));
        binaryThreeDepth.addNode(new Node(9));

        System.out.println(binaryThreeDepth);

    }

    @Test
    public void testTreeDepth() {
        final BinaryThreeDepth binaryThreeDepth = new BinaryThreeDepth();
        binaryThreeDepth.addNode(new Node(6));
        binaryThreeDepth.addNode(new Node(4));
        binaryThreeDepth.addNode(new Node(8));
        binaryThreeDepth.addNode(new Node(3));
        binaryThreeDepth.addNode(new Node(5));
        binaryThreeDepth.addNode(new Node(7));
        binaryThreeDepth.addNode(new Node(9));
        binaryThreeDepth.addNode(new Node(10));

        int depth = binaryThreeDepth.maxDepth(binaryThreeDepth.getNode());
        Assert.assertEquals(4, depth);
    }
}
