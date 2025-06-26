package Tree;

import Leetcode.TreeNode;

public class GoodNodes {
     static int count =0;
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
        if(root == null )return 0;


        good(root,root.val);
        return count;

    }

    public void good(TreeNode root ,int rootVal){
        if(root == null )return ;

        if(root.val >= rootVal){
            count++;
        }
        good(root.left,rootVal);
        good(root.right,rootVal);
    }
}
