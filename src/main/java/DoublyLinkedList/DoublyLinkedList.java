package DoublyLinkedList;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DoublyLinkedList<T> implements Iterable<T> {
    private int size=0;
    private Node<T> head = null;
    private Node<T> tail = null;
    private static class Node<T>{
        private T data;
        private Node<T> prev,next;
        public Node(T data, Node<T> prev,Node<T> next){
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
        public  String toString(){
            return data.toString();
        }
    }

    public void addLast(T data){
        if(tail == null){
            head=tail=new Node(data,null,null);
        }else {
            tail.next = new Node(data,tail,null);
            tail = tail.next;
        }
        size++;
    }


    @Override
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
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

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        Node<T> trav = head;
        while (trav != null) {
            sb.append(trav.data);
            if (trav.next!=null){
                sb.append(",");
            }
            trav = trav.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
