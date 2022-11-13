package edu.northeastern.mengyi;

public class BinTree {
    public Node root;
    public BinTree() {
    }

    private void populateParent(Node node) {
        populateParent(root);
        if (node == null) {
            return;
        }
        if (node.right != null) {
            node.right.parent = node;
            populateParent(node.right);
        }
        if (node.left != null) {
            node.left.parent = node;
            populateParent(node.left);
        }
    }
}

//The time complexity is O(N)
