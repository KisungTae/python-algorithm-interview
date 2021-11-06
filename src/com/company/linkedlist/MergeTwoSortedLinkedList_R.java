package com.company.linkedlist;

public class MergeTwoSortedLinkedList_R {

    // your solution is different from the answer, review the answer and redo


















    public class ListNode {
        int                           val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode head = null;

        if (l1 == null && l2 == null) {

        } else if (l1 == null) {
            head = new ListNode(l2.val);
            l2 = l2.next;
        } else if (l2 == null) {
            head = new ListNode(l1.val);
            l1 = l1.next;
        } else if (l1.val < l2.val) {
            head = new ListNode(l1.val);
            l1 = l1.next;
        } else {
            head = new ListNode(l2.val);
            l2 = l2.next;
        }

        ListNode itr = head;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                itr.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                itr.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            itr = itr.next;
        }

        while (l1 != null) {
            itr.next = new ListNode(l1.val);
            l1 = l1.next;
            itr = itr.next;
        }

        while (l2 != null) {
            itr.next = new ListNode(l2.val);
            l2 = l2.next;
            itr = itr.next;
        }

        return head;
    }
}
