package heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElement {
    public static void main(String[] args) {
       int res =  findKthLargest(new int[]{3,2,1,5,6,4},2);

    }

    public static int findKthLargest(int[] nums, int k) {
        Queue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0; i<nums.length; i++){
            minHeap.add(nums[i]);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        System.out.println(minHeap);
        return -1;
    }
}
