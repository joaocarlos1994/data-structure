package br.com.datastructure.nonbinary;

import java.util.Objects;

public class NonBinaryTree {

    private NonBinaryNode nonBinaryNode;

    public void addNode(final NonBinaryNode nonBinaryNode, final NonBinaryNode nodeToFind) {
        if (Objects.isNull(this.nonBinaryNode)) {
            this.nonBinaryNode = nonBinaryNode;
        } else {
            final NonBinaryNode rootNode = getNonBinaryNode(this.nonBinaryNode, nodeToFind);
            rootNode.addNonBinaryNode(nonBinaryNode);
        }
    }

    public void read() {
        read(this.nonBinaryNode);
    }

    private void read(final NonBinaryNode nonBinaryNode) {
        if (Objects.isNull(nonBinaryNode)) {
            return;
        }

        System.out.print(nonBinaryNode.getData() + "(");

        for (final NonBinaryNode node : nonBinaryNode.getChildrens()) {
            read(node);
        }

        System.out.print(")");
    }

    private NonBinaryNode getNonBinaryNode(final NonBinaryNode nonBinaryNode, final NonBinaryNode nodeToFind) {
        NonBinaryNode nodeToReturn = null;
        if (Objects.isNull(nonBinaryNode)) {
            return null;
        }

        if (nonBinaryNode.getData() == nodeToFind.getData()) {
            return nonBinaryNode;
        }

        for (final NonBinaryNode node : nonBinaryNode.getChildrens()) {
            nodeToReturn = getNonBinaryNode(node, nodeToFind);
        }

        getNonBinaryNode(nonBinaryNode.getFirstChildren(), nodeToFind);

        return nodeToReturn;
    }


}
