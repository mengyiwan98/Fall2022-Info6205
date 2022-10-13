package edu.northeastern.mengyi;

public class Q7 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return travelTree(root, p, q);
    }
    public TreeNode travelTree(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = travelTree(root.left, p, q);
        TreeNode right = travelTree(root.right, p, q);
        if (left != null && right != null) {
            return root;
        }
        if (left == null) {
            return right;
        }
        return left;
    }
}
