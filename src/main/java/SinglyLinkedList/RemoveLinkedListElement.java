package SinglyLinkedList;

import Leetcode.ListNode;

public class RemoveLinkedListElement {
    public static void main(String[] args) {

        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode six = new ListNode(6);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        ListNode six2 = new ListNode(6);

        ListNode  head = one;
        one.next = two;
        two.next = six;
        six.next = three;
        three.next = four;
        four.next = five;
        five.next = six2;

      ListNode dummy =  removeElements(head,6);

        while(dummy.next!=null){
            System.out.println(dummy.val);
            dummy = dummy.next;
        }



    }
    public static ListNode removeElements(ListNode head, int val) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        while(prev.next!=null){
            if(prev.next.val == val){
                prev.next = prev.next.next;
            }else{
                prev = prev.next;
            }

        }



        return dummy.next;
    }
}
