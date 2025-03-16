package LeetCode;

class LeetCode2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode ptr = result;
        int carry=0;
        while( l1!=null || l2!=null){
            int sum = 0+carry;
            if(l1!=null){
                sum+=l1.value;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.value;
                l2=l2.next;
            }
            carry=sum/10;
            sum=sum%10;

        }
    }
}