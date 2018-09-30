import java.util.*;

class TreeNode { // TreeNode需要自定义
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int val) {
        this.val = val;
    }
}

public class MinimalBST {
    public int getHeightOfBST(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = getHeightOfBST(root.left);
        int rightHeight = getHeightOfBST(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
    
    public TreeNode buildMinimalBST(int[] val, int start, int end) {
        if (end < start) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(val[mid]);
        root.left = buildMinimalBST(val, start, mid - 1);
        root.right = buildMinimalBST(val, mid + 1, end);
        return root;
    }
    
    public int buildMinimalBST(int[] vals) {
        // write code here
        TreeNode root = buildMinimalBST(vals, 0, vals.length -1);
        return getHeightOfBST(root);
    }
}
