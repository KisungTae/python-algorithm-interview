package com.company.stackandqueue;

import java.util.LinkedList;

public class DesignCircularQueue_R {

    // your solution is different from the answer, review and redo



















    LinkedList<Integer> linkedList = new LinkedList<>();

    private LinkedList<Integer> queue = new LinkedList<>();
    private int size;

    public DesignCircularQueue_R(int k) {
        size = k;
    }

    public boolean enQueue(int value) {
        if (isFull()) return false;
        else {
            queue.addLast(value);
            return true;
        }
    }

    public boolean deQueue() {
        if (isEmpty()) return false;
        else {
            queue.removeFirst();
            return true;
        }
    }

    public int Front() {
        if (isEmpty()) return -1;
        else return queue.peekFirst();
    }

    public int Rear() {
        if (isEmpty()) return -1;
        else return queue.peekLast();
    }

    public boolean isEmpty() {
        return queue.size() == 0;
    }

    public boolean isFull() {
        return queue.size() == size;
    }
}
