import java.util.*;

public class SetOfStacks {
    public ArrayList<ArrayList<Integer>> setOfStacks(int[][] ope, int size) {
        // write code here
        ArrayList<ArrayList<Integer>> stack = new ArrayList<>();
        ArrayList<Integer> node = new ArrayList<>(size);
        node.add(ope[0][1]);
        stack.add(node);
        for (int i = 1; i < ope.length; i++) {
            if (ope[i][0] == 1) {
                if (node.size() == size) {
                    node = new ArrayList<>(size);
                    stack.add(node);
                } 
                node.add(ope[i][1]);
            }
            if (ope[i][0] == 2) {
                if (node.size() == 1) {
                    stack.remove(stack.size() - 1);
                    node = stack.get(stack.size() - 1);
                } else {
                    node.remove(node.size() - 1);
                }
            }
        }
        return stack;
    }
}
