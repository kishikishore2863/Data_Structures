package LinkedList;

import Leetcode.ListNode;

public class GoodNodes {
    public static void main(String[] args) {
        ListNode one  = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);

        ListNode head = one;
        one.next = two;
        two.next = three;
        three.next = four;

        ListNode res =  swapPairs(head);
        ListNode.display(res);

    }

    public static ListNode swapPairs(ListNode head) {

        ListNode prev =new  ListNode(-1);
        ListNode curr = head;

        goodNodes(prev,curr);
        return prev.next;

    }

    public static void goodNodes(ListNode prev, ListNode curr){
        if(curr == null && curr.next == null){
            return;
        }
        ListNode nextNode =curr.next;
        curr.next = prev;
        prev.next = nextNode;
        goodNodes(nextNode, nextNode.next);
    }
}
