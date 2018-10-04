import java.util.*;

public class MagicIndex {
    public boolean recursion(int[] A, int start, int end) {
        if (end < start) {
            return false;
        }
        int mid = (start + end) / 2;
        if (A[mid] == mid) {
            return true;
        }else if (A[mid] < mid) {
            return recursion(A, mid + 1, end);
        } else {
            return recursion(A, start, mid - 1);
        }
    }
    
    public boolean findMagicIndex(int[] A, int n) {
        // write code here
        return recursion(A, 0, n - 1);
    }
}
