package DoublyLinkedList;

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

    public


}
