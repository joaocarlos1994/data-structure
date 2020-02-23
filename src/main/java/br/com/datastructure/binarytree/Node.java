package br.com.datastructure.binarytree;

import java.util.Objects;

public class Node {

    private final int data;
    private Node right;
    private Node left;

    public Node(int data) {
        this.data = data;
        this.right = null;
        this.left = null;
    }

    public void addLeftNode(final Node node) {
        this.left = node;
    }

    public void addRightNode(final Node node) {
        this.right = node;
    }

    public Node getRight() {
        return right;
    }

    public Node getLeft() {
        return left;
    }

    public int getData() {
        return data;
    }
}
