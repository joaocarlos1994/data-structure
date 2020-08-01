package br.com.datastructure.binarytree.topview;

import br.com.datastructure.binarytree.BinaryNode;
import org.junit.jupiter.api.Test;

public class BinaryTreeTopViewTest {

    @Test
    public void testTreeTopViewOne() {
        final BinaryTreeTopView binaryTreeTopView = new BinaryTreeTopView();
        binaryTreeTopView.addNode(new BinaryNode(1));
        binaryTreeTopView.addNode(new BinaryNode(2));
        binaryTreeTopView.addNode(new BinaryNode(5));
        binaryTreeTopView.addNode(new BinaryNode(3));
        binaryTreeTopView.addNode(new BinaryNode(4));
        binaryTreeTopView.addNode(new BinaryNode(6));
        binaryTreeTopView.topView(binaryTreeTopView.getBinaryNode());
    }


}
