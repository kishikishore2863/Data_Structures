package Tree;

import Leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class SecondMinimumTree {

        List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(5);



        SecondMinimumTree obj = new SecondMinimumTree();
        int res = obj.findSecondMinimumValue(root);
        System.out.println(res);
    }

        public int findSecondMinimumValue(TreeNode root) {
            second(root);
            System.out.println(list);
            int min = Integer.MAX_VALUE;
            int secondMin = Integer.MAX_VALUE;
            for (int val : list) {
                if (val < min) {
                    secondMin = min;
                    min = val;
                } else if (val > min && val < secondMin) {
                    secondMin = val;
                }
            }
            return secondMin == Integer.MAX_VALUE ? -1 : secondMin;
        }

        public void second(TreeNode root){
            if(root == null){
                return ;
            }

            list.add(root.val);
            second(root.left);
            second(root.right);
        }
}
