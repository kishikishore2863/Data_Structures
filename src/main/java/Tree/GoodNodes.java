package Tree;

import Leetcode.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class GoodNodes {
    public static void main(String[] args) {
        TreeNode three = new TreeNode(3);
        TreeNode three1 = new TreeNode(3);
        TreeNode one = new TreeNode(1);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode one1 = new TreeNode(5);

        TreeNode root = three;
        three.left = one;
        one.left = three1;
        three.right = four;
        four.left = one1;
        four.right = five;

        GoodNodes goodNodes = new GoodNodes();
        int res = goodNodes.goodNodes(root);
        System.out.println(res);
    }

    public int goodNodes(TreeNode root) {
        return dfs(root, Integer.MIN_VALUE);
    }

    private int dfs(TreeNode node, int maxSoFar) {
        if (node == null) return 0;

        int count = 0;
        if (node.val >= maxSoFar) {
            count = 1;
        }

        int newMax = Math.max(maxSoFar, node.val);
        count += dfs(node.left, newMax);
        count += dfs(node.right, newMax);
        return count;




    }

}
