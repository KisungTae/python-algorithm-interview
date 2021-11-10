package com.company.linkedlist;

public class OddEvenLinkedList_R {

    // your solution was right, but let's tidy up your code

























    public ListNode oddEvenList(ListNode head) {
        ListNode oddHead = head;
        ListNode oddTail = head;

        ListNode evenHead = null;
        ListNode evenTail = null;
        if (head != null) {
            evenHead = head.next;
            evenTail = head.next;
        }

        if (evenTail == null)
            head = null;
        else
            head = evenTail.next;

        while (head != null) {
            oddTail.next = head;
            oddTail = head;

            evenTail.next = oddTail.next;
            evenTail = oddTail.next;

            if (evenTail == null)
                head = null;
            else
                head = evenTail.next;
        }

        if (oddTail != null) {
            oddTail.next = evenHead;
        }

        return oddHead;
    }
}
