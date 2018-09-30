import java.util.*;

public class LCA {
    public int getLCA(int a, int b) {
        // write code here
        while (a != b) {
            if (a < b) {
                b = b >> 1;
            } else {
                a = a >> 1;
            }
        }
        return a;
    }
}
/*
除最后一层无任何子节点外，每一层上的所有结点都有两个子结点二叉树。
国内教程定义：一个二叉树，如果每一个层的结点数都达到最大值，则这个二叉树就是满二叉树。也就是说，如果一个二叉树的层数为K，且结点总数是(2^k) -1 ，则它就是满二叉树。
国外(国际)定义:a binary tree T is full if each node is either a leaf or possesses exactly two childnodes.
大意为：如果一棵二叉树的结点要么是叶子结点，要么它有两个子结点，这样的树就是满二叉树。
*/
