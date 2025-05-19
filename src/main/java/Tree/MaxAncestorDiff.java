package Tree;

import Leetcode.TreeNode;
import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class MaxAncestorDiff {

    public static void main(String[] args) {

        TreeNode eight = new TreeNode(8);
        TreeNode three = new TreeNode(3);
        TreeNode one = new TreeNode(1);
        TreeNode six = new TreeNode(6);
        TreeNode four = new TreeNode(4);
        TreeNode seven = new TreeNode(7);
        TreeNode ten = new TreeNode(10);
        TreeNode fourteen = new TreeNode(14);
        TreeNode thirteen = new TreeNode(13);

        TreeNode root = eight;
        eight.left = three;
        three.left = one;
        three.right = six;
        six.left = four;
        six.right = seven;
        eight.right = ten;
        ten.right= fourteen;
        fourteen.left =thirteen;

        int res = maxAncestorDif(root);
        System.out.println(res);
    }

    public static int maxAncestorDif(TreeNode root) {
        return helper(root, root.val, root.val);
    }

    private static int helper(TreeNode node, int max, int min) {
        if (node == null) return min-max;

        max = Math.max(max, node.val);
        min = Math.min(min, node.val);

        int left = helper(node.left, max, min);
        int right = helper(node.right, max, min);

        return Math.max(left, right);
    }
}
