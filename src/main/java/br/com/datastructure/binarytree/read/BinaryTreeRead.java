package br.com.datastructure.binarytree.read;

import br.com.datastructure.binarytree.AbstractTree;
import br.com.datastructure.binarytree.BinaryNode;

import java.util.Objects;

public class BinaryTreeRead extends AbstractTree {

    public void read() {
        read(binaryNode);
    }

    private void read(final BinaryNode binaryNode) {
        if (Objects.nonNull(binaryNode)) {
            System.out.print(String.format("%s", binaryNode.getData()));
            System.out.print("(");
            read(binaryNode.getLeft());
            read(binaryNode.getRight());
            System.out.print(")");
        }
    }
}
