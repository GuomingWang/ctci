import java.util.*;

public class Robot {
    public int countWays(int x, int y) {
        // write code here
        if (x < 1 || y < 1) {
            return 0;
        } else if (x == 1 && y == 1) {
            return 1;
        } else {
            int[][] a = new int[x + 1][y + 1];
            for (int i = 0; i <= x; i++) {
                a[i][0] = 0;
            }
            for (int i = 0; i <= y; i++) {
                a[0][i] = 0;
            }
            a[1][1] = 1;
            for (int i = 1; i <= x; i++) {
                for (int j = 1; j <= y; j++) {
                    if (i == 1 && j == 1) {
                        continue;
                    }
                    a[i][j] = a[i - 1][j] + a[i][j - 1];
                }
            }
            return a[x][y];
        }
    }
}
