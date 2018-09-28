import java.util.*;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        if (pHead == null || pHead.next == null) {
            return pHead;
        }
        ListNode headMarker = new ListNode(-1);
        headMarker.next = null;
        ListNode p = headMarker;
        ListNode q = headMarker;
        ListNode r = pHead;
        ListNode s;
        while (r != null) {
            s = r;
            r = r.next;
            s.next = null;
            if (s.val < x) {
                s.next = p.next;
                p.next = s;
                p = s;
                if (q.next != null) {
                    q = q.next;
                }
            } else {
                q.next = s;
                q = s;
            }
        }
        return headMarker.next;
    }
}
