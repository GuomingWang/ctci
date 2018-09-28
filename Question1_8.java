import java.util.*;

public class ReverseEqual {
    public boolean isSubstring(String father, String child) {
        if (child.length() > father.length()) {
            return false;
        }
        for (int i = 0; i < father.length(); i++) {
            int temp = i;
            int j = 0;
            while(j < child.length() && child.charAt(j) == father.charAt(temp)) {
                temp++;
                j++;
            }
            if (j == child.length()) {
                return true;
            }
        }
        return false;
    }
    public boolean checkReverseEqual(String s1, String s2) {
        // write code here
        if (s2.length() > s1.length()) {
            return false;
        }
        String s3 = s1 + s1;
        return isSubstring(s3, s2);
    }
}
