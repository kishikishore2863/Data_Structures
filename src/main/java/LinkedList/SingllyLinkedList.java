package LinkedList;

public class SingllyLinkedList {
    public static void main(String[] args) {
        ListNode1 one = new ListNode1(1);
        ListNode1 two = new ListNode1(2);
        ListNode1 three = new ListNode1(3);


        one.next = two;
        two.next = three;
        ListNode1 head = one;

//        int ans = 0;
//        while(head !=null ){
//            ans += head.val;
//            head = head.next;
//        }
//
//        System.out.println("Sum of List :"+ans);

        ListNode1 four = new ListNode1(4);
        addNode(three,four);
        deleteNode(two);

        while( head != null){
            System.out.print(head.val+"->");
            head = head.next;
        }

    }

    static void addNode(ListNode1 prevNode, ListNode1 nodeToAdd) {
        nodeToAdd.next = prevNode.next;
        prevNode.next = nodeToAdd;
    }

    static void deleteNode(ListNode1 prevNode){
        prevNode.next = prevNode.next.next;
    }




}


 class ListNode1{

    int val;
    ListNode1 next;

    ListNode1(int val){
        this.val = val;
    }

}
