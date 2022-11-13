package edu.northeastern.mengyi;

import java.util.ArrayList;
import java.util.List;


//The time complexity is O(N)
public class Main {
    public static void main(String[] args) {
        Node a = getBST();
        System.out.print(dfs(a, 17, 17));
    }

    private static List<Integer> dfs(Node root, int start, int end) {
        List<Integer> res = new ArrayList<>();
        for(int i = start; i <= end; i++) {
            if(helper(root, i) != null) {
                res.add(i);
            }
        }
        return res;
    }
    private static Node helper(Node root, int key)  {
        if (root == null || root.val == key)
            return root;
        if (root.val > key)
            return helper(root.left, key);
        return helper(root.right, key);
    }

    // Given range between 5 and 8 it will print 6, 7, 8
    private static Node getBST(){
        Node root = new Node(8);
        root.parent = root;

        root.left = new Node(3);
        root.right = new Node(10);
        root.left.parent = root;
        root.right.parent = root;


        root.left.left = new Node(1);
        root.left.right = new Node(6);
        root.left.left.parent = root.left;
        root.left.right.parent = root.left;

        root.right.right = new Node(14);
        root.right.right.parent = root.right;

        root.left.right.left = new Node(4);
        root.left.right.right = new Node(17);
        root.left.right.left.parent = root.left.right;
        root.left.right.right.parent = root.left.right;


        root.right.right.left = new Node(13);
        root.right.right.left.parent = root.right.right;

        return root;
    }
}


