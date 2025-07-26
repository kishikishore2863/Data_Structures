package Tree;

import java.util.PriorityQueue;
import java.util.Queue;

class Tree{
    String nodeLabel;
    int weight;
    int depth;

    //child
    public Tree left;
    public Tree mid;
    public Tree right;

    public Tree(){}

    public Tree(String nodeLabel, int depth, int weight){
        this.nodeLabel = nodeLabel;
        this.depth = depth;
        this.weight = weight;
    }

    public Tree(String nodeLabel, int  depth,  int weight, Tree left, Tree mid, Tree right) {
        this.nodeLabel = nodeLabel;
        this.weight = weight;
        this.depth = depth;
        this.left = left;
        this.mid = mid;
        this.right = right;
    }
}

public class FreshGraduate {



    public static void main(String[] args) {
        FreshGraduate freshGraduate = new FreshGraduate();

        Tree r = new Tree("R", 0, 1);

        Tree a = new Tree("A", 1, 2);
        Tree b = new Tree("B", 1, 1);
        Tree c = new Tree("C", 1, 3);

        Tree d = new Tree("D", 2,1);
        Tree e = new Tree("E", 2, 4);
        Tree f = new Tree("F", 2, 2);
        Tree g = new Tree("G", 2, 1);
        Tree h = new Tree("H", 2, 3);
        Tree i = new Tree("I", 2, 2);
        Tree j = new Tree("J", 2, 1);
        Tree k = new Tree("K", 2, 4);
        Tree l = new Tree("L", 2, 3);

        Tree n = new Tree("N", 3, 1);
        Tree m = new Tree("M", 3, 2);
        Tree o = new Tree("O", 3, 1);

        r.left = a;
        r.mid = b;
        r.right = c;

        a.left = d;
        a.mid = e;
        a.right = f;

        b.left = g;
        b.mid = h;
        b.right =i;

        c.left = j;
        c.mid = k;
        c.right = l;

        e.mid = n;
        g.left = m;
        k.right = o;


//        int cost =freshGraduate.goal(r, "O");
        int cost =freshGraduate.goal(r, "A");
        System.out.println("cost:"+cost);

    }

    public int goal(Tree root, String target){
        int costStore =-1;

        Queue<Tree> queue = new PriorityQueue<>(
                (a, b) -> (a.weight + a.depth) - (b.weight + b.depth)
        );

        queue.add(root);

        while (!queue.isEmpty()){

                Tree temp = queue.remove();
                int cost = temp.weight + temp.depth;

                if (temp.nodeLabel.equals(target)) {
                    costStore = cost;
                    break;
                }

                if (temp.left != null) queue.add(temp.left);
                if (temp.mid != null) queue.add(temp.mid);
                if (temp.right != null) queue.add(temp.right);

        }
        return costStore;
    }
}
