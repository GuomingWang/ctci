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
        x--; // (x,y)-->(1,1)
        y--;
        return getFactorial(x + y) / getFactorial(x) / getFactorial(y);
    }
}
