import java.util.*;

public class Transform {
    public int[][] transformImage(int[][] mat, int n) {
        // write code here
        // 法一：先上下翻转，再沿主对角线翻转
        // 法二：先左右翻转，再沿副对角线翻转
        for (int i = 0, j = n - 1; i < j; i++, j--) { // 上下翻转
            for (int k = 0; k < n; k++) {
                int temp = mat[i][k];
                mat[i][k] = mat[j][k];
                mat[j][k] = temp;
            }
        }
        for (int i = 0; i < n; i++) { // 沿主对角线翻转
            for (int j = i + 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        return mat;
    }
}
