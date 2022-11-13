package edu.northeastern.mengyi;

import java.util.*;

public class BinTree {
    public Node root;

    public BinTree() {

    }
    
    //The time complexity is O(N)
    public void populateNextLeft() {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int curSize = queue.size();
            Node prev = null;

            for (int i = 0; i < curSize; i++) {
                Node cur = queue.poll();
                cur.next = prev;
                if (cur.left != null) {
                    queue.add(cur.left);
                }
                if (cur.right != null) {
                    queue.add(cur.right);
                }
                prev = cur;
            }
        }
    }
}
