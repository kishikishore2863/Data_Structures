package Tree;

public class DefaultTree {
}

class Tree{
  int val;
  Tree left;
  Tree right;

  Tree(int val){
     this.val = val;
  }
}


class Test{
    public static void main(String[] args) {
        Tree three = new Tree(3);
        Tree five = new Tree(5);
        Tree six = new Tree(6);
        Tree two = new Tree(2);
        Tree seven = new Tree(7);
        Tree four = new Tree(4);
        Tree one  = new Tree(1);
        Tree zero  = new Tree(0);
        Tree eight = new Tree(8);

        Tree root = three;
        three.left = five;
        five.left = six;
        five.right = two;
        two.left = seven;
        two.right= four;
        three.right = one;
        one.left = zero;
        one.right = eight;

        Test d = new Test();
        d.recur(root);

    }

    public void recur(Tree node){
        if(node == null) return;
        System.out.println(node.val);
        recur(node.left);
        recur(node.right);
    }





}





