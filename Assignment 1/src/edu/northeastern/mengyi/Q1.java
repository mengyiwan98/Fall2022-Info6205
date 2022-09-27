package edu.northeastern.mengyi;

public class Q1 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        int len = 0;
        ListNode tmp = head;
        while (tmp != null) {
            len++;
            tmp = tmp.next;
        }
        k = k % len;
        if(k == 0) return head;
        tmp = head;
        for(int i = 1; i < len - k; i++) {
            head = head.next;
        }
        ListNode newHead = head.next;
        head.next = null;
        ListNode res = newHead;
        while(--k > 0){
            newHead = newHead.next;
        }
        newHead.next = tmp;
        return res;
    }
}
