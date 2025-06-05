package Tree;

import Leetcode.TreeNode;
import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class Contest {
    public static void main(String[] args) {
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode five = new TreeNode(5);

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

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        collectPaths(root, "", list);
        return list;
    }

    public void collectPaths(TreeNode root, String path, List<String> list) {
        if (root == null) return;

        path += root.val;

        if (root.left == null && root.right == null) {
            list.add(path);
        } else {
            path += "->";
            collectPaths(root.left, path, list);
            collectPaths(root.right, path, list);
        }
    }
}
