package Recurrsion.CodeCamp;

import Leetcode.ListNode;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode one =new ListNode(1);
        ListNode two =new ListNode(2);
        ListNode three =new ListNode(3);
        ListNode four =new ListNode(4);
        ListNode five =new ListNode(5);
        ListNode six =new ListNode(6);

        ListNode head = one;
        ListNode head1 = one;
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;

        ListNode.display(head1);
        System.out.println();

       ListNode resultHead =  reverse(head);
       ListNode.display(resultHead);
    }

    public static ListNode reverse(ListNode head){
        if(head == null || head.next == null )return head;
        ListNode p = reverse(head.next);
        System.out.println(head.next.next+"="+head.val);
        head.next.next = head;
        System.out.println(head.next.val+"=null");
        head.next = null;
        return p;
    }
}
