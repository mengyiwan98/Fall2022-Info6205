package edu.northeastern.mengyi;

public class Q3 {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode leftK = head, rightK = head, temp = null;
        while (k-- > 1) {
            leftK = leftK.next;
        }
        temp = leftK;
        while (temp.next != null) {
            rightK = rightK.next;
            temp = temp.next;
        }
        int val = leftK.val;
        leftK.val = rightK.val;
        rightK.val = val;
        return head;
    }
}
