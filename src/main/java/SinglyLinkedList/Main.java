package SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
      Practise1<Integer> list = new Practise1<Integer>();
      list.addFirst(1);
      list.addFirst(0);
      list.addFirst(-1);
      list.addLast(2);
      System.out.println(list);
    }
}
