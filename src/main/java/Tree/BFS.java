package Tree;

import Leetcode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode five = new TreeNode(5);


        TreeNode root = one;
        one.left = two;
        two.right = five;
        one.right = three;
//        practice(root);
        practise2(root);
    }

    public static void printAllNodes(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int nodesInCurrentLevel = queue.size();
            // do some logic here for the current level
            System.out.println();
            for (int i = 0; i < nodesInCurrentLevel; i++) {
                TreeNode node = queue.remove();

                // do some logic here on the current node
                System.out.print(node.val);

                // put the next level onto the queue
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
    }

    public static void practice(TreeNode root){
       Queue<TreeNode> queue =new LinkedList<>();
       queue.add(root);
       while(!queue.isEmpty()){
           int nodesIncurrentLevel = queue.size();
           System.out.println();
           for(int i =0; i<nodesIncurrentLevel; i++){
               TreeNode node = queue.remove();

               System.out.print(node.val+"-");

               if(node.left != null){
                   queue.add(node.left);
               }
               if(node.right != null ){
                   queue.add(node.right);
               }
           }
       }

    }

    private static void practise2(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            int levl = queue.size();
            System.out.println();
            if(levl%2==0) {
                for (int i = 0; i < levl; i++) {
                    TreeNode node = queue.remove();
                    int op = node.val * 2;
                    System.out.print(op + "-");
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }
            }else{
                for (int i = 0; i < levl; i++) {
                    TreeNode node = queue.remove();
                    int op = node.val * 3;
                    System.out.print(op + "-");
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }
            }
        }

    }
}
