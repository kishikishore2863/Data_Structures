package heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class TakeGiftsFromTheRichestPile {
    public static void main(String[] args) {
        int gifts[] = {25,64,9,4,100};
        int k =4;
        long res = pickGifts(gifts,k);
        System.out.println(res);
    }
    public static long pickGifts(int[] gifts, int k) {
        return kthLargest(k,gifts);
    }

    private static Long kthLargest(int k, int[] arr){
        Long sum = 0L;
        Queue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(Integer num:arr){
            minHeap.add(num);
        }

        for (int i = 0; i <k ; i++) {
           int rev = minHeap.poll();
           minHeap.add((int)Math.sqrt((double) rev));
        }
        for (Integer num:minHeap){
            sum = sum+num;
        }
        return sum;
    }
}
