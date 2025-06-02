package Tree;

import Leetcode.TreeNode;
import com.sun.source.tree.Tree;

import java.util.*;

public class DFS_Engine {
    static TreeNode prev = null;
    static String path = "";
    static List<String> capture = new ArrayList<>();
     List<List<Integer>> capture1= new ArrayList<>();
     List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        DFS_Engine dfs = new DFS_Engine();
        List<Integer> res = dfs.rightSideView(root);
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

    public List<List<Integer>> allPaths(TreeNode root){
        if(root == null){
            return capture1;
        }

        list.add(root.val);
        if(root.left == null && root.right == null){
            List<Integer> adder = new ArrayList<>(list);
            capture1.add(adder);
        }else{
            allPaths(root.left);
            allPaths(root.right);
        }

        list.removeLast();
        return capture1;
    }

    public List<Integer> rightSideView(TreeNode root){
        List<Integer> list = new ArrayList<>();
         int depth =depth(root);
         right(root,depth,list);
        return list;
    }

    public void right(TreeNode root,int depth,List<Integer> list){
        if(root == null){
            return ;
        }
        if(list.size() == depth){
            return ;
        }
        list.add(root.val);
        right(root.right,depth,list);
        right(root.left,depth,list);

    }

    public int depth(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = depth(root.left);
        int right = depth(root.right);
        return Math.max(left,right)+1;
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root){
        if(root == null) return new ArrayList<>();

        List<List<Integer>> container = new ArrayList<>();
        int count =0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!(queue.isEmpty())){
            int levelElements = queue.size();
            count++;
            if(count%2==0){

                Stack<Integer> stack = new Stack<>();

                for(int i =0; i<levelElements; i++){
                    TreeNode node = queue.remove();
                    stack.push(node.val);

                    if(node.left!=null)queue.add(node.left);
                    if(node.right != null)queue.add(node.right);
                }

                List<Integer> list1 = new ArrayList<>();

                while (!stack.isEmpty()){
                    list1.add(stack.pop());
                }

                container.add(list1);

            }else {
                List<Integer> list1 = new ArrayList<>();

                for(int i =0; i<levelElements; i++){
                    TreeNode node = queue.remove();
                    list1.add(node.val);

                    if(node.left!=null)queue.add(node.left);
                    if(node.right != null)queue.add(node.right);
                }

                container.add(list1);
            }

        }
        return container;
    }




}
