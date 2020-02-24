package br.com.datastructure.binarytree;

import java.util.Objects;

public abstract class AbstractTree {

    protected BinaryNode binaryNode;

    public void addNode(final BinaryNode binaryNodeToAdd) {
        this.binaryNode = addNode(binaryNode, binaryNodeToAdd);
    }

    private BinaryNode addNode(final BinaryNode currentBinaryNode, final BinaryNode binaryNodeToAdd) {
        if (Objects.isNull(currentBinaryNode)) {
            return binaryNodeToAdd;
        } else if (binaryNodeToAdd.getData() < currentBinaryNode.getData()) {
            currentBinaryNode.addLeftNode(addNode(currentBinaryNode.getLeft(), binaryNodeToAdd));
        } else if (binaryNodeToAdd.getData() > currentBinaryNode.getData()) {
            currentBinaryNode.addRightNode(addNode(currentBinaryNode.getRight(), binaryNodeToAdd));
        }
        return currentBinaryNode;
    }

    public BinaryNode getBinaryNode() {
        return binaryNode;
    }
}
