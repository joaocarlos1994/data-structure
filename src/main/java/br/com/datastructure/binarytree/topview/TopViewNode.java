package br.com.datastructure.binarytree.topview;

import br.com.datastructure.binarytree.BinaryNode;

public class TopViewNode {

    protected final BinaryNode node;
    protected final int heightDistance;

    public TopViewNode(final BinaryNode node, final int heightDistance) {
        this.node = node;
        this.heightDistance = heightDistance;
    }
}
