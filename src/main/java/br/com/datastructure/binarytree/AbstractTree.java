package br.com.datastructure.binarytree;

import java.util.Objects;

public abstract class AbstractTree {

    protected Node node;

    public void addNode(final Node nodeToAdd) {
        this.node = addNode(node, nodeToAdd);
    }

    private Node addNode(final Node currentNode, final Node nodeToAdd) {
        if (Objects.isNull(currentNode)) {
            return nodeToAdd;
        } else if (nodeToAdd.getData() < currentNode.getData()) {
            currentNode.addLeftNode(addNode(currentNode.getLeft(), nodeToAdd));
        } else if (nodeToAdd.getData() > currentNode.getData()) {
            currentNode.addRightNode(addNode(currentNode.getRight(), nodeToAdd));
        }
        return currentNode;
    }

    public Node getNode() {
        return node;
    }
}
