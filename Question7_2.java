import java.util.*;

public class Ants {
    public double antsCollision(int n) {
        // write code here
        return 1 - Math.pow(0.5, n - 1);
    }
}
