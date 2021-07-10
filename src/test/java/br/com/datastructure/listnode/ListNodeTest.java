package br.com.datastructure.listnode;

import org.junit.jupiter.api.Test;

public class ListNodeTest {

    @Test
    public void one() {
        final ListNode l1_1 = new ListNode(1);
        final ListNode l1_2 = new ListNode(2);
        final ListNode l1_3 = new ListNode(4);
        l1_1.next = l1_2;
        l1_2.next = l1_3;
        l1_3.next = null;

        final ListNode l2_1 = new ListNode(1);
        final ListNode l2_2 = new ListNode(3);
        final ListNode l2_3 = new ListNode(4);
        l2_1.next = l2_2;
        l2_2.next = l2_3;
        l2_3.next = null;

        ListNode.mergeTwoLists(l1_1, l2_1);
    }
}
