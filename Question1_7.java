import java.util.*;

public class Clearer {
    public int[][] clearZero(int[][] mat, int n) {
        // write code here
        boolean[] row = new boolean[n];
        boolean[] column = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] || column[j]) {
                    mat[i][j] = 0;
                }
            }
        }
        return mat;
    }
}
