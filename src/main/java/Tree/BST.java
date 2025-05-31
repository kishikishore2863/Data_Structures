package Tree;

import Leetcode.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BST {
    public static void main(String[] args) {
       TreeNode four = new TreeNode(4);
       TreeNode two = new TreeNode(2);
       TreeNode one = new TreeNode(1);
       TreeNode six = new TreeNode(6);
       TreeNode three = new TreeNode(3);

       TreeNode root = four;
       four.left = two;
       two.left = one;
       four.right  = six;
       two.right = three;


       int res = getMinimumDifference1(root);
        System.out.println(res);
    }

    public static int getMinimumDifference1(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        interator(root,list);
        System.out.println(list);
        int min = Integer.MIN_VALUE;
        for(int i=1; i<list.size(); i++){
            min = Math.min(min,list.get(i)-list.get(i-1));
        }
        return list.get(1)-list.get(0);
    }

    private static void interator(TreeNode root, List<Integer> list){
        if(root == null ){
            return;
        }
        interator(root.left,list);
        list.add(root.val);
        interator(root.right,list);

    }

    public static void wrongAns(){
        int[] arr = {543,384,652,445,699};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int min = Integer.MAX_VALUE;
        for(int i=1; i< arr.length; i++){
            min = Math.min(min,arr[i]-arr[i-1]);
        }
        System.out.println(min);

    }


//    public static int getMinimumDifference(TreeNode root) {
//        int min =get(root,Integer.MAX_VALUE);
//        System.out.println(min);
//        return -1;
//    }

//    public static int get(TreeNode root, int min){
//        if(root  == null){
//            return min;
//        }
//
//        int left = get(root.left,min);
//        min = Math.min(min);
//        int right =get(root.right,min);
//        return -1;
//
//    }

}
