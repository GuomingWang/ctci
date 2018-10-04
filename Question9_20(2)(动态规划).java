import java.util.*;

public class Robot {
    public int countWays(int[][] map, int x, int y) {
        // write code here
        if (x < 0 || y < 0) {
            return 0;
        } else if (x == 0 && y == 0) {
            return 1;
        } else {
            int[][] a = new int[x][y];
            for (int i = 0; i < x; i++) {
                if (map[i][0] != 1) {
                    break;
                }
                a[i][0] = 1;
            }
            for (int i = 0; i < y; i++) {
                if (map[0][i] != 1) {
                    break;
                }
                a[0][i] = 1;
            }
            for (int i = 1; i < x; i++) {
                for (int j = 1; j < y; j++) {
                    if (map[i][j] == 1) {
                        a[i][j] = a[i - 1][j] + a[i][j - 1];
                    } else {
                        a[i][j] = 0;
                    }
                }
            }
            return a[x - 1][y - 1];
        }
    }
}
