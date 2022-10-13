package edu.northeastern.mengyi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.TreeMap;

public class Q5 {
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) {
            return res;
        }
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();  // key: column, values: nodes.val
        Queue<NodeData> queue = new LinkedList<>();
        queue.offer(new NodeData(root, 0));

        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i =0; i < size; i++) {
                NodeData data = queue.poll();
                TreeNode node = data.node;
                int column = data.column;

                if(!map.containsKey(column)) {
                    map.put(column, new ArrayList<>());
                }
                map.get(column).add(node.val);

                if(node.left != null) {
                    queue.offer(new NodeData(node.left, column - 1));
                }

                if(node.right != null) {
                    queue.offer(new NodeData(node.right, column + 1));
                }
            }
        }
        for(List<Integer> values : map.values()) {
            res.add(new ArrayList<>(values));
        }
        return res;
    }

    private class NodeData {
        TreeNode node;
        int column;

        NodeData(TreeNode node, int column) {
            this.node = node;
            this.column = column;
        }
    }
}
