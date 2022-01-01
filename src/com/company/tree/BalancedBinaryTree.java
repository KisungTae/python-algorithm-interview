package com.company.tree;

public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        return check(root) != -1;
    }

    private int check(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = check(root.left);
        if (left == -1) {
            return left;
        }

        int right = check(root.right);
        if (right == -1) {
            return right;
        }

        if (Math.abs((left - right)) > 1) {
            return -1;
        }

        return Math.max(left, right) + 1;
    }
}
