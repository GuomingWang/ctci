import java.util.*;

public class Transform {
    public int calcCost(int A, int B) {
        // write code here
        if (B == A) {
            return 0;
        }
        int C = A ^ B;
        int count = 0;
        while (C != 0) {
            count++;
            C &= (C - 1);
        }
        return count;
    }
}
