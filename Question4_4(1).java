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
    public void inOrder(TreeNode root, LinkedList<LinkedList<TreeNode>> outerList, int level) { // DFS变形，使用二维数组
        if (root == null) {
            return;
        }
        LinkedList<TreeNode> innerList = null;
        if (outerList.size() == level) { // 初次到达level层
            innerList = new LinkedList<TreeNode>();
            outerList.add(innerList);
        } else { // 非初次到达level层
            innerList = outerList.get(level); 
        }
        innerList.add(root);
        inOrder(root.left, outerList, level + 1);
        inOrder(root.right, outerList, level + 1);
    }
    
    public ListNode getTreeLevel(TreeNode root, int dep) {
        // write code here
        LinkedList<LinkedList<TreeNode>> getOuterList = new LinkedList<>();
        inOrder(root, getOuterList, 0);
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
