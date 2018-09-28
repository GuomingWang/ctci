/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        if (k <= 0 || head == null) {
            return null;
        }
        ListNode headMarker = new ListNode(-1);
        headMarker.next = head;
        ListNode p = head;
        ListNode q = headMarker;
        int count = 0;
        while (p != null) {
            count++;
            if (count >= k) {
                q = q.next;
            }
            p = p.next;
        }
        if (q == headMarker) {
            return null;
        }
        return q;
    }
}
