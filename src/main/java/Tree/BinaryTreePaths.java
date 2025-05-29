package Tree;

import Leetcode.TreeNode;


import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {


    public static void main(String[] args) {
//        TreeNode one = new TreeNode(1);
//        TreeNode two = new TreeNode(2);
//        TreeNode three = new TreeNode(3);
//        TreeNode five = new TreeNode(5);
//
//
//
//        TreeNode root = one;
//        one.left = two;
//        two.right = five;
//        one.right = three;

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
        List<Integer> rep = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
       helperPathSum(root,rep,res,22,0);
        System.out.println(res);


    }

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        String path ="";
        helper(root,path,result);
        System.out.println();
        return result;
    }

    public static void helper(TreeNode root, String path,List<String> result){
        if(root == null){
            return;
        }
        path += root.val;
        System.out.println(path);
//        if (root.left == null && root.right == null){
//           result.add(path);
//        }else {
            path += "->";
            helper( root.left,  path,result);
            helper( root.right,  path,result);

//        }




    }



    private static void helperPathSum(TreeNode root, List<Integer> replica,List<List<Integer>> result,int targetSum,int count){
        if(root == null){
            return;
        }



        if(root.left == null && root.right == null){
            if(count+root.val == targetSum){
                replica.add(root.val);
                List<Integer> list = new ArrayList<>();
                list.addAll(replica);
                result.add(list);
            }
        }else{
            replica.add(root.val);
            count += root.val;
            helperPathSum( root.left, replica, result, targetSum,count);
            helperPathSum( root.right, replica, result, targetSum,count);
        }

    }


}
