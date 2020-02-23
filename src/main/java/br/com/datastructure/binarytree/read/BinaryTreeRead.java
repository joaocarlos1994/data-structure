package br.com.datastructure.binarytree.read;

import br.com.datastructure.binarytree.AbstractTree;
import br.com.datastructure.binarytree.Node;

import java.util.Objects;

public class BinaryTreeRead extends AbstractTree {

    public void read() {
        read(node);
    }

    private void read(final Node node) {
        if (Objects.nonNull(node)) {
            System.out.print(String.format("%s", node.getData()));
            System.out.print("(");
            read(node.getLeft());
            read(node.getRight());
            System.out.print(")");
        }
    }
}
