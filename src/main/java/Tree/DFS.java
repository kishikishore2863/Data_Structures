package Tree;

import Leetcode.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DFS {

   static Map<Integer,Integer> dic = new HashMap<>();
   static List<List<Integer>> pathSum = new ArrayList<>();
   static List<Integer>  list = new ArrayList<>();

    public static void main(String[] args) {
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


        System.out.println(pathSum(root,22));


    }



    public static boolean hasPathSum(TreeNode root, int targetSum) {
        return hasPathSum1(root,targetSum,0);
    }

    public static boolean hasPathSum1(TreeNode root, int targetSum,int count) {
       if(root == null){
           return false;
       }

       if(root.left==null && root.right == null){
           if(root.val+count == targetSum){
               return true;
           }
       }

        System.out.println(root.val +"="+count);
        count = count+root.val;

      boolean left =  hasPathSum1(root.left,targetSum,count);
      boolean right =  hasPathSum1(root.right,targetSum,count);

       return left || right;

    }



    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
       pathSumHelper(root,targetSum,0);
        System.out.println(list);
       return pathSum;

    }

    private static void pathSumHelper(TreeNode root, int targetSum,int count){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            if(targetSum==count+ root.val) {
                list.add(root.val);
               return;
            }

        }
        count=count+root.val;
        System.out.println(list);




        pathSumHelper(root.left,targetSum,count);
        pathSumHelper(root.right,targetSum,count);
        list.add(root.val);
    }


}
