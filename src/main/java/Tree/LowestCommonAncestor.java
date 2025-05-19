package Tree;

import Leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LowestCommonAncestor {
    public static void main(String[] args) {
        TreeNode zero = new TreeNode(0);
        TreeNode one = new TreeNode(1);
        TreeNode three = new TreeNode(3);
        TreeNode two = new TreeNode(2);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);

        TreeNode root = zero;
        zero.left = one;
        one.left = three;
        zero.right = two;
        two.left = four;
        two.right = five;
        four.left = six;

        List<Integer> list = new ArrayList<>();

       TreeNode res =  funct(root,four,five);
        System.out.println(res.val);
    }

    public static TreeNode funct(TreeNode root,TreeNode p,TreeNode q ){
        if(root == null) return null;

        if(root == p || root == q) return root;

        TreeNode left = funct(root.left,p,q);
        TreeNode right = funct(root.right,p,q);


        if(left !=null && right !=null)return root;

        if(left !=null){
            return left;
        }

        return right;

    }

}
