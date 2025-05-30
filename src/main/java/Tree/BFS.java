package Tree;

import Leetcode.TreeNode;

import java.util.*;

public class BFS {
    public static void main(String[] args) {
//        TreeNode one = new TreeNode(1);
//        TreeNode two = new TreeNode(2);
//        TreeNode three = new TreeNode(3);
//        TreeNode five = new TreeNode(5);
//
//
//        TreeNode root = one;
//        one.left = two;
//        two.right = five;
//        one.right = three;

        TreeNode three = new TreeNode(3);
        TreeNode nine = new TreeNode(9);
        TreeNode twenty = new TreeNode(20);
        TreeNode fiveteen = new TreeNode(15);
        TreeNode seven  = new TreeNode(7);

        TreeNode root = three;
        three.left = nine;
        three.right = twenty;
        twenty.right = seven;
        twenty.left = fiveteen;

        List<List<Integer>> res =  levelOrderBottom(root);
        System.out.println(res);

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
                System.out.print(node.val+"-");

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


    private static List<Integer> code(TreeNode root){
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int levelCount = queue.size();

            for(int i=0; i<levelCount; i++){
                TreeNode node = queue.remove();
                if(i == levelCount-1){
                    list.add(node.val);
                }

                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }

            }
        }
        return list;
    }



    public static int deepestLeavesSum(TreeNode root) {
        int depth = maxDepth(root);

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int sum =0;
        int curr =0;
        while(!queue.isEmpty()){
            int level = queue.size();
            curr++;
            for(int i=0; i<level; i++){
                TreeNode node = queue.remove();

                if(curr == depth){
                    sum += node.val;
                }

                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }

            }
        }
        return sum;
    }

    public static int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left,right)+1;

    }




    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<List<Integer>> zigzag = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int count = 0;
        while (!queue.isEmpty()) {
            int level = queue.size();
            count++;
            if (count % 2 == 0) {
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < level; i++) {
                    TreeNode node = queue.remove();
                    list.add(node.val);

                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }

                }
                System.out.println("list"+list);
                List<Integer> rev = new ArrayList<>();
                for (int i = list.size() - 1; i >= 0; i--) {
                    rev.add(list.get(i));
                }
                System.out.println("rev"+rev);
                zigzag.add(rev);

            } else {
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < level; i++) {
                    TreeNode node = queue.remove();
                    list.add(node.val);

                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }

                }
                zigzag.add(list);
            }
        }
        return zigzag;
    }




    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null) return new ArrayList<>();
        List<List<Integer>> levelOrderBottom = new ArrayList<>();
        Stack<List<Integer>> stack = new Stack<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
//        stack.push(new ArrayList<Integer>(root.val));
        while(!queue.isEmpty()){
            int level = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<level; i++){
                TreeNode node = queue.remove();
                list.add(node.val);
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            stack.push(list);
        }
        System.out.println(stack);



        return levelOrderBottom;
    }
}
