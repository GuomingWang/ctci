import java.util.*;

public class Robot {
    public int countWays(int x, int y) {
        // write code here
        if (x < 1 || y < 1) { // (1,1)-->(x,y)
            return 0;
        } else if (x == 1 || y == 1) {
            return 1;
        } else {
            return countWays(x - 1, y) + countWays(x, y - 1);
            // 抵达最后一格点的走法，其实就是抵达这最后一格点的两种方式（抵达x直线、抵达y直线）的方法总和。
        }
    }
}
