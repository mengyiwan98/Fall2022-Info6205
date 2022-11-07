package edu.northeastern.mengyi;

public class Q2 {
    Node head = null;
    Node prev = null;
    public Node treeToDoublyList(Node root) {
        if(root == null) return null;
        inorder(root);
        head.left = prev;
        prev.right = head;
        return head;
    }

    private void inorder(Node root) {
        if(root == null) return;
        inorder(root.left);
        if(head == null){
            head = root;
        }else{
            prev.right = root;
            root.left = prev;
        }
        prev = root;
        inorder(root.right);
    }
}
