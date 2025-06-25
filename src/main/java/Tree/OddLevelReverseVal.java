package Tree;

import Leetcode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class OddLevelReverseVal {
    public static void main(String[] args) {
        TreeNode zero = new TreeNode(0);
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode zero1 = new TreeNode(0);
        TreeNode zero11 = new TreeNode(0);
        TreeNode zero111 = new TreeNode(0);
        TreeNode zero1111 = new TreeNode(0);
        TreeNode one1 =new TreeNode(1);
        TreeNode one11 =new TreeNode(1);
        TreeNode one111 =new TreeNode(1);
        TreeNode one1111 =new TreeNode(1);
        TreeNode two1 =new TreeNode(2);
        TreeNode two11 =new TreeNode(2);
        TreeNode two111 =new TreeNode(2);
        TreeNode two1111 =new TreeNode(2);

        TreeNode root = zero;
        zero.left = one;
        zero.right = two;
        one.left =zero1;
        one.right = zero11;
        two.left = zero111;
        two.right = zero1111;
        zero1.left = one1;
        zero1.right = one11;
        zero11.left = one111;
        zero11.right = one1111;
        zero111.left = two1;
        zero111.right = two11;
        zero1111.left = two111;
        zero1111.right = two1111;



        OddLevelReverseVal oddLevelReverseVal = new OddLevelReverseVal();
        List<Integer> list1 = oddLevelReverseVal.bfs(root);
        System.out.println(list1);

        oddLevelReverseVal.reveseOdd(root.left,root.right,0);
        List<Integer> list = oddLevelReverseVal.bfs(root);
        System.out.println(list);


    }

    public void reveseOdd(TreeNode leftChild, TreeNode rightChild , int level){
        if(leftChild == null || rightChild == null){
            return ;
        }

        if(level%2==0){
            int temp = leftChild.val;
            leftChild.val = rightChild.val;
            rightChild.val = temp;
        }

        reveseOdd(leftChild.left,rightChild.right,level+1);
        reveseOdd(leftChild.right,rightChild.left,level+1);
        String s ="";
    }

    public List<Integer> bfs(TreeNode root){
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int level = queue.size();
            for(int i=0; i<level; i++){
                TreeNode node = queue.remove();
                list.add(node.val);
                if(node.left!=null)queue.add(node.left);
                if(node.right!=null)queue.add(node.right);
            }
        }
        return list;
    }

}

