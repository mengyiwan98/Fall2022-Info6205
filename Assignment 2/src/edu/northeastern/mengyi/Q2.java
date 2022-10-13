package edu.northeastern.mengyi;

public class Q2 {
    public static int maxDepth(TreeNode root) {
        int max = 0;
        return getDepth(root,max,0);
    }

    public static int getDepth(TreeNode root, int max, int length){
        max = max > length ? max : length;
        if (root == null){
            return max > length ? max : length;
        }
        length += 1;
        int left = getDepth(root.left,max,length);
        int right = getDepth(root.right,max,length);
        return left > right ? left : right;
    }
}
