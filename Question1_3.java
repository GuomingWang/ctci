import java.util.*;
import java.util.Arrays;

public class Same {
    public boolean checkSam(String stringA, String stringB) {
        // write code here
        if (stringB.length() != stringA.length()) {
            return false;
        }
        char[] a = stringA.toCharArray();
        char[] b = stringB.toCharArray();
        Arrays.sort(a); // Arrays类的sort()方法是静态方法
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++) {
            if (b[i] != a[i]) {
                return false;
            }
        }
        return true;
    }
}
