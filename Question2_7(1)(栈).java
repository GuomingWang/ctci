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
            return true;
        }
        Stack a = new Stack();
        ListNode fast = pHead;
        ListNode slow = pHead;
        a.push(slow.val);
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            a.push(slow.val);
        }
        if (fast.next != null) {
            slow = slow.next;
        }
        while (slow != null) {
            Object top = a.pop(); // E pop()
            if (top instanceof Integer) { // required: class or array
                int value = (int)top;
                if (value != slow.val) {
                    return false;
                }
            }
            slow = slow.next;
        }
        return true;
    }
}
