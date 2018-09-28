import java.util.*;

public class Same {
    public boolean checkSam(String stringA, String stringB) {
        // write code here
        if (stringB.length() != stringA.length()) {
            return false;
        }
        int[] arr = new int[128];
        for (int i = 0; i < stringA.length(); i++) {
            int index = stringA.charAt(i);
            arr[index]++;
        }
        for (int i = 0; i < stringB.length(); i++) {
            int index = stringB.charAt(i);
            arr[index]--;
            if (arr[index] < 0) {
                return false;
            }
        }
        return true;
    }
}
