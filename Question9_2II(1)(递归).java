import java.util.*;

public class Robot {
    public static int count(int[][] map, int x, int y) {
        if (x < 0 || y < 0) {
            return 0;
        } else if (x == 0 && y == 0) {
            return 1;
        } else {
            if (map[x][y] != 1) {
                return 0;
            } else {
                return count(map, x - 1, y) + count(map, x, y - 1);
            }
        }
    }

    public static int countWays(int[][] map, int x, int y) { //(0,0)-->(x-1,y-1)
        // write code here
        return count(map, x-1, y-1);
    }
}
// 运行超时:您的程序未能在规定时间内运行结束，请检查是否循环有错或算法复杂度过大。
