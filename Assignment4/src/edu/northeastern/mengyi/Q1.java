package edu.northeastern.mengyi;

public class Q1 {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        else if(head.next == null) return new TreeNode(head.val);
        ListNode pre = head;
        ListNode n2 = pre.next;
        ListNode n1 = n2.next;

        while(n1 != null && n1.next != null) {
            pre = pre.next;
            n2 = pre.next;
            n1 = n1.next.next;
        }
        pre.next = null;
        TreeNode node = new TreeNode(n2.val);
        node.left = sortedListToBST(head);
        node.right = sortedListToBST(n2.next);
        return node;
    }
}
