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
    public boolean checkBST(TreeNode root, int min, int max) {
        if (root == null) {
            return true;
        }
        if (root.val <= min || root.val >= max) {
            return false;
        }
        if (!checkBST(root.left, min, root.val)) {
            return false;
        }
        if (!checkBST(root.right, root.val, max)) {
            return false;
        }
        return true;
    }
    
    public boolean checkBST(TreeNode root) {
        // write code here
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
