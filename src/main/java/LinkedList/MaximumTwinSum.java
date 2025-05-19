package LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MaximumTwinSum {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(5);
        ListNode n2 = new ListNode(4);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(1);

        ListNode head = n1;
        n1.next = n2;
        n2.next =n3;
        n3.next =n4;


       int res = pairSum1(head);
       System.out.println(res);
    }
    public static int pairSum(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }

        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size()-1; i++){
            for(int j=i+1; j<list.size(); j++){
                max = Math.max(max, list.get(i)+list.get(j));
            }
        }

        return max;
    }

    public static int pairSum1(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null&& fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        while(head != slow){
            stack.push(head.val);
            head = head.next;
        }
        System.out.println(stack);
        int max = Integer.MIN_VALUE;
        while(slow!=fast){
            max = Math.max(max, slow.val+stack.peek());
            stack.pop();
            slow = slow.next;
        }
        return max;
    }
}
