package Recurrsion.Strings;

import Leetcode.ListNode;

import java.util.ArrayList;
import java.util.List;

public class StringPattern1 {
    public static void main(String[] args) {
//       String res = process("","kishiaaa");
//        System.out.println(res);

//        String res1 = skipString("","apple iphone 12 mini","apple ");
//        System.out.println(res1);

        List<String> list = new ArrayList<>();
        sub("","abc",list);
        System.out.println(list);
    }

    static String process(String p, String up){
        if(up.isEmpty()){
            return p;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            return process(p,up.substring(1));
        }else{
            return process(p+ch,up.substring(1));
        }

    }

    static String skipString(String p , String up, String str){
        if(up.isEmpty()){
            return p;
        }

        if(up.startsWith(str)){
            return skipString(p, up.substring(str.length()),str);
        }else{
            return skipString(p+up.charAt(0),up.substring(1),str);
        }

    }


    static void sub(String p,String up , List<String> list){
        if(up.isEmpty()){
            list.add(p) ;
            return ;

        }
          sub(p+up.charAt(0),up.substring(1),list);
          sub(p,up.substring(1),list);

    }
}


class Solution {
    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        ListNode six = new ListNode(6);

        ListNode list1 = one;
        one.next = two;
        two.next = three;

        ListNode list2 = four;
        four.next = five;
        five.next = six;

       ListNode head = mergeTwoLists(list1,list2);

       while(head!=null){
           System.out.print(head.val+"->");
           head = head.next;
       }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy  = new ListNode(0);
        ListNode head = dummy;

        while(list1 != null && list2!=null){
            if(list1.val <= list2.val){
                head.next = list1;
                list1 = list1.next;
            }else{
                head.next = list2;
                list2 = list2.next;
            }
            head=head.next;
        }

        if(list1 == null){
            head.next = list2;
        }else{
            head.next = list1;
        }

        return dummy.next;
    }




}


class Solution2 {
    public static void main(String[] args) {
        ListNode two = new ListNode(2);
        ListNode four = new ListNode(4);
        ListNode six = new ListNode(6);
        ListNode eight = new ListNode(8);

        ListNode head = two;
        two.next = four;
        four.next = six;
        six.next = eight;



       ListNode res = reorderList(head);
       while(res!=null){
           System.out.println(res.val);
           res = res.next;
       }



    }
    public static ListNode reorderList(ListNode head) {
        ListNode temp = head;
        ListNode reversed = reverse(temp);
        ListNode normal = head;

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;



        while(normal != null ){
            if(normal.val == reversed.val){
                curr.next = normal;
                break;
            }else {
                curr.next = normal;
                curr = curr.next;
                normal = normal.next;
                curr.next = reversed;
                reversed = reversed.next;
                curr = curr.next;
            }

        }
        return dummy.next;


    }

    static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}
