package com.company.stackandqueue;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (isLeft(ch))
                stack.push(ch);
            else {
                if (stack.size() <= 0)
                    return false;
                char left = stack.pop();
                if (!isPair(left, ch))
                    return false;
            }
        }

        if (stack.size() > 0)
            return false;

        return true;
    }

    private boolean isPair(char left, char right) {
        return (left == '(' && right == ')') ||
               (left == '[' && right == ']') ||
               (left == '{' && right == '}');
    }

    private boolean isLeft(char ch) {
        return ch == '(' || ch == '[' || ch == '{';
    }
}
