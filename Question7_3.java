import java.util.*;

public class CrossLine {
    public boolean checkCrossLine(double s1, double s2, double y1, double y2) {
        // write code here
        double epsilon = 1e-6;
        // 了解浮点表示法的限制。切记不要用==检查浮点数是否相等，而是应该检查两者差值是否小于某个极小值，例如1e-6。
        if (Math.abs(s1 - s2) >= epsilon) {
            return true;
        }
        if (Math.abs(y1 - y2) < epsilon) {
            return true;
        }
        return false;
    }
}
