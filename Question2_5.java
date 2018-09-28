import java.util.*;
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Plus {
    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        if (b == null) {
            return a;
        }
        if (a == null) {
            return b;
        }
        ListNode c = new ListNode(-1);
        c.next = null;
        ListNode p = a;
        ListNode q = b;
        ListNode s = c;
        int carry = 0;
        while(p != null && q != null) {
            int value = carry + p.val + q.val;
            carry = 0;
            if (value > 9) {
                carry = value / 10;
                value = value % 10;
            }
            ListNode t = new ListNode(value);
            t.next = null;
            s.next = t;
            s = t;
            p = p.next;
            q = q.next;
        }
        while (p != null) {
            int value = carry + p.val;
            carry = 0;
            if (value > 9) {
                carry = value / 10;
                value = value % 10;
            }
            ListNode t = new ListNode(value);
            t.next = null;
            s.next = t;
            s = t;
            p = p.next;
        }
        while(q != null) {
            int value = carry + q.val;
            carry = 0;
            if (value > 9) {
                carry = value / 10;
                value = value % 10;
            }
            ListNode t = new ListNode(value);
            t.next = null;
            s.next = t;
            s = t;
            q = q.next;
        }
        if (carry != 0) {
            int value = carry;
            ListNode t = new ListNode(value);
            t.next = null;
            s.next = t;
            s = t;
        }
        return c.next;
    }
}
