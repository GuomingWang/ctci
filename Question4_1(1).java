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
    public int postorderGetHeight(TreeNode root) { // 后续遍历
        if (root == null) {
            return 0;
        }
        // 先求左子树的高度，判断平衡性
        int leftHeight = postorderGetHeight(root.left);
        if (leftHeight == -1) {
            return -1;
        }
        // 再求右子树的高度，判断平衡性
        int rightHeight = postorderGetHeight(root.right);
        if (rightHeight == -1) {
            return -1;
        }
        // 后求整棵树的高度，判断平衡性
        // 求所有子树的高度时都递归调用到下面的 if-else 语句
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        } else {
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
    
    public boolean isBalance(TreeNode root) {
        // write code here
        return postorderGetHeight(root) != -1;
    }
}
