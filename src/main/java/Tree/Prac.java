package Tree;

import Leetcode.TreeNode;

import java.util.*;

public class Prac {
    public static void main(String[] args) {
//        TreeNode five = new TreeNode(5);
//        TreeNode four = new TreeNode(4);
//        TreeNode eleven = new TreeNode();
//        TreeNode seven = new TreeNode(5);
//        TreeNode two = new TreeNode(5);
//        TreeNode eight = new TreeNode(5);
//        TreeNode thirteen = new TreeNode(5);
//        TreeNode four1 = new TreeNode(5);
//        TreeNode one = new TreeNode(5);
//
//        TreeNode root = five;
//        five.left = four;
//        four.left = eleven;
//        eleven.left = seven;
//        eleven.right =two;
//
//        five.right = eight;
//        eight.left = thirteen;
//        eight.right=four1;
//        four.right = one;

      Prac p = new Prac();
//      p.hasPathSum(root);

//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(5);
//        queue.add(7);
//        queue.add(3);
//        queue.add(4);
//        queue.add(5);
//        System.out.println(queue);
//        queue.remove();
//        System.out.println(queue);
//
//        Queue<String> qu1 = new PriorityQueue<>();
//        qu1.add("n");
//        qu1.add("x");
//        qu1.add("a");
//        System.out.println(qu1);


        Set<Integer> set = new HashSet<>();
        set.add(11);
        set.add(2);
        set.add(2);
        set.add(42);
        set.add(5);
        set.add(5);
        set.add(5);
        System.out.println(set);
        System.out.println(set.contains(5));




    }

//    public void hasPathSum(TreeNode root) {
//        if(root == null)return ;
//
//        hasPathSum(root.left);
//        hasPathSum(root.right);
//
//    }




//    public int fib(int n){
//        if(n==0)return 0;
//        if(n==1)return 1;
//        return fib(n-1)+fib(n-2);
//    }

    public void print1ton(int n){
        if(n==0)return;
        print1ton(n-1);
        System.out.println(n);
    }




}
