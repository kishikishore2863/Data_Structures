package SinglyLinkedList;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SinglyLinkedList<T> implements Iterable<T> {
   private int size=0;
   private Node<T> head=null;
   private Node<T> tail=null;

   private static class Node<T>{
       private T data;
       private Node<T> next;

       public Node(T data,Node<T> next){
           this.data = data;
           this.next = next;
       }
   }

   public void addLast(T data){
       if(tail == null){
           head=tail=new Node<T>(data,null);
       }else{
           tail.next = new Node<T>(data,null);
           tail =tail.next;
       }
       size++;
   }

   public int size(){
       return size;
   }

   public boolean isEmpty(){
       return size()==0;
   }

   public void addFirst(T data){
       if(head == null){
           head=tail=new Node<T>(data,null);
       }else {
           head = new Node<T>(data, head);
       }
       size++;
   }





   public Iterator<T> iterator(){
       return new Iterator<T>() {
           private  Node<T> trav = head;
           @Override
           public boolean hasNext() {
               return trav !=null;
           }

           @Override
           public T next() {
               if(!hasNext())throw new NoSuchElementException();
               T data = trav.data;
               trav = trav.next;
               return data;
           }
       };

   }

    public String toString(){
        if (head == null)return "";
        StringBuilder sb = new StringBuilder();
        Node<T> trav = head;
        sb.append("[");
        while (trav !=null){
            sb.append(trav.data);
            if(trav.next !=null)sb.append("->");
            trav=trav.next;
        }
        sb.append("]");
        return sb.toString();
    }

}
