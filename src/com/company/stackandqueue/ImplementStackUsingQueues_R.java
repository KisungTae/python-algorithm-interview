package com.company.stackandqueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues_R {

    // solved the problem but review the answer

    Queue<Integer> buffer = new LinkedList<>();
    Queue<Integer> queue = new LinkedList<>();
    Integer last = null;

    public void push(int x) {
        last = x;
        queue.add(x);
    }

    public int pop() {
        if (buffer.isEmpty()) {

            while (queue.size() > 1) {
                last = queue.poll();
                buffer.add(last);
            }

            int poll = queue.poll();
            swap();

            return poll;


        } else {

            while (buffer.size() > 1) {
                last = buffer.poll();
                queue.add(last);
            }

            int poll = buffer.poll();
            swap();

            return poll;
        }
    }

    private void swap() {
        Queue<Integer> tempBuffer = buffer;
        buffer = queue;
        queue = tempBuffer;
    }

    public int top() {
        return last;
    }

    public boolean empty() {
        return buffer.isEmpty() && queue.isEmpty();
    }
}
