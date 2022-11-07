package edu.northeastern.mengyi;

public class Q4 {
    TreeNode first = null;
    TreeNode second = null;
    public void recoverTree(TreeNode root) {
        inorderTraversal(root);
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
    TreeNode pre = null;
    private void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        if(pre != null && root.val < pre.val) {
            if(first==null) {
                first = pre;
                second = root;
            }else{
                second = root;
            }
        }
        pre = root;
        inorderTraversal(root.right);
    }
}
