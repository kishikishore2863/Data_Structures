package Recurrsion.CodeCamp;

import Leetcode.ListNode;

public class MergeTwoSortedLinkedList {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(5);
        ListNode n3 = new ListNode(13);
        ListNode n4 = new ListNode(14);
        ListNode n5 = new ListNode(550);

        ListNode n1_1 = new ListNode(2);
        ListNode n2_2 = new ListNode(15);
        ListNode n3_3 = new ListNode(130);
        ListNode n4_4 = new ListNode(200);
        ListNode n5_5 = new ListNode(350);

        ListNode a = n1;
        n1.next = n2;
        n2.next=n3;
        n3.next = n4;
        n4.next=n5;

        ListNode b = n1_1;
        n1_1.next = n2_2;
        n2_2.next = n3_3;
        n3_3.next = n4_4;
        n4_4.next = n5_5;



//        ListNode pos = pointers(a,b);
//        ListNode.display(pos);
//
//        System.out.println();

        ListNode res =  merge(a,b);
        ListNode.display(res);
    }

    public static ListNode merge(ListNode a, ListNode b){
        if(a==null)return b;
        if(b==null)return a;

        if(a.val <= b.val){
            a.next = merge(a.next,b);
            return a;
        }else {
            b.next = merge(a,b.next);
            return b;
        }

    }

    public static ListNode pointers(ListNode a ,ListNode b){
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while(a!=null && b!=null){
            if(a.val<=b.val){
                curr.next = a;
                curr=curr.next;
                a=a.next;
            }else{
                curr.next = b;
                curr = curr.next;
                b=b.next;
            }
        }

        if(a==null){
            curr.next=b;
        }else {
            curr.next=a;
        }
        return dummy.next;
    }
}
