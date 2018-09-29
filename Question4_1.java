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
public class Balance {
    public int high(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(high(root.left), high(root.right)) + 1;
    }
    
    public boolean isBalance(TreeNode root) {
        // write code here
        if (root == null) {
            return true;
        }
        if (Math.abs(high(root.left) - high(root.right)) >1) {
            return false;
        } else {
            return isBalance(root.left) && isBalance(root.right);
        }
    }
}
