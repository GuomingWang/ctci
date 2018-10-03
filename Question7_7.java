import java.util.*;

public class KthNumber {
    public static int removeMin(ArrayList<Integer> arrayList) {
        int min = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) < min) {
                min = arrayList.get(i);
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == min) {
                arrayList.remove(i);
                i--; // 后继元素填补空位，因此需要再检查一次
            }
        }
        return min;
    }

    public static int findKth(int k) {
        // write code here
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(7);
        int val = 0;
        for (int i = 0; i < k; i++) {
            val = removeMin(arrayList);
            System.out.println(val);
            arrayList.add(val * 3);
            arrayList.add(val * 5);
            arrayList.add(val * 7);
        }
        return val;
    }
}
