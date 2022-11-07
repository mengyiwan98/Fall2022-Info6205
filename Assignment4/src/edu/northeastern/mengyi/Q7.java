package edu.northeastern.mengyi;

public class Q7 {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode result = null;
        TreeNode curr = root;
        while (curr != null) {
            if (curr.val > p.val) {
                result = curr;
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }

        return result;
    }
}
