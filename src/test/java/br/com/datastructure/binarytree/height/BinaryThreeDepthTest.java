package br.com.datastructure.binarytree.height;


import br.com.datastructure.binarytree.BinaryNode;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * <i>https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree</i>
 * */
public class BinaryThreeDepthTest {

    @Test
    public void testCreateTree() {
        final BinaryThreeDepth binaryThreeDepth = new BinaryThreeDepth();
        binaryThreeDepth.addNode(new BinaryNode(6));
        binaryThreeDepth.addNode(new BinaryNode(4));
        binaryThreeDepth.addNode(new BinaryNode(8));
        binaryThreeDepth.addNode(new BinaryNode(3));
        binaryThreeDepth.addNode(new BinaryNode(5));
        binaryThreeDepth.addNode(new BinaryNode(7));
        binaryThreeDepth.addNode(new BinaryNode(9));

        System.out.println(binaryThreeDepth);

    }

    @Test
    public void testTreeDepth() {
        final BinaryThreeDepth binaryThreeDepth = new BinaryThreeDepth();
        binaryThreeDepth.addNode(new BinaryNode(6));
        binaryThreeDepth.addNode(new BinaryNode(4));
        binaryThreeDepth.addNode(new BinaryNode(8));
        binaryThreeDepth.addNode(new BinaryNode(3));
        binaryThreeDepth.addNode(new BinaryNode(5));
        binaryThreeDepth.addNode(new BinaryNode(7));
        binaryThreeDepth.addNode(new BinaryNode(9));
        binaryThreeDepth.addNode(new BinaryNode(10));

        int depth = binaryThreeDepth.maxDepth(binaryThreeDepth.getBinaryNode());
        Assert.assertEquals(4, depth);
    }

    @Test
    public void testTreeHeight() {
        final BinaryThreeDepth binaryThreeDepth = new BinaryThreeDepth();
        binaryThreeDepth.addNode(new BinaryNode(3));
        binaryThreeDepth.addNode(new BinaryNode(2));
        binaryThreeDepth.addNode(new BinaryNode(1));
        binaryThreeDepth.addNode(new BinaryNode(5));
        binaryThreeDepth.addNode(new BinaryNode(4));
        binaryThreeDepth.addNode(new BinaryNode(6));
        binaryThreeDepth.addNode(new BinaryNode(7));

        int depth = binaryThreeDepth.maxHeight(binaryThreeDepth.getBinaryNode());
        Assert.assertEquals(3, depth);
    }

    @Test
    public void testTreeTwo() {
        final BinaryThreeDepth binaryThreeDepth = new BinaryThreeDepth();
        binaryThreeDepth.addNode(new BinaryNode(15));

        int depth = binaryThreeDepth.maxHeight(binaryThreeDepth.getBinaryNode());
        Assert.assertEquals(0, depth);
    }

    @Test
    public void testTreeThree() {
        final BinaryThreeDepth binaryThreeDepth = new BinaryThreeDepth();
        binaryThreeDepth.addNode(new BinaryNode(3));
        binaryThreeDepth.addNode(new BinaryNode(1));
        binaryThreeDepth.addNode(new BinaryNode(7));
        binaryThreeDepth.addNode(new BinaryNode(5));
        binaryThreeDepth.addNode(new BinaryNode(4));

        int depth = binaryThreeDepth.maxHeight(binaryThreeDepth.getBinaryNode());
        Assert.assertEquals(3, depth);
    }
}
