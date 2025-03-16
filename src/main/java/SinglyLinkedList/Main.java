package SinglyLinkedList;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> l1 =new LinkedList<Integer>();
        List<Integer> l2 =new LinkedList<Integer>();
      l1.addLast(2);
      l1.addLast(4);
      l1.addLast(3);
      l2.addLast(5);
      l2.addLast(6);
      l2.addLast(4);
      System.out.println(l1);
      System.out.println(l2);


    }
}
