package Tree;

import Leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PathSum2 {

     List<List<Integer>> capture = new ArrayList<>();
     List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.left.right = new TreeNode(1);

        PathSum2 pathSum2= new PathSum2();

        List<List<Integer>> result =pathSum2.pathSum(root, 22);
        System.out.println(result);
    }

    public  List<List<Integer>> pathSum(TreeNode root, int targetSum) {
            path(root,0,targetSum);
            return capture;
    }

    private  void path(TreeNode root, int sum, int targetSum){
        if(root == null){
            return;
        }
        sum += root.val;
        list.add(root.val);
        if(root.left == null && root.right == null){
            if(sum == targetSum){
                List<Integer> adder = new ArrayList<>(list);
//                System.out.println(adder);
                capture.add(adder);
//                System.out.println(capture);
            }
        }else{
            path(root.left,sum,targetSum);
            path(root.right,sum,targetSum);
        }
        sum -= root.val;
        list.removeLast();

    }
}
