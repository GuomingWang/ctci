import java.util.*;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}*/
public class TreeLevel {
    public LinkedList<LinkedList<TreeNode>> levelOrder(TreeNode root) { // BFS变形
        LinkedList<LinkedList<TreeNode>> outerList = new LinkedList<>();
        LinkedList<TreeNode> innerList = new LinkedList<>();
        innerList.add(root);
        while (!innerList.isEmpty()) {
            outerList.add(innerList);
            LinkedList<TreeNode> parents = innerList;
            innerList = new LinkedList();
            for (TreeNode parent : parents) {
                if (parent.left != null) {
                    innerList.add(parent.left);
                }
                if (parent.right != null) {
                    innerList.add(parent.right);
                }
            }
        }
        return outerList;
    }
    
    public ListNode getTreeLevel(TreeNode root, int dep) {
        // write code here
        LinkedList<LinkedList<TreeNode>> getOuterList = levelOrder(root);
        ListNode listOfDep = new ListNode(-1);
        ListNode p = listOfDep;
        LinkedList getInnerList = getOuterList.get(dep - 1);
        for (int i = 0; i < getInnerList.size(); i++) {
            int value = ((TreeNode)(getInnerList.get(i))).val;
            ListNode s = new ListNode(value);
            p.next = s;
            p = s;
        }
        return listOfDep.next;
    }
}
