/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    int count = 0;
    ListNode getNode = null;
    public ListNode FindKthToTail(ListNode head,int k) {
        if (k <= 0 || head == null) {
            return null;
        }
        FindKthToTail(head.next, k);
        count++;
        if (count == k) {
            getNode = head;
        }
        return getNode;
    }
}
