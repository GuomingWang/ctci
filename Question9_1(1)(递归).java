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
        }
    }
}
