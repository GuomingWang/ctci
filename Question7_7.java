import java.util.*;

public class KthNumber {
    public static int findKth(int k) {
        // write code here
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        ArrayList<Integer> arrayList5 = new ArrayList<>();
        ArrayList<Integer> arrayList7 = new ArrayList<>();
        arrayList3.add(3);
        arrayList5.add(5);
        arrayList7.add(7);
        int val = 0;
        for (int i = 0; i < k; i++) {
            val = Math.min(Math.min(arrayList3.get(0), arrayList5.get(0)), arrayList7.get(0));
            System.out.println(val);
            if (val == arrayList3.get(0)) {
                arrayList3.remove(0);
                arrayList3.add(val * 3);
                arrayList5.add(val * 5);
                arrayList7.add(val * 7);
            } else if (val == arrayList5.get(0)) {
                arrayList5.remove(0);
                arrayList5.add(val * 5);
                arrayList7.add(val * 7);
            } else {
                arrayList7.remove(0);
                arrayList7.add(val * 7);
            }
        }
        return val;
    }
}
