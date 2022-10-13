package edu.northeastern.mengyi;

import java.util.Deque;
import java.util.LinkedList;

public class Q6 {
    public int widthOfBinaryTree(TreeNode root) {
        int maxSize = 0;
        Deque<TreeNode> queue = new LinkedList<>();
        Deque<Integer> numqueue = new LinkedList<>();
        queue.offer(root);
        numqueue.offer(1);
        while(!queue.isEmpty()){
            int size = queue.size();
            int curLeft=0,curRight=0;
            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();
                int nodeNum = numqueue.poll();
                if(i == 0)
                    curLeft = nodeNum;
                if(i == size-1)
                    curRight = nodeNum;
                if(node.left != null){
                    queue.offer(node.left);
                    numqueue.offer(nodeNum*2);
                }
                if(node.right != null){
                    queue.offer(node.right);
                    numqueue.offer(nodeNum*2+1);
                }
            }
            maxSize = Math.max(maxSize,curRight-curLeft+1);
        }
        return maxSize;
    }
}
