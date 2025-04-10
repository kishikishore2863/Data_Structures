package LinkedList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DoublyLinkedList {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
//        set.add()
        ListNode2 one  = new ListNode2(1);
        ListNode2 two = new ListNode2(2);
        ListNode2 three = new ListNode2(3);
        ListNode2 four = new ListNode2(4);

        ListNode2 head = one;
        one.next = two;
        one.prev=null;

        two.next = three;
        two.prev=one;

        three.prev=two;
        three.next = four;

        ListNode2 five =new ListNode2(5);
        ListNode2 six = new ListNode2(6);

        addNode(two,six);

        while (head != null ){
            System.out.print(head.val+"->");
            head = head.next;
        }

    }

    static void addNode(ListNode2 node , ListNode2 nodeToAdd ){
        ListNode2 prevNode = node.prev;
        nodeToAdd.next = node;
        node.prev = nodeToAdd;

        if (prevNode != null) {
            nodeToAdd.prev = prevNode;
            prevNode.next = nodeToAdd;
        } else {
            nodeToAdd.prev = null;
            // If inserting at the head, the caller should update the head reference
        }
    }
}

class ListNode2{
    int val;
    ListNode2 next;
    ListNode2 prev;

    ListNode2(int val){
        this.val = val;
    }
}
