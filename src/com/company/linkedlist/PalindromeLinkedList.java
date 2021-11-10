package com.company.linkedlist;

import java.util.LinkedList;
import java.util.Stack;

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        ListNode tail = head;
        Stack<Integer> stack = new Stack<>();

        while (true) {
            ListNode nextTail = tail.next;
            if (nextTail == null) break;
            if (nextTail.next == null) break;

            tail = nextTail.next;

            stack.push(head.val);
            head = head.next;
        }

        stack.push(head.val);

        if (tail.next != null) {
            head = head.next;
        }

        while (head != null) {
            if (head.val != stack.pop()) {
                return false;
            }
            head = head.next;
        }

        return true;
    }
}
