import java.util.*;

public class CatDogAsylum {
    public ArrayList<Integer> asylum(int[][] ope) {
        // write code here
        ArrayList<Integer> queue = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < ope.length; i++) {
            if (ope[i][0] == 1) {
                queue.add(ope[i][1]);
            }
            if (ope[i][0] == 2) {
                if (queue.size() == 0) {
                    continue;
                }
                if (ope[i][1] == 0) {
                    arr.add(queue.remove(0));
                } else if (ope[i][1] < 0) {
                    for (int j = 0; j < queue.size(); j++) {
                        if (queue.get(j) < 0) {
                            arr.add(queue.remove(j));
                            break;
                        }
                    }
                } else {
                    for (int j = 0; j < queue.size(); j++) {
                        if (queue.get(j) > 0) {
                            arr.add(queue.remove(j));
                            break;
                        }
                    }
                }
            }
        }
        return arr;
    }
}
