package br.com.datastructure.list;

public class SinglyLinkedListNode {

    int data;
    SinglyLinkedListNode next;

    public SinglyLinkedListNode(final int data) {
        this.data = data;
    }

    public SinglyLinkedListNode() {}

    public SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        if (head == null) {
            this.data = data;
            this.next = new SinglyLinkedListNode();
            System.out.println(data);
            return this;
        }
        return insertNodeAtTail(head.next, data);
    }

    public static SinglyLinkedListNode insertNodeAtTailStructure(final SinglyLinkedListNode head, int data) {
        if (head == null) {
            return new SinglyLinkedListNode(data);
        } else {
            head.next = insertNodeAtTailStructure(head.next, data);
        }
        return head;
    }

    public static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, final int data) {
        final SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        if (llist == null) {
            return newNode;
        }
        newNode.next = llist;
        return newNode;
    }
}
