import java.util.*;

public class GoUpstairs {
    public int countWays(int n) {
        // write code here
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else {
            int a = 0;
            int b = 1;
            int c = 1;
            int sum = a + b + c;
            for (int i = 2; i <= n; i++) {
                sum = ((a + b) % 1000000007 + c) % 1000000007;
                // 取模运算性质：(a+b)%c = ((a%c)+(b%c))%c
                a = b;
                b = c;
                c = sum;
            }
            return sum;
        }
    }
}
