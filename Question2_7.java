import java.util.*;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Palindrome {
    public boolean isPalindrome(ListNode pHead) {
        // write code here
        if (pHead == null || pHead.next == null) {
            return false;
        }
        ListNode headMarker = new ListNode(-1);
        headMarker.next = null;
        ListNode p = pHead;
        ListNode q;
        while (p != null) {
            ListNode r = p;
            p = p.next;
            ListNode s = new ListNode(r.val);
            s.next = headMarker.next;
            headMarker.next = s;
        }
        p = pHead;
        q = headMarker.next;
        while (p != null && q != null) {
            if (q.val != p.val) {
                return false;
            }
            p = p.next;
            q = q.next;
        }
        return true;
    }
}
