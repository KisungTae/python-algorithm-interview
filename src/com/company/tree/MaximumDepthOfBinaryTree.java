package com.company.tree;

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        return calculate(root);
    }

    private int calculate(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftSum = calculate(root.left);
        int rightSum = calculate(root.right);

        int max = Math.max(leftSum, rightSum);
        return max + 1;
    }
}
