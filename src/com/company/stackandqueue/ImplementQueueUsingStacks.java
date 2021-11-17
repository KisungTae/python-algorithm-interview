package com.company.stackandqueue;

import java.util.Stack;

public class ImplementQueueUsingStacks {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> buffer = new Stack<>();

    public void push(int x) {
        stack.push(x);
    }

    public int pop() {
        if (buffer.isEmpty())
            shift();
        return buffer.pop();
    }

    public int peek() {
        if (buffer.isEmpty())
            shift();
        return buffer.peek();
    }

    private void shift() {
        while (!stack.isEmpty()) {
            buffer.push(stack.pop());
        }
    }

    public boolean empty() {
        return stack.isEmpty() && buffer.isEmpty();
    }
}
