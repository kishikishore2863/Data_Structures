package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Start {


    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);


        one.next = two;
        two.next = three;
        ListNode head = one;



    }

    void addNode(ListNode node, ListNode nodeToAdd) {
        ListNode prevNode = node.prev;
        nodeToAdd.next = node;
        nodeToAdd.prev = prevNode;
        prevNode.next = nodeToAdd;
        node.prev = nodeToAdd;
    }

    void deleteNode(ListNode node) {
        ListNode prevNode = node.prev;
        ListNode nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode prev;
    ListNode (int val) {
        this.val = val;
    }
}

