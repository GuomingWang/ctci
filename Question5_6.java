import java.util.*;

public class Exchange {
    public int exchangeOddEven(int x) {
        // write code here
        int even = 0b01010101_01010101_01010101_01010101;
        int odd = 0b10101010_10101010_10101010_10101010;
        even &= x;
        odd &= x;
        even <<= 1;
        odd >>= 1;
        return even | odd;
    }
}
