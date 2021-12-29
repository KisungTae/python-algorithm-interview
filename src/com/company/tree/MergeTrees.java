package com.company.tree;

public class MergeTrees {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {

        return merge(root1, root2);
    }

    private TreeNode merge(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return null;
        }

        TreeNode nextLeft1 = null;
        TreeNode nextLeft2 = null;
        TreeNode nextRight1 = null;
        TreeNode nextRight2 = null;

        if (root1 != null) {
            nextLeft1 = root1.left;
            nextRight1 = root1.right;
        }

        if (root2 != null) {
            nextLeft2 = root2.left;
            nextRight2 = root2.right;
        }

        TreeNode left = merge(nextLeft1, nextLeft2);
        TreeNode right = merge(nextRight1, nextRight2);

        if (root1 == null && root2 != null) {
            root1 = new TreeNode(root2.val);
        } else if (root1 != null && root2 == null) {

        } else {
            root1.val = root1.val + root2.val;
        }
        root1.left = left;
        root1.right = right;
        return root1;
    }
}
