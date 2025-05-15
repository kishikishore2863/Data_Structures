package Tree;


import Leetcode.TreeNode;

public class Test1 {
    public static void main(String[] args) {
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);

        TreeNode root =one;
        one.left =two;
        one.right = three;
//        TreeNode.display(root);
        TreeNode res = invertBinary(root);
        TreeNode.display(res);



    }

    public static TreeNode invertBinary(TreeNode node){
        if(node == null){
            return null  ;
        }

       TreeNode left= invertBinary(node.right);
       TreeNode right= invertBinary(node.left);
       node.left =right;
       node.right =left;
        return node;
    }
}