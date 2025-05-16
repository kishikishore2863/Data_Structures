package Leetcode;

public class ListNode {
    public int val;

    public ListNode next;
    public ListNode(int val){
        this.val = val;
    }
    public ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }
    public static void display(ListNode head){
//        System.out.println();
        displayPrivate(head);
//        System.out.println();
    }

    private static void displayPrivate(ListNode head){
        if(head == null){
            return;
        }
        System.out.print(head.val);
        display(head.next);
    }
}

