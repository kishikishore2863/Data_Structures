package heap;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class SortingUsingHeap {
    public static void main(String[] args) {
        int [] sorted = minHeapSort(new int[]{21,234,5,2,39,});
        System.out.println(Arrays.toString(sorted));
    }

    public static int[] minHeapSort(int [] arr){
        Queue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0; i< arr.length; i++){
            minHeap.add(arr[i]);
        }

        int[] sorted = new int[arr.length];
        int start=0;
        while(!minHeap.isEmpty()){
            sorted[start++] = minHeap.poll();
        }
        return sorted;
    }
}
