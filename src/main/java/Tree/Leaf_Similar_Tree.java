package Tree;

import Leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Leaf_Similar_Tree {

    public static void main(String[] args) {
        TreeNode one =new TreeNode(1);
        TreeNode two =new TreeNode(2);
        TreeNode two1 =new TreeNode(200);

        TreeNode root = one;
        one.left = two;
        one.right = two1;

        TreeNode root2 = root;



        Leaf_Similar_Tree leaf = new Leaf_Similar_Tree();
        System.out.println(leaf.leafSimilar(root,root2));
    }
        public boolean leafSimilar(TreeNode root1, TreeNode root2) {
            List<Integer> root1Leafs = new ArrayList<>();
            List<Integer> root2Leafs = new ArrayList<>();

            leafs(root1,root1Leafs);
            leafs(root2,root2Leafs);

            System.out.println(root1Leafs);
            System.out.println(root2Leafs);

            if(root1Leafs.size() != root2Leafs.size())return false;
            return root1Leafs.equals(root2Leafs);
        }

        public void leafs(TreeNode root, List<Integer> store){
            if(root == null){
                return;
            }
            if(root.left == null && root.right == null){
                store.add(root.val);
            }
            leafs(root.left,store);
            leafs(root.right,store);
        }

}
