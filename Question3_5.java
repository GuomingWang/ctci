import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        while (!stack2.empty()) {
            Object obj = stack2.pop();
            int value = -1;
            if (obj instanceof Integer) {
                value = (int)obj;
            }
            stack1.push(value);
        }
        stack1.push(node);
    }
    
    public int pop() {
        while (!stack1.empty()) {
            Object obj = stack1.pop();
            int value = -1;
            if (obj instanceof Integer) {
                value = (int)obj;
            }
            stack2.push(value);
        }
        Object getObj = stack2.pop();
        int getValue = -1;
        if (getObj instanceof Integer) {
            getValue = (int)getObj;
        }
        return getValue;
    }
}
