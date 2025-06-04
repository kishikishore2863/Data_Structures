package Tree;

import Leetcode.TreeNode;
import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class Contest {
    public static void main(String[] args) {
        TreeNode one = new TreeNode();
        TreeNode two = new TreeNode();
        TreeNode three = new TreeNode();
        TreeNode five = new TreeNode();

        TreeNode root = one;
        one.left = two;
        one.right =three;
        two.right = five;

        Contest c = new Contest();
        List<String> res = c.binaryTreePaths(root);

    }
    public void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }

    public void preorder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
    }

    public void postorder(TreeNode root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.val);
    }

    String path ="";
    List<String> list = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        i(root);;
        System.out.println(list);
        return list;
    }

    public void i(TreeNode root){
        if(root == null){
            return;
        }

        path += root.val;
        if(root.left == null && root.right == null){
            String s = path;
            list.add(s);
        }else{
            i(root.left);
            i(root.right);
        }
        path = path.substring(0,path.length()-1);

    }
}
