import java.util.*;

public class AddSubstitution {
    public int multiply(int a, int b) {
        int temp = a;
        for (int i = 2; i <= b; i++) {
            a += temp;
        }
        return a;
    }
    
    public int divide(int a, int b) {
        int count = 0;
        while (a >= b) {
            a = minus(a, b);
            count++;
        }
        return count;
    }
    
    public int minus(int a, int b) {
        return a + negate(b);
    }
    
    public int negate(int x) {
        int opposite = -1;
        int temp = opposite;
        while ((opposite + x) != 0) {
            opposite += temp;
        }
        return opposite;
    }
    
    public int calc(int a, int b, int type) {
        // write code here
        int result = 0;
        switch (type) {
            case 1 :
                result = multiply(a, b);
                break;
            case 0:
                result = divide(a, b);
                break;
            case -1:
                result = minus(a, b);
                break;
        }
        return result;
    }
}
