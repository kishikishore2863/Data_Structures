package SinglyLinkedList;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Practise1<T> implements Iterable<T>{
   private int size = 0;
   private Node<T> head = null;
   private Node<T> tail = null;



   private static class Node<T>{
      private  T data;
      private Node<T> next;

      public Node(T data, Node<T> next){
         this.data=data;
         this.next=next;
      }
   }

   public int size(){
      return size;
   }

//   public boolean isEmpty(){
//      return size()==null;
//   }

   public void addFirst(T data){
      if(head==null){
         head=tail=new Node<T>(data,null);
      }else{
         head=new Node<>(data,head);
      }
      size++;
   }

   public void addLast(T data){
      if(head==null){
         head=tail=new Node<T>(data,null);
      }else{
         tail.next=new Node<>(data,null);
         tail = tail.next;
      }
      size++;
   }



   @Override
   public Iterator<T> iterator() {
      return new Iterator<T>() {
         Node<T> trav=head;
         @Override
         public boolean hasNext() {
            return trav!=null;
         }

         @Override
         public T next() {
            if(!hasNext())throw new NoSuchElementException("no");
            T data =trav.data;
            trav =trav.next;
            return data;
         }
      };
   }


   public String toString(){
      if(head==null)return "";
      Node<T> trav = head;
      StringBuilder sb = new StringBuilder();
      sb.append("[");
      while (trav!=null){
         sb.append(trav.data);
         if (trav.next != null) sb.append(", ");
         trav=trav.next;
      }
      sb.append("]");
      return sb.toString();
   }







}