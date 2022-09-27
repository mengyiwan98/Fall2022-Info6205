package edu.northeastern.mengyi;

public class Q4 {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode cur = head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        int size = count <= k ? 1 : count / k;
        int remainder = count <= k ? 0 : count % k;
        ListNode[] ans = new ListNode[k];
        ListNode nextHead = head;
        cur = nextHead;
        int n = Math.min(k, count);
        for (int i = 0; i < n; i++) {
            ans[i] = nextHead;
            for (int j = 1; j < size; j++) {
                cur = cur.next;
            }
            if (remainder > 0) {
                cur = cur.next;
                remainder--;
            }
            nextHead = cur.next;
            cur.next = null;
            cur = nextHead;
        }
        return ans;
    }
}
