package Recurrsion.CodeCamp;

import Leetcode.ListNode;

public class Rec1 {
    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        ListNode head = one;

        System.out.println(atmAnalogy(head));

    }

    static int atmAnalogy(ListNode head){
        if(head == null){
            return 0;
        }

        int count = atmAnalogy(head.next);
        System.out.println(count);

        return count+1;
    }




}


