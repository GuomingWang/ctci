import java.util.*;
 
public class GoUpstairs {
    public int countWays(int n) {
        // write code here
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (n == 3) {
            return 4;
        }
        int[] a = new int[] {1, 2, 4};
        for (int i = 4; i <= n; i++) {
            int temp = ((a[0] + a[1]) % 1000000007 + a[2]) % 1000000007;
            // 取模运算性质：(a+b)%c = ((a%c)+(b%c))%c
            a[0] = a[1];
            a[1] = a[2];
            a[2] = temp;
        }
        return a[2];
    }
}
