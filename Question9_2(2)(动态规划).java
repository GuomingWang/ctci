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

import java.util.*;

public class Robot {
    public int countWays(int x, int y) {
        // write code here
        if (x < 1 || y < 1) {
            return 0;
        } else if (x == 1 || y == 1) {
            return 1;
        } else {
            int[] a = new int[y + 1]; // 行优先，数组用于存储某一行
            a[0] = 0; // (0,0)置0
            a[1] = 1; // 第1列置1
            for (int i = 1; i <= y; i++) { // 第1行置1
                a[i] = 1;
            }
            for (int i = 2; i <= x; i++) { // 第i行
                for (int j = 2; j <= y; j++) { // 第j列
                    a[j] = a[j - 1] + a[j];
                    // 行优先,计算第i行时：
                    // 要走到(1,1)，起点(i,j)的走法 = 起点(i,j-1)的走法 + 起点(i-1,j)的走法
                    // 等号右边的a[j]存储的是上一行的值
                }
            }
            return a[y];
        }
    }
}
