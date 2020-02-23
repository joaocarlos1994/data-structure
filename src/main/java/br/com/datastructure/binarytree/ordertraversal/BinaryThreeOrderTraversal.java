package br.com.datastructure.binarytree.ordertraversal;

import br.com.datastructure.binarytree.Node;
import br.com.datastructure.binarytree.height.BinaryThreeDepth;

import java.util.Objects;

public class BinaryThreeOrderTraversal extends BinaryThreeDepth {

    public void printLevelOrder() {
        int h = maxDepth(node);
        String currentPrintLevel = "";
        for (int i = 1; i <= h; i++) {
            printGivenLevel(node, i, currentPrintLevel);
        }
    }

    public void  printGivenLevel (final Node root, final int level, final String currentPrintLevel) {
        if (Objects.isNull(root)) {
            return;
        }
        if (level == 1) {
            System.out.print(root.getData() + " ");
        } else if (level > 1) {
            printGivenLevel(root.getLeft(), level - 1, currentPrintLevel);
            printGivenLevel(root.getRight(), level - 1, currentPrintLevel);
        }
    }

}
