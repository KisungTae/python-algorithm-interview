package com.company.linkedlist;

public class ReverseLinkedListTwo_R {

    // your solution was right but different from the answer, redo it




































    public ListNode reverseBetween(ListNode head, int left, int right) {
        int arrSize = right - left + 1;
        int[] arr = new int[arrSize];

        int start = 1;
        ListNode itr = head;
        while (start < left) {
            itr = itr.next;
            start++;
        }

        int arrIndex = arr.length - 1;
        while (start <= right) {
            arr[arrIndex] = itr.val;
            arrIndex--;
            itr = itr.next;
            start++;
        }

        start = 1;
        itr = head;

        while (start < left) {
            itr = itr.next;
            start++;
        }

        arrIndex = 0;
        while (start <= right) {
            itr.val = arr[arrIndex];
            arrIndex++;
            itr = itr.next;
            start++;
        }

        return head;
    }
}
