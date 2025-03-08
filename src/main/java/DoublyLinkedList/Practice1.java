package DoublyLinkedList;

import java.util.Iterator;

public class Practice1<T> implements Iterable<T>{

    private int size =0;
    private Node<T> head=null;
    private Node<T> tail=null;



    private static class Node<T>{
        private T data;
        private Node<T> next;
        private Node<T> prev;

        public Node(T data, Node<T> next , Node<T> prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

    }

    public void addLast(T data){
        if(head == null){
            head=tail = new Node<T>(data,null,null);
        }else{
            tail.next=new Node<T>(data,null,tail);
            tail = tail.next;
        }
        size++;
    }

    public void addFirst(T data){
        if(head == null){
            head = tail = new Node<T>(data,null,null);
        }else{
            head.prev = new Node<T>(data,head,null);
            head = head.prev;
        }
        size++;

    }


    public boolean hasEmpty(){
        return size !=0;
    }


    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            private Node<T> trav =head;
            @Override
            public boolean hasNext() {
                return trav!=null;
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
        if(head == null) return "";
        StringBuilder sb = new StringBuilder();
         Node<T> trav = head;
        sb.append("[");
        while (trav != null){
            sb.append(trav.data);
            if(trav.next!=null)sb.append(",");
            trav = trav.next;
        }
        sb.append("]");
        return sb.toString();
    }






}
