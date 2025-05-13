package SinglyLinkedList;

import Leetcode.ListNode;

import java.util.List;

public class OddEvenLinkedList {
    public static void main(String[] args) {
        ListNode one =new ListNode(1);
        ListNode two =new ListNode(2);
        ListNode three =new ListNode(3);
        ListNode four =new ListNode(4);
        ListNode five =new ListNode(5);

        ListNode head = one;
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

//        ListNode node = new ListNode(-1);
//        node.next = odd(head);
//
        ListNode ans = oddEvenList(head);
        while (ans !=null){
            System.out.println(ans.val);
            ans = ans.next;
        }
    }

    static ListNode odd(ListNode head){
        ListNode curr1 = head;
        ListNode curr2 = head;

        ListNode oddList = new ListNode(-1);

        ListNode curr = oddList;
        while(curr1!=null){
            if(curr1.val %2!=0){
                oddList.next =new ListNode(curr1.val);
                oddList=oddList.next;
            }
            curr1 = curr1.next;
        }
        while(curr2!=null){
            if(curr2.val %2==0){
                oddList.next =new ListNode(curr2.val);
                oddList=oddList.next;
            }
            curr2 = curr2.next;
        }

        while (curr!=null){
            System.out.println(curr.val);
            curr = curr.next;
        }

        return oddList.next;
    }

    public static ListNode oddEvenList(ListNode head) {
        ListNode odd = head;
        ListNode even = head.next;

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while(odd !=null  ){
            curr.next = new ListNode(odd.val);
            curr = curr.next;
            odd = (odd.next != null) ? odd.next.next : null;
        }
        System.out.println(curr.val);
        while(even !=null ){
            curr.next = new ListNode(even.val);
            curr = curr.next;
            even = (even.next != null) ? even.next.next : null;
        }

        return dummy.next;
    }

    public static ListNode oddEvenList_328(ListNode head) {
        if(head == null) return null;
        ListNode oddHead = head;
        ListNode evenHead = head.next;

        ListNode even = evenHead;

        while(oddHead !=null && oddHead.next!=null && even != null && even.next !=null){
            oddHead.next = oddHead.next.next;
            oddHead = oddHead.next;
            even.next = even.next.next;
            even = even.next;
        }

        oddHead.next = evenHead;


        return head;
    }

}
