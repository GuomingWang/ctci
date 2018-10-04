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

import java.util.*;

public class Robot {
    public int countWays(int[][] map, int x, int y) {
        // write code here
        if (x < 0 || y < 0) {
            return 0;
        } else if (x == 0 && y == 0) {
            return 1;
        } else {
            int[] a = new int[y]; // 行优先，数组用于存储某一行
            a[0] = 1;
            for (int i = 0; i < x; i++) { // 第i行
                for (int j = 0; j < y; j++) { // 第j列
                    if (map[i][j] != 1) {
                        a[j] = 0;
                    } else if (j > 0) { // a[0]=1或0，a[0]变0后不再改变
                        a[j] = a[j - 1] + a[j];
                    }
                    // 行优先,计算第i行时：
                    // 要走到(0,0)，起点(i,j)的走法 = 起点(i,j-1)的走法 + 起点(i-1,j)的走法
                    // 等号右边的a[j]存储的是上一行的值
                }
            }
            return a[y - 1];
        }
    }
}
