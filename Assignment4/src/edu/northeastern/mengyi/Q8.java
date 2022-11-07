package edu.northeastern.mengyi;

import java.util.Stack;

public class Q8 {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int res = 0;
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            }
            else {
                root = stack.pop();
                if (root.val >= low && root.val <= high ){
                    res += root.val;
                }
                root = root.right;
            }
        }
        return res;
    }
}
