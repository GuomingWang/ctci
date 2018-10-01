import java.util.*;

public class Finder {
    public int findMissing(int[][] numbers, int n) {
        // write code here
        int i = 0;
        while (i < n) {
            if (i % 2 != numbers[i][0]) {
                break;
            }
            i++;
        }
        return i;
    }
}
