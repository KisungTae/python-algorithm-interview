package com.company.linkedlist;

public class SwapNodesInPairs_R {

    // your solution is right but the solution from the book does not have if statement in while,
    // review the solution from the book and re-do













































    public ListNode swapPairs(ListNode head) {
        ListNode itr = head;

        if (head != null && head.next != null) {
            head = head.next;
        }

        ListNode prev = null;
        while (itr != null && itr.next != null) {
            ListNode curr = itr;
            ListNode next = itr.next;

            curr.next = next.next;
            next.next = curr;
            if (prev != null) {
                prev.next = next;
            }
            prev = curr;
            itr = curr.next;
        }

        return head;
    }

}
