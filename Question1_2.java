import java.util.*;

public class Reverse {
    public String reverseString(String iniString) {
        // write code here
        if (iniString.length() <= 1) {
            return iniString;
        }
        StringBuffer sBuff = new StringBuffer();
        for (int i = iniString.length() - 1; i >= 0; i--) {
            sBuff.append(iniString.charAt(i));
        }
        iniString = sBuff.toString();
        return iniString;
    }
}
