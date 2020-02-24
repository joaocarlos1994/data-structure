package br.com.datastructure.binarytree;

public class BinaryNode {

    private final int data;
    private BinaryNode right;
    private BinaryNode left;

    public BinaryNode(int data) {
        this.data = data;
        this.right = null;
        this.left = null;
    }

    public void addLeftNode(final BinaryNode binaryNode) {
        this.left = binaryNode;
    }

    public void addRightNode(final BinaryNode binaryNode) {
        this.right = binaryNode;
    }

    public BinaryNode getRight() {
        return right;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public int getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Node{" + "data=" + data + '}';
    }
}
