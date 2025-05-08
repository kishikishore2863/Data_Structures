package PlayGround;

import Leetcode.ListNode;



public class Runner1 {
    public static void main(String[] args) {
       ListNode one = new ListNode(1);
       ListNode two = new ListNode(2);
       ListNode three = new ListNode(3);
       ListNode four = new ListNode(4);
       ListNode five = new ListNode(5);

       ListNode head = one;
       one.next = two;
       two.next = three;
       three.next = four;
       four.next = five;


      ListNode res=  removeElement(head,4);
      while (res!=null){
          System.out.print(res.val+"->");
          res=res.next;
      }


    }

    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
          ListNode next = curr.next;
          curr.next = prev;
          prev=curr;
          curr = next;
        }
        return prev;
    }


    public static ListNode removeElement(ListNode head , int val){
        ListNode curr = head;
        while(curr!=null && curr.next!=null ){
            ListNode nextNode = curr.next;
            if(nextNode.val == val){
                curr.next = nextNode.next;
            }
            curr = curr.next;
        }
        return head;
    }

}


