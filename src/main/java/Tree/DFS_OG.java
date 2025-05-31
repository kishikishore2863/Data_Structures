package Tree;

import Leetcode.TreeNode;
import java.util.*;

public class DFS_OG {
    public static void main(String[] args) {
//        TreeNode five = new TreeNode(5);
//        TreeNode three = new TreeNode(3);
//        TreeNode two = new TreeNode(2);
//        TreeNode four = new TreeNode(4);
//        TreeNode seven = new TreeNode(7);
//
//        TreeNode root = five;
//        five.left = three;
//        three.left = two;
//        five.right = seven;

//        task1(root);
//        System.out.println();
//        task2(root);
//        System.out.println();
//        task3(root);

        // Construct the following BST:
        //        8
        //       / \
        //      3   10
        //     / \    \
        //    1   6    14
        //       / \   /
        //      4   7 13
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(3);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(6);
        root.left.right.left = new TreeNode(4);
        root.left.right.right = new TreeNode(7);
        root.right.right = new TreeNode(14);
        root.right.right.left = new TreeNode(13);

       TreeNode res =  task16(root,12);


    }

    public static void task1(TreeNode root){
        if(root == null){
           return;
        }

        task1(root.left);
        System.out.print(root.val);
        task1(root.right);
    }

    public static void task2(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.val);
        task2(root.left);
        task2(root.right);

    }

    public static void task3(TreeNode root){
        if(root == null){
            return ;
        }
        task3(root.left);
        task3(root.right);
        System.out.print(root.val);
    }

    public static int task4(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = task4(root.left);
        int right = task4(root.right);
        return Math.max(left,right)+1;
    }

    public static int task5(TreeNode root){
        if(root == null){
            return 0;
        }
        int count=1;
        count +=task5(root.left);
        count +=task5(root.right);
        return count;
    }

    public static int task6(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = task6(root.left);
        int right = task6(root.right);
        if(left == 0 && right == 0){
            return 1;
        }
        return left+right;
    }

    public static int task7(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return root.val;
        }
        int left = task7(root.left);
        int right = task7(root.right);
        return left+right;
    }

    public static boolean task8(TreeNode root, int target){
        if(root == null){
            return false;
        }
        if(root.val == target){
            return true;
        }

       boolean left = task8(root.left,target);
       boolean right =task8(root.right,target);

        return left||right;
    }

    public static int task9(TreeNode root){
        if(root == null){
            return Integer.MAX_VALUE;
        }

        int left =task9(root.left);
        if(root.left == null && root.right == null){
            return root.val;
        }
        int right =task9(root.right);
        return Math.min(left,right);
    }

    public static TreeNode task10(TreeNode root){
        if(root == null){
            return null;
        }

        TreeNode left = task10(root.left);
        TreeNode right = task10(root.right);
        root.left =right;
        root.right =left;
        return root;


    }

    public static boolean task11(TreeNode root){
        return isValid(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    private static boolean isValid(TreeNode node, int min, int max){
        if(node == null){
            return true;
        }

        if(node.val>max || node.val<min){
            return false;
        }

        boolean left = isValid(node.left,min,max);
        boolean right = isValid(node.right,min,max);
        return left&&right;
    }

    public static TreeNode task12(TreeNode root, TreeNode p, TreeNode q){
        if(root == null){
            return null;
        }
        if(root.left != null && root.right != null){
            return root;
        }

        TreeNode left =  task12( root.left,  p,  q);

        TreeNode right =  task12( root.right,  p,  q);
        if(left != null && right != null){
            return root;
        }
        return left != null?left:right;
    }

    public static TreeNode task13(TreeNode root, TreeNode p, TreeNode q){
      if(root == null){
          return null;
      }

        if(root == p || root == q){
            return root;
        }

      TreeNode left = task13( root.left, p, q);
      TreeNode right = task13(root.right,p,q);

        if( left != null && right != null) {
            return root;
        }
      return left!=null ?left:right;
    }

    public static void task14(TreeNode root, List<Integer> path) {
        if (root == null) return;

        path.add(root.val);

        if (root.left == null && root.right == null) {
            System.out.println(path); // base case
        } else {
            task14(root.left, path);
            task14(root.right, path);
        }

        path.remove(path.size() - 1); // 🔙 backtrack
    }

    public static boolean task15(TreeNode root, int target){
        if(root == null){
            return false;
        }
        if(root.val == target){
            return true;
        }
        if(root.val>target){
          return task15(root.left,target);
        }else{
          return task15(root.right,target);
        }

    }

    public static  TreeNode task16(TreeNode root,int val){
        if(root == null){
           return new TreeNode(val);
        }

        if(val > root.val){
            root.right = task16(root.right, val);
        } else {
            root.left = task16(root.left, val);
        }
        return root;
    }



}
