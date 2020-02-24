package br.com.datastructure.binarytree.ordertraversal;

import br.com.datastructure.binarytree.BinaryNode;
import br.com.datastructure.binarytree.height.BinaryThreeDepth;

import java.util.Objects;

public class BinaryThreeOrderTraversal extends BinaryThreeDepth {

    public String printLevelOrderInsertSequence() {
        int h = maxDepth(binaryNode);
        String currentPrintLevel = "";
        for (int i = 1; i <= h; i++) {
            currentPrintLevel += printGivenLevelInsertSequence(binaryNode, i);
        }
        return currentPrintLevel;
    }

    private String printGivenLevelInsertSequence(final BinaryNode root, final int level) {
        String leftPrint = null;
        String rightPrint = null;

        if (Objects.isNull(root)) {
            return "";
        }

        if (level == 1) {
            return root.getData() + " ";
        } else if (level > 1) {
            leftPrint = printGivenLevelInsertSequence(root.getLeft(), level - 1);
            rightPrint = printGivenLevelInsertSequence(root.getRight(), level - 1);
        }

        return leftPrint + rightPrint;
    }

    public void printLevelTraversalOrder() {
        final int depth = maxDepth(this.binaryNode) + 1;

        for (int level = 1; level < depth; level++) {
            printLevelTraversalOrder(this.binaryNode, level);
        }
    }

    //      1 2 5 3 6 4
    //TODO: 1 2 5 3 6 4
    private void printLevelTraversalOrder(final BinaryNode root, final int level) {
        if (Objects.isNull(root)) {
            return;
        }

        if (level == 1) {
            System.out.print(root.getData() + " ");
            return;
        }

        printLevelTraversalOrder(root.getLeft(), level - 1);
        printLevelTraversalOrder(root.getRight(), level - 1);
    }
}
