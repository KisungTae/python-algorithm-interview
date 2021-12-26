package com.company.tree;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }

    private void invert(TreeNode root) {
        if (root == null) {
            return;
        }

        invert(root.left);
        invert(root.right);

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

    }
}
