package br.com.datastructure.nonbinary;

import java.util.Objects;

public class NonBinaryTreeInverseOrder {

    private NonBinaryNode nonBinaryNode;

    public NonBinaryNode getNonBinaryNode(final NonBinaryNode nonBinaryNode, final int value) {
        NonBinaryNode nodeToReturn = null;
        if (Objects.isNull(nonBinaryNode)) {
            return null;
        }

        if (nonBinaryNode.getData() == value) {
            return nonBinaryNode;
        } else {
            for (final NonBinaryNode node : nonBinaryNode.getChildrens()) {
                getNonBinaryNode(node, value);
            }
        }

        for (int i = 0; i < nonBinaryNode.getChildrens().size(); i++) {
            nodeToReturn = getNonBinaryNode(nonBinaryNode.getChildrens().get(i), value);
        }

        return nodeToReturn;
    }

    public void addNode(final NonBinaryNode nonBinaryNode, final NonBinaryNode head) {
        if (Objects.isNull(this.nonBinaryNode)) {
            this.nonBinaryNode = nonBinaryNode;
        } else {
            NonBinaryNode headNode = getNonBinaryNode(this.nonBinaryNode, head.getData());
            headNode.addNonBinaryNode(nonBinaryNode);
        }
    }
}
