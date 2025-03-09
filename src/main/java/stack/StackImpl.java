package stack;



import java.util.Iterator;

public class StackImpl<T> implements Iterable<T> {
    private int size =0;
    private Node<T> head = null;
    private Node<T> tail = null;





    private static class Node<T>{
        private T data;
        private Node<T> next ;
        private Node<T> prev;

        public Node(T data , Node<T> next , Node<T> prev){
            this.data = data;
            this.next= next;
            this.prev = prev;
        }
    }






    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
           private StackImpl.Node<T> trav = head;
            @Override
            public boolean hasNext() {
                return trav !=null;
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
        if(size == 0) return "";
        StringBuilder sb = new StringBuilder();
        Node<T> trav = head;
        sb.append("[");
        while(trav == null){
            sb.append(trav.data);
            trav = trav.next;
        }
        return sb.toString();
    }





}
