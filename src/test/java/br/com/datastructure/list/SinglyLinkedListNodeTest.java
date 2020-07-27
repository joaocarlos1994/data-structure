package br.com.datastructure.list;

import org.junit.jupiter.api.Test;

import static br.com.datastructure.list.SinglyLinkedListNode.insertNodeAtHead;
import static br.com.datastructure.list.SinglyLinkedListNode.insertNodeAtTailStructure;

public class SinglyLinkedListNodeTest {

    @Test
    public void testOne() {

        final SinglyLinkedListNode nodeZero = new SinglyLinkedListNode();
        nodeZero.insertNodeAtTail(null, 141);
        nodeZero.insertNodeAtTail(nodeZero, 302);
        nodeZero.insertNodeAtTail(nodeZero, 164);
        nodeZero.insertNodeAtTail(nodeZero, 530);
        nodeZero.insertNodeAtTail(nodeZero, 474);
    }

    @Test
    public void testTwo() {
        final SinglyLinkedListNode head = new SinglyLinkedListNode();
        insertNodeAtTailStructure(head, 141);
        insertNodeAtTailStructure(head, 302);
        insertNodeAtTailStructure(head, 164);
        insertNodeAtTailStructure(head, 530);
        insertNodeAtTailStructure(head, 474);
    }

    @Test
    public void testThree() {
        SinglyLinkedListNode head = insertNodeAtHead(null, 141);
        insertNodeAtHead(head, 302);
        insertNodeAtHead(head, 164);
        insertNodeAtHead(head, 530);
        insertNodeAtHead(head, 474);
    }

}
