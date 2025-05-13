package SinglyLinkedList;

import Leetcode.ListNode;

import java.util.List;

public class MiddleLinkedList {
    public static void main(String[] args) {
        ListNode one  = new ListNode(1);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode seven = new ListNode(7);
        ListNode one1 = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode six = new ListNode(6);

        ListNode head = one;
        one.next = three;
        three.next = four;
        four.next = seven;
        seven.next = one1;
        one1.next = two;
        two.next = six;

        ListNode middle = deleteMiddle(head);

        while(middle != null){
            System.out.println(middle.val);
            middle = middle.next;
        }
    }



    public static ListNode deleteMiddle(ListNode head){
      ListNode curr = head;
      ListNode middle = middleFinder(head);

      while (curr.next != middle){
          curr = curr.next;
      }
      curr.next = middle.next;
      return head;
    }

    static ListNode middleFinder(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
