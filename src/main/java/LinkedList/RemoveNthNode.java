package LinkedList;

import Leetcode.ListNode;

public class RemoveNthNode {
    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two  = new ListNode(2);
        ListNode three  = new ListNode(3);
        ListNode four  = new ListNode(4);
        ListNode five  = new ListNode(5);

        ListNode head = one;
        one.next = two;
        two.next =three;
        three.next = four;
        four.next =five;

        ListNode res = removeNthFromEnd(head,2);
        while (res!=null){
            System.out.print(res.val+"->");
            res=res.next;
        }

    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        for(int i=0; i<=n; i++){
            fast = fast.next;
        }

        while(fast != null){
            fast=fast.next;
            slow=slow.next;
        }

        slow.next =slow.next.next;
        return dummy.next;
    }
}
