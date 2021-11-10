package com.company.linkedlist;

public class AddTwoNumbers_R {

    // your solution is right but review the while loop and check if you could minimize your code






































    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;

        int initSum = l1.val + l2.val + carry;
        carry = initSum / 10;
        int initRemainder = initSum % 10;
        ListNode head = new ListNode(initRemainder);
        ListNode tail = head;

        l1 = l1.next;
        l2 = l2.next;

        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carry;

            int quotient = sum / 10;
            int remainder = sum % 10;

            carry = quotient;
            ListNode node = new ListNode(remainder);

            tail.next = node;
            tail = node;

            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            int sum = l1.val + carry;
            carry = sum / 10;
            int remainder = sum % 10;
            ListNode node = new ListNode(remainder);
            tail.next = node;
            tail = node;
            l1 = l1.next;
        }

        while (l2 != null) {
            int sum = l2.val + carry;
            carry = sum / 10;
            int remainder = sum % 10;
            ListNode node = new ListNode(remainder);
            tail.next = node;
            tail = node;
            l2 = l2.next;
        }

        if (carry > 0) {
            ListNode node = new ListNode(carry);
            tail.next = node;
        }

        return head;
    }
}
