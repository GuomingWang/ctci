import java.util.ArrayList;
/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    ArrayList<ArrayList<Integer>> outerList = new ArrayList<>();
    ArrayList<Integer> innerList = new ArrayList<>();
    
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if (root == null) {
            return outerList; 
            // 不能写成 return null；,因为当树是空树时，需要返回一个空数组对象，而不是返回不指向数组对象的null
        }
        innerList.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null) {
            outerList.add(new ArrayList<Integer>(innerList)); 
            // innerList 是引用类型，后续操作会改变 innerList ,如果不复制对象，则之前保存的路径信息后被后面保存的路径信息所覆盖
        }
        FindPath(root.left, target); 
        // 对 root.left 递归
        FindPath(root.right, target); 
        // 对 root.right 递归，其中包含上一句，则在对 root.right 递归之中包含有对 root.left 的递归
        innerList.remove(innerList.size() - 1); 
        // 在每次递归的最终，访问到叶子节点，此时该叶子节点为 root ，在下一次递归开始时，该叶子节点的双亲节点将成为 root
        // 在该次递归结束后，下次递归开始前，应该在 innerList 中删除该叶子节点，以免保留在下一次递归的路径中
        return outerList;
    }
}
