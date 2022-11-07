package edu.northeastern.mengyi;

import java.util.Deque;
import java.util.LinkedList;

public class Q5 {
    private TreeNode cur;
    private Deque<TreeNode> stack;

    public Q5(TreeNode root) {
        cur = root;
        stack = new LinkedList<TreeNode>();
    }

    public int next() {
        while (cur != null) {
            stack.push(cur);
            cur = cur.left;
        }
        cur = stack.pop();
        int ret = cur.val;
        cur = cur.right;
        return ret;
    }

    public boolean hasNext() {
        return cur != null || !stack.isEmpty();
    }
}
