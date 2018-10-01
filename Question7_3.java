import java.util.*;

public class CrossLine {
    public boolean checkCrossLine(double s1, double s2, double y1, double y2) {
        // write code here
        if (s1 != s2) {
            return true;
        }
        if (y1 == y2) {
            return true;
        }
        return false;
    }
}
