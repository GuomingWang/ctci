import java.util.*;

public class GoUpstairs {
    public int countWays(int n) {
        // write code here
        if (n < 0) {
            return 0; // 楼梯有负数阶，没有办法
        } else if (n == 0) {
            return 1; // 楼梯有0阶，只有1种方法
        } else {
            int a = 0;
            int b = 0;
            int c = 1;
            int sum = a + b + c;
            for (int i = 1; i <= n; i++) {
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
