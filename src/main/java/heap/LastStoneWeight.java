package heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class LastStoneWeight {
    public static void main(String[] args) {
        LastStoneWeight lastStoneWeight = new LastStoneWeight();
        int [] arr = {2,7,4,1,8,1};
        int res =lastStoneWeight.lastStoneWeight(arr);
        System.out.println(res);

    }

    public int lastStoneWeight(int[] stones) {
        Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(Integer i:stones){
            maxHeap.add(i);
        }

        while( !(maxHeap.size() <= 1)){
            int x = maxHeap.remove();
            int y = maxHeap.remove();
            if(x != y){
                maxHeap.add(Math.abs(x-y));
            }
        }
        return maxHeap.isEmpty()?0:maxHeap.peek();
    }
}
