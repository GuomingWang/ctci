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
    boolean flag = true;
    
    public boolean recursion(ListNode pHead, ListNode p, int length) {
        if (pHead == null || length == 0) {
            return true;
        }
        recursion(pHead.next, p, length - 1);
        int count = 0;
        while (count != length) {
            p = p.next;
            count++;
        }
        if (p.val != pHead.val) {
            flag = false;
        }
        return flag;
    }
    
    public boolean isPalindrome(ListNode pHead) {
        // write code here
        if (pHead == null || pHead.next == null) {
            return true;
        }
        ListNode headMarker = new ListNode(-1);
        headMarker.next = pHead;
        ListNode p = headMarker;
        int length = 0;
        ListNode q = pHead;
        while (q != null) {
            length++;
            q = q.next;
        }
        return recursion(pHead, p, length);
    }
}
