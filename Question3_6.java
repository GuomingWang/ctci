import java.util.*;

public class TwoStacks {
    public ArrayList<Integer> twoStacksSort(int[] numbers) {
        // write code here
        ArrayList<Integer> stack = new ArrayList();
        stack.add(numbers[0]);
        for (int i = 1; i < numbers.length; i++) {
            int temp = numbers[i];
            int j = i;
            boolean flag = false;
            while (stack.size() > 0 && stack.get(stack.size() - 1) < temp) {
                flag = true;
                numbers[j] = stack.remove(stack.size() - 1);
                j--;
            }
            stack.add(temp);
            if (flag) {
                j++;
                while (j <= i) {
                    stack.add(numbers[j]);
                    j++;
                }
            }
        }
        return stack;
    }
}
