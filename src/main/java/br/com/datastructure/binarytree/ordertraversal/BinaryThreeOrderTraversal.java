package br.com.datastructure.binarytree.ordertraversal;

import br.com.datastructure.binarytree.Node;
import br.com.datastructure.binarytree.height.BinaryThreeDepth;

import java.util.Objects;

public class BinaryThreeOrderTraversal extends BinaryThreeDepth {

    public String printLevelOrder() {
        int h = maxDepth(node);
        String currentPrintLevel = "";
        for (int i = 1; i <= h; i++) {
            currentPrintLevel += printGivenLevel(node, i);
        }
        return currentPrintLevel;
    }

    public String printGivenLevel(final Node root, final int level) {
        String leftPrint = null;
        String rightPrint = null;

        if (Objects.isNull(root)) {
            return "";
        }

        if (level == 1) {
            return root.getData() + " ";
        } else if (level > 1) {
            leftPrint = printGivenLevel(root.getLeft(), level - 1);
            rightPrint = printGivenLevel(root.getRight(), level - 1);
        }

        return leftPrint + rightPrint;
    }

}
