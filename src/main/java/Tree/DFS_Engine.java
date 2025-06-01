package Tree;

import Leetcode.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DFS_Engine {
    static TreeNode prev = null;
    static String path = "";
    static List<String> capture = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);


//        printAllPaths(root);
//        int res =countLeafNodes(root);
//        int res =sumOfLeafNodes(root);
//        System.out.println(res);

       TreeNode res =  mirror(root);
        System.out.println(res);


    }

    public static void printAllPaths(TreeNode node){
        if(node == null ){
            return;
        }

        path = path+node.val;
        if(node.left == null && node.right == null){
            System.out.println(path);
            capture.add(path);

        }else {
            printAllPaths(node.left);
            printAllPaths(node.right);
        }
        path = path.substring(0,path.length()-1);

    }

    public static void printer(TreeNode root){
        if(root == null){
            return;
        }

        if(root.left == null && root.right==null){
            System.out.print(root.val);
        }
        printer(root.left);
        printer(root.right);
    }

    public static int countLeafNodes(TreeNode node){
        if(node == null){
            return 0;
        }

        if(node.left == null && node.right == null){
            return 1;
        }

        int left = countLeafNodes(node.left);
        int right =countLeafNodes(node.right);

        return left+right;
    }

    public static int sumOfLeafNodes(TreeNode node){
        if(node == null ){
            return 0;
        }

        if(node.left == null && node.right == null){
            return node.val;
        }

        int left = sumOfLeafNodes(node.left);
        int right = sumOfLeafNodes(node.right);

        return left +right;
    }

    public static TreeNode mirror(TreeNode node){
        if(node == null){
            return null;
        }
        TreeNode left = mirror(node.left);
        TreeNode right = mirror(node.right);
        node.left = right;
        node.right = left;
        return node;
    }

    public static boolean isValidBST(TreeNode node, Integer min, Integer max){
       if(node == null){
           return true;
       }
        if (min != null && node.val <= min) {
            return false;
        }
        if (max != null && node.val >= max) {
            return false;
        }

       boolean left  = isValidBST(node.left,min,max);

       boolean right  =  isValidBST(node.right,min,max);

       return left&&right;
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if(root == null){
            return null;
        }

        if(root == p || root == q){
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left ,p,q);
        TreeNode right = lowestCommonAncestor(root.right ,p,q);

        if(left!=null && right!=null){
            return root;
        }
        return null;
    }
}
