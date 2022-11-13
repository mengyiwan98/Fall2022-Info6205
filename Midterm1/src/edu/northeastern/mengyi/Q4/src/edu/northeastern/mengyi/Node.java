package edu.northeastern.mengyi;

public class Node {
    int data;
    public Node left;
    public Node right;
    public int val;
    public Node next;
    Node(int data) {
        this.data = data;
        left = right = null;
    }

    public Node() {
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
