package br.com.datastructure.addtwonumbers;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        final List<Integer> l1Reverse = reverseRecursive(l1, new ArrayList<>());
        final List<Integer> l2Reverse = reverseRecursive(l2, new ArrayList<>());
        final BigInteger numberResult = reverseNumber(l1Reverse).add(reverseNumber(l2Reverse));
        ListNode head = null;
        ListNode aux = null;

        for (final char number : numberResult.toString().toCharArray()) {
            final int value = number - '0';
            if (head == null) {
                head = new ListNode();
                head.val = value;
            } else {
                aux = new ListNode();
                aux.val = value;
                aux.next = head;
                head = aux;
            }
        }
        return head;
    }

    public List<Integer> reverseRecursive(ListNode list, List<Integer> numbers) {
        if (list.next == null) {
            numbers.add(0, list.val);
            return numbers;
        }
        numbers.add(0, list.val);
        return reverseRecursive(list.next, numbers);
    }

    public BigInteger reverseNumber(final List<Integer> numbers) {
        final StringBuilder numberAsString = new StringBuilder();
        for(final Integer number : numbers) {
            numberAsString.append(number.toString());
        }
        return new BigInteger(numberAsString.toString());
    }

    public static class ListNode {

        int val;
        ListNode next;

        public ListNode() {}

        ListNode(int val) {
            this.val = val;
            next = null;
        }
    }
}
