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
    ListNode c = new ListNode(-1);
    ListNode p = c;
    int carry = 0;
    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        if (a != null && b != null) {
            int value = carry + a.val + b.val;
            carry = 0;
            if (value > 9) {
                carry = value / 10;
                value = value % 10;
            }
            ListNode s = new ListNode(value);
            p.next = s;
            p = s;
            plusAB(a.next, b.next);
        } else if (a != null && b == null) {
            int value = carry + a.val;
            carry = 0;
            if (value > 9) {
                carry = value / 10;
                value = value % 10;
            }
            ListNode s = new ListNode(value);
            p.next = s;
            p = s;
            plusAB(a.next, b);
        } else if (a == null && b != null) {
            int value = carry + b.val;
            carry = 0;
            if (value > 9) {
                carry = value / 10;
                value = value % 10;
            }
            ListNode s = new ListNode(value);
            p.next = s;
            p = s;
            plusAB(a, b.next);
        } else {
            if (carry != 0) {
                int value = carry;
                carry = 0;
                ListNode s = new ListNode(value);
                p.next = s;
                p = s;
            }
        }
        return c.next;
    }
}
