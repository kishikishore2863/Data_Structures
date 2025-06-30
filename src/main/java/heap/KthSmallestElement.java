package heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthSmallestElement {
    public static void main(String[] args) {
       int res =  kSmallest(3,new int[]{7,10,4,3,20,15});
        System.out.println(res);
    }
    private static int kSmallest(int k, int [] arr ){
        Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<arr.length; i++){
            maxHeap.add(arr[i]);
            if (maxHeap.size()>k){
                maxHeap.poll();
            }
        }
        System.out.println(maxHeap);
        return maxHeap.peek();
    }
}
