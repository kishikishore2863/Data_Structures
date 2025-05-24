package LinkedList;

import Leetcode.ListNode;

import java.util.HashSet;
import java.util.Set;


public class RemoveDuplicatesFromSorted {
    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two  = new ListNode(2);
        ListNode two1  = new ListNode(2);
        ListNode two2  = new ListNode(2);
        ListNode three  = new ListNode(3);
        ListNode four  = new ListNode(4);
        ListNode five  = new ListNode(5);
        ListNode five1  = new ListNode(5);

        ListNode head = one;
        one.next = two;
        two.next = two1;
        two1.next = two2;
        two2.next =three;
        three.next = four;
        four.next =five;
        five.next = five1;

        ListNode.display(head);
        System.out.println();
        ListNode res = deleteDuplicates(head);
        ListNode.display(res);

    }

    public static ListNode deleteDuplicates1(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

         ListNode fast = head;
         ListNode slow = dummy;

        while(fast!=null){
              if(fast.next !=null && fast.val == fast.next.val){
                 while (fast.next != null && fast.val == fast.next.val){
                  fast =fast.next;
                 }
                 slow.next = fast.next;

              }else{
                  slow=slow.next;
              }
              fast=fast.next;

        }


        return dummy.next;
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode curr = head;
        ListNode prev = dummy;


        while(curr != null){
            if(curr.next != null && curr.val != curr.next.val){
                while(curr.next != null && curr.val != curr.next.val ){
                    curr = curr.next;
                }
                prev.next = curr.next;

            }else{
                prev = prev.next;
            }
            curr = curr.next;
        }
        return dummy.next;
    }

//   public static int[] deleteDuplicatesInArr(int[] arr){
//        for(int i=0; i<arr.length-1; i++){
//            if(arr[i]!= arr[i+1]){
//
//            }
//        }
//
//   }
}
