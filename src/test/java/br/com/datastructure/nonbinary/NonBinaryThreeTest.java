package br.com.datastructure.nonbinary;


import org.junit.jupiter.api.Test;

public class NonBinaryThreeTest {

    @Test
    public void testTreeDepth() {
        final NonBinaryTreeInverseOrder nonBinaryTreeInverseOrder = new NonBinaryTreeInverseOrder();
        nonBinaryTreeInverseOrder.addNode(new NonBinaryNode(8), null);

        nonBinaryTreeInverseOrder.addNode(new NonBinaryNode(15), new NonBinaryNode(8));
        nonBinaryTreeInverseOrder.addNode(new NonBinaryNode(20), new NonBinaryNode(15));
        nonBinaryTreeInverseOrder.addNode(new NonBinaryNode(10), new NonBinaryNode(15));
        nonBinaryTreeInverseOrder.addNode(new NonBinaryNode(28), new NonBinaryNode(15));

        nonBinaryTreeInverseOrder.addNode(new NonBinaryNode(23), new NonBinaryNode(8));

        nonBinaryTreeInverseOrder.addNode(new NonBinaryNode(2), new NonBinaryNode(8));
        nonBinaryTreeInverseOrder.addNode(new NonBinaryNode(36), new NonBinaryNode(2));
        nonBinaryTreeInverseOrder.addNode(new NonBinaryNode(7), new NonBinaryNode(2));

        System.out.println(nonBinaryTreeInverseOrder);

    }


    @Test
    public void testTreeDepth2() {
        final NonBinaryTree nonBinaryTreeInverseOrder = new NonBinaryTree();
        nonBinaryTreeInverseOrder.addNode(new NonBinaryNode(8), null);

        nonBinaryTreeInverseOrder.addNode(new NonBinaryNode(15), new NonBinaryNode(8));
        nonBinaryTreeInverseOrder.addNode(new NonBinaryNode(20), new NonBinaryNode(15));
        nonBinaryTreeInverseOrder.addNode(new NonBinaryNode(10), new NonBinaryNode(15));
        nonBinaryTreeInverseOrder.addNode(new NonBinaryNode(28), new NonBinaryNode(15));

        nonBinaryTreeInverseOrder.addNode(new NonBinaryNode(23), new NonBinaryNode(8));

        nonBinaryTreeInverseOrder.addNode(new NonBinaryNode(2), new NonBinaryNode(8));
        nonBinaryTreeInverseOrder.addNode(new NonBinaryNode(36), new NonBinaryNode(2));
        nonBinaryTreeInverseOrder.addNode(new NonBinaryNode(7), new NonBinaryNode(2));

        nonBinaryTreeInverseOrder.read();
    }
}
