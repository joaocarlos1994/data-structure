package br.com.datastructure.addtwonumbers;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class AddTwoNumbersTest {

    @Test
    public void testOne() {
        AddTwoNumbers.ListNode one = new AddTwoNumbers.ListNode(2);
        AddTwoNumbers.ListNode two = new AddTwoNumbers.ListNode(4);
        AddTwoNumbers.ListNode three = new AddTwoNumbers.ListNode(3);
        one.next = two;
        two.next = three;

        AddTwoNumbers.ListNode four = new AddTwoNumbers.ListNode(5);
        AddTwoNumbers.ListNode five = new AddTwoNumbers.ListNode(6);
        AddTwoNumbers.ListNode six = new AddTwoNumbers.ListNode(4);
        four.next = five;
        five.next = six;

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        addTwoNumbers.addTwoNumbers(one, four);
    }

    @Test
    public void testTwo() {
        AddTwoNumbers.ListNode one = new AddTwoNumbers.ListNode(0);
        AddTwoNumbers.ListNode two = new AddTwoNumbers.ListNode(0);

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        addTwoNumbers.addTwoNumbers(one, two);
    }

    @Test
    public void testThree() {
        AddTwoNumbers.ListNode one = new AddTwoNumbers.ListNode(9);
        AddTwoNumbers.ListNode two = new AddTwoNumbers.ListNode(9);
        AddTwoNumbers.ListNode three = new AddTwoNumbers.ListNode(9);
        AddTwoNumbers.ListNode four = new AddTwoNumbers.ListNode(9);
        AddTwoNumbers.ListNode five = new AddTwoNumbers.ListNode(9);
        AddTwoNumbers.ListNode six = new AddTwoNumbers.ListNode(9);
        AddTwoNumbers.ListNode seven = new AddTwoNumbers.ListNode(9);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;

        AddTwoNumbers.ListNode eith = new AddTwoNumbers.ListNode(9);
        AddTwoNumbers.ListNode nine = new AddTwoNumbers.ListNode(9);
        AddTwoNumbers.ListNode ten = new AddTwoNumbers.ListNode(9);
        AddTwoNumbers.ListNode eleven = new AddTwoNumbers.ListNode(9);
        eith.next = nine;
        nine.next = ten;
        ten.next = eleven;


        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        addTwoNumbers.addTwoNumbers(one, eith);

        System.out.println(7 % 10);;
        System.out.println(10 % 10);
        System.out.println (8 % 10);
    }
}
