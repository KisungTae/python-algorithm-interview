package com.company.linkedlist;

import java.util.Stack;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        ListNode itr = head;

        while (itr != null) {
            ListNode next = itr.next;
            itr.next = newHead;
            newHead = itr;
            itr = next;
        }
        return newHead;
    }
}
