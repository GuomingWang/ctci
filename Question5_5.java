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
            if ((C & 1) == 1) {
                count++;
            }
            C >>= 1;
        }
        return count;
    }
}
