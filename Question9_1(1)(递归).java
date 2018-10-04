import java.util.*;

public class GoUpstairs {
    public static int countWays(int n) {
        // write code here
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        } else {
            return ((countWays(n - 1) + countWays(n - 2)) % 1000000007 + countWays(n - 3)) % 1000000007;
            // 抵达最后一阶的走法，其实就是抵达这最后三阶的方式的总和。
        }
    }
}
