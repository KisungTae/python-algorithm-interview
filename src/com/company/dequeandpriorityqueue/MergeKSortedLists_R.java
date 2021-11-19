package com.company.dequeandpriorityqueue;

import com.company.linkedlist.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLists_R {

    // your answer is only 50% faster than others, reivew and redo



















    public ListNode mergeKLists(ListNode[] lists) {
        Comparator<ListNode> comparator = new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return Integer.compare(o1.val, o2.val);
            }
        };
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(comparator);

        for (ListNode listNode : lists) {
            ListNode itr = listNode;
            while (itr != null) {
                priorityQueue.add(itr);
                itr = itr.next;
            }
        }

        if (priorityQueue.isEmpty()) return null;
        ListNode newHead = priorityQueue.poll();
        ListNode tail = newHead;

        while (!priorityQueue.isEmpty()) {
            ListNode next = priorityQueue.poll();
            tail.next = next;
            tail = next;
        }

        if (tail != null)
            tail.next = null;

        return newHead;
    }
}
