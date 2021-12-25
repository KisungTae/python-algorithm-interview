package com.company.tree;

public class LongestUnivaluePath {

    int best = 0;

    public int longestUnivaluePath(TreeNode root) {
        cal(root);
        return best;
    }

    private int cal(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = cal(root.left);

        int currSum = 0;
        int bestPart = 1;

        if (root.left != null && root.val == root.left.val) {
            currSum += left;
            bestPart += left;
        }

        int right = cal(root.right);
        if (root.right != null && root.val == root.right.val) {
            currSum += right;
            bestPart = Math.max((right + 1), bestPart);
        }

        best = Math.max(currSum, best);

        return bestPart;
    }
}
