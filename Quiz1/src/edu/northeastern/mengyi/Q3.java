package edu.northeastern.mengyi;

//Binary Tree Level order traversal

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q3 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        //result
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        //first queue
        queue.add(root);
        while (!queue.isEmpty()) {
            //report path
            List<Integer> path = new ArrayList<>();
            //report size
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode tmp = queue.poll();
                //add tmp
                if (tmp.left != null) queue.add(tmp.left);
                if (tmp.right != null) queue.add(tmp.right);
                //report
                path.add(tmp.val);
            }
            //finish, add path to the res
            res.add (new ArrayList<>(path));
        }
        return res;
    }
}
