import java.util.*;

public class Different {
    public boolean checkDifferent(String iniString) {
        // write code here
        if (iniString.length() > 128) {
            return false;
        }
        long low = 0L;
        long high = 0L;
        for (int i = 0; i < iniString.length(); i++) {
            int val = iniString.charAt(i);
            if (val < 64){
                if ((low & (1 << val)) > 0) {
                    return false;
                }
                low |= (1 << val);
            } else {
                if ((high & (1 << (val - 64))) > 0) {
                    return false;
                }
                high |= (1 << (val - 64));
            }
        }
        return true;
    }
}
