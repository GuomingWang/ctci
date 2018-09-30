import java.util.*;

/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}*/
public class Successor {
    public void inOrder(TreeNode root, LinkedList<Integer> list) {
        if (root == null) {
            return;
        }
        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }
    public int findSucc(TreeNode root, int p) {
        // write code here
        LinkedList<Integer> list = new LinkedList<>();
        inOrder(root, list);
        int i = 0;
        for (; i < list.size(); i++) {
            if (list.get(i) == p) {
                break;
            }
        }
        i++;
        if (i < list.size()) {
            return list.get(i);
        } else {
            return -1;
        }
    }
}
