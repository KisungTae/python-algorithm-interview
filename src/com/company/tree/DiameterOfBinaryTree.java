package com.company.tree;

public class DiameterOfBinaryTree {

    private int max = Integer.MIN_VALUE;

    public int diameterOfBinaryTree(TreeNode root) {
        calculate(root);
        return max;
    }

    private int calculate(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = calculate(root.left);
        int right = calculate(root.right);
        int sum = left + right;
        max = Math.max(max, sum);

        return Math.max(left, right) + 1;
    }
}
