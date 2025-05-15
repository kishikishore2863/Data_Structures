package Leetcode;

//public class TreeNode {
//   public int val;
//   public TreeNode left;
//   public TreeNode right;
//
//   public TreeNode(int val){
//       this.val = val;
//   }
//
//
//}


public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }

    public static void display(TreeNode node){
        if(node == null) {
            return;
        }
        System.out.println(node.val);
        display(node.left);
        display(node.right);

    }
}

