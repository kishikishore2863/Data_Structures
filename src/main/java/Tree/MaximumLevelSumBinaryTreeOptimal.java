package Tree;

import Leetcode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaximumLevelSumBinaryTreeOptimal {
    public static void main(String[] args) {
        MaximumLevelSumBinaryTreeOptimal ob = new MaximumLevelSumBinaryTreeOptimal();
        TreeNode five = new TreeNode(5);
        TreeNode four = new TreeNode(4);
        TreeNode eleven = new TreeNode(11);
        TreeNode seven = new TreeNode(7);
        TreeNode two = new TreeNode(2);
        TreeNode eight = new TreeNode(8);
        TreeNode thirteen = new TreeNode(13);
        TreeNode four1 = new TreeNode(4);
        TreeNode one = new TreeNode(1);
        TreeNode five1 = new TreeNode(5);

        TreeNode root = five;
        five.left = four;
        four.left = eleven;
        eleven.left = seven;
        eleven.right = two;
        five.right = eight;
        eight.right = four1;
        four1.right = one;
        eight.left = thirteen;
        four1.left = five1;

        int res = ob.maxLevelSum(root);
        System.out.println(res);
    }

    public int maxLevelSum(TreeNode root) {
        int level = 0;
        int maxSum = 0;
        int resultLevel = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int levelTrav = queue.size();
            level++;
            int levelSum = 0;
            for (int i = 0; i < levelTrav; i++) {
                TreeNode temp = queue.remove();
                levelSum += temp.val;
                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }
            if (levelSum > maxSum) {
                maxSum = levelSum;
                resultLevel = level;
            }
        }
        return resultLevel;
    }
}
