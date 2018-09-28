import java.util.*;

public class ReverseEqual {
    public boolean checkReverseEqual(String s1, String s2) {
        // write code here
        if (s2.length() > s1.length()) {
            return false;
        }
        String s3 = s1 + s1;
        return s3.contains(s2);
    }
}
