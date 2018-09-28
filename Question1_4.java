import java.util.*;

public class Replacement {
    public String replaceSpace(String iniString, int length) {
        // write code here
        StringBuffer sBuff = new StringBuffer();
        for (int i = 0; i < iniString.length(); i++) {
            if (iniString.charAt(i) == ' ') {
                sBuff.append("%20");
            } else {
                sBuff.append(iniString.charAt(i));
            }
        }
        return iniString = sBuff.toString();
    }
}
