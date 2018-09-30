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
public class Checker {
    Integer leftMax = null;
    public boolean checkBST(TreeNode root) {
        // write code here
        if (root == null) {
            return true;
        }
        if (!checkBST(root.left)) {
            return false;
        }
        // leftMax = root.val; // 此语句不能放在此处，因为只有在root为当前最大值的前提下，才能执行此语句
        if (leftMax != null && leftMax >= root.val) { // 判断root是否为当前最大值
            return false; // 否，跳出
        }
        leftMax = root.val; // 是，赋值
        if (!checkBST(root.right)) {
            return false;
        }
        return true;
    }
}
