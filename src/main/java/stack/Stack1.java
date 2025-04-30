package stack;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;

public class Stack1<T> implements Iterable<T> {

    private int size = 0;
    private Node<T> head = null;
    private Node<T> tail = null;

    Queue<Integer> queue = new PriorityQueue<>();






    private static class Node<T>{

        private T data;
        private Node<T> next;
        private Node<T> prev;

        public Node(T data,Node<T> next, Node<T> prev ){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

    }

    public void push(T data){
        if (head == null){
            head=tail=new Node<>(data,null,null );
        }else {
            tail.next = new Node<>(data,null,tail);
            tail = tail.next;
        }
        size++;
    }


    public T pop(){
        if (tail == null) throw new NoSuchElementException("Stack is empty");

        T data = tail.data;

        if (tail == head) { // If there's only one element
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        return data;

    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> trav = head;

            @Override
            public boolean hasNext() {
                return trav != null;
            }

            @Override
            public T next() {
                T data = trav.data;
                trav = trav.next;
                return data;
            }
        };
    }

        public String toString(){
            if(head == null) return "[]";
            StringBuilder sb = new StringBuilder();
             Node<T> trav = head;
             sb.append("[");
             while (trav!=null){
                 sb.append(trav.data);
                 if(trav.next != null)sb.append(",");
                 trav=trav.next;
             }
             sb.append("]");
            return sb.toString();
        }
}
