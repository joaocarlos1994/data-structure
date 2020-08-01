package br.com.datastructure.binarytree.topview;

import br.com.datastructure.binarytree.AbstractTree;
import br.com.datastructure.binarytree.BinaryNode;

import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.TreeMap;

/**
 * The top view of Binary Three is based on two other algorithm, for example:
 *
 * (Level Order Traversal + Vertical Order Traversal)
 *
 * hd on left you need to add - 1
 * hd on right you need to add + 1
 *
 *         1   hd = 0
 *          \
 *           2   hd = 1
 *            \
 *             5   hd = 2
 *            /  \
 *   hd =1   3    6   hd =3
 *            \
 *             4   hd = 2
 *
 * ######################### HD ############################
 *              0       1       2       3
 *------------------------------------------------------------
 * NODES        1       2       5       6
 * NODES                3       4
 * */
public class BinaryTreeTopView extends AbstractTree {

    public void topView(final BinaryNode root) {
        final Queue<TopViewNode> queueNode = new LinkedList<>();
        final Map<Integer, BinaryNode> topViewMap = new TreeMap<>();

        if (root == null) {
            return;
        } else {
            queueNode.add(new TopViewNode(root, 0));
        }


        while (!queueNode.isEmpty()) {
            final TopViewNode tmpTopViewNode = queueNode.poll();
            if (!topViewMap.containsKey(tmpTopViewNode.heightDistance)) {
                topViewMap.put(tmpTopViewNode.heightDistance, tmpTopViewNode.node);
            }

            if (tmpTopViewNode.node.getLeft() != null) {
                queueNode.add(new TopViewNode(tmpTopViewNode.node.getLeft(), tmpTopViewNode.heightDistance - 1));
            }
            if (tmpTopViewNode.node.getRight() != null) {
                queueNode.add(new TopViewNode(tmpTopViewNode.node.getRight(), tmpTopViewNode.heightDistance + 1));
            }
        }

        for (final Entry<Integer, BinaryNode> entry : topViewMap.entrySet()) {
            System.out.print(entry.getValue().getData() + " ");
        }
    }
}
