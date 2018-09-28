import java.util.*;

public class Zipper {
    public String zipString(String iniString) {
        // write code here
        StringBuffer sBuff = new StringBuffer();
        for (int i = 0; i < iniString.length();) {
            int count = 1;
            int j = i + 1;
            while (j < iniString.length() && iniString.charAt(j) == iniString.charAt(i)) {
                count++;
                j++;
            }
            sBuff.append(iniString.charAt(i));
            sBuff.append(count);
            i += count;
        }
        String s = sBuff.toString();
        return s.length() < iniString.length() ? s : iniString;
    }
}
