import java.util.*;

public class BinDecimal {
    public String printBin(double num) {
        // write code here
        StringBuffer sBuff = new StringBuffer();
        sBuff.append("0.");
        while (num > 0) {
            num *= 2; // num 遵循IEEE二进制浮点数算术标准（IEEE 754），因此不能写成 num = num << 1;
            if (num >= 1) {
                sBuff.append("1");
                num -= 1;
            } else {
                sBuff.append("0");
            }
            if (sBuff.length() > 32) {
                return "Error";
            }
        }
        return sBuff.substring(0, sBuff.length());
    }
}
