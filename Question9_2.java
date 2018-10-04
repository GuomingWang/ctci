import java.util.*;

public class Robot {
    public int getFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * getFactorial(n - 1);
        }
    }
    public int countWays(int x, int y) {
        // write code here
        x--; // (1,1)-->(x,y)
        y--;
        return getFactorial(x + y) / getFactorial(x) / getFactorial(y);
    }
}
