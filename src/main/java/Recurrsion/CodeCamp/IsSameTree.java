package Recurrsion.CodeCamp;

import Leetcode.TreeNode;

public class IsSameTree {
    public static void main(String[] args) {
//        TreeNode one1 = new TreeNode(1);
//        TreeNode one2 = new TreeNode(1);
//        TreeNode two1 = new TreeNode(2);
//        TreeNode two2 = new TreeNode(2);
//        TreeNode three1 = new TreeNode(3);
//        TreeNode three2 = new TreeNode(3);
//
//        TreeNode p = one1;
//        one1.left = two1;
//        one1.right = three1;
//
//        TreeNode q = one2;
//        one2.left = two2;
//        one2.right = three2;
//
//        boolean res =isSameTree(p,q);
//        System.out.println(res);


        TreeNode ten1 = new TreeNode(10);
        TreeNode ten2 = new TreeNode(10);
        TreeNode five1 = new TreeNode(5);
        TreeNode five2 = new TreeNode(5);
        TreeNode fifteen1 = new TreeNode(15);
        TreeNode fifteen2 = new TreeNode(15);


        TreeNode p = ten1;
        ten1.left = five1;
        ten1.right = fifteen1;

        TreeNode q = ten2;
        ten2.left = five2;
        five2.right = fifteen2;

        boolean res = isSameTree(p,q);
        System.out.println(res);


    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if( p==null && q==null ){
            return true;
        }

        if(p==null || q==null){
            return false;
        }


        if(p.val == q.val){
            Boolean left = isSameTree(p.left,q.left);
            Boolean right = isSameTree(p.right,q.right);
            return left && right;
        }

        return false;
    }
}
