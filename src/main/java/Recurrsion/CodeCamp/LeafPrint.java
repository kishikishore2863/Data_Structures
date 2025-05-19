package Recurrsion.CodeCamp;

import Leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeafPrint {
    public static void main(String[] args) {
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(5);
//        root.right.left = new TreeNode(6);
//        root.right.right = new TreeNode(7);

        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);

        TreeNode root = one;
        one.left = two;
        one.right =three;
        two.left =four;
        two.right = five;

        leafPrint(root);
    }

    public static void leafPrint(TreeNode root){
        if(root ==null){
            return;
        }
        if(root.left == null && root.right==null){
            System.out.println(root.val);
        }

        leafPrint(root.left);
        leafPrint(root.right);
    }
}
