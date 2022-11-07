package edu.northeastern.mengyi;

import java.util.LinkedList;
import java.util.Queue;

public class Q6 {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) {
            return "";
        }
        StringBuilder ans = new StringBuilder();
        preOrder(root,ans);
        return ans.toString();
    }
    public void preOrder(TreeNode t, StringBuilder sb) {
        if(t == null) {
            return;
        }
        sb.append("#").append(t.val);
        preOrder(t.left,sb);
        preOrder(t.right,sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length() == 0) {
            return null;
        }
        String s[] = data.split("#", -1);
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i < s.length; i++) {
            q.add(Integer.parseInt(s[i]));
        }
        return reFormBST(q, -1, (int)1e5);
    }
    public TreeNode reFormBST(Queue<Integer> q, int min, int max){
        if(q.size() == 0 || q.peek() >= max || q.peek() <= min) {
            return null;
        }
        int a=q.poll();
        return new TreeNode(a, reFormBST(q, min, a), reFormBST(q, a, max));
    }
}
