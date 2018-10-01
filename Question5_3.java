import java.util.*;

public class CloseNumber {
    public int getPre(int x) {
        int temp = x;
        int c0 = 0;
        int c1 = 0;
        while ((temp & 1) == 1) {
            temp >>= 1;
            c1++;
        } // c1表示移除的bit1的个数
        while ((temp & 1) == 0) {
            temp >>= 1;
            c0++;
        } // c0表示移除的bit0的个数
        temp >>= 1;
        temp <<= c0 + c1 + 1;
        temp |= ((1 << (c1 + 1)) - 1) << (c0 - 1);
        return temp;
    }

    public int getNext(int x) {
        int temp = x;
        int c0 = 0;
        int c1 = 0;
        while ((temp & 1) == 0) {
            temp >>= 1;
            c0++;
        } // c0表示移除的bit0的个数
        while ((temp & 1) == 1) {
            temp >>= 1;
            c1++;
        } // c1表示移除的bit1的个数
        temp += 1;
        temp <<= c0 + c1;
        temp |= (1 << (c1 - 1)) - 1;
        return temp;
    }

    public int[] getCloseNumber(int x) {
        // write code here
        int[] arr = new int[2];
        arr[0] = getPre(x);
        arr[1] = getNext(x);
        return arr;
    }
}
