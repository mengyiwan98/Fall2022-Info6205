package edu.northeastern.mengyi;

public class LinkList {
    public Node head;

    public int length = 0;

    public LinkList() {
        head = null;
    }

    public void insert(Integer data) {
        // Insert in sorted manner
        if(head == null) head = new Node(data);
        else {
            Node n = head;
            while(n.next!=null && n.next.data < data) {
                n = n.next;
            }
            Node temp = n.next;
            n.next = new Node(data);
            n.next.next = temp;
        }
        length++;
    }
}

//The time complexity is O(N)
