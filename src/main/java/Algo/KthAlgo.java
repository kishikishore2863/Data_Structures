package Algo;

import java.util.PriorityQueue;

public class KthAlgo {
    public static void main(String[] args) {
        KthAlgo algo = new KthAlgo();
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println("Kth smallest element is: " + algo.findKthSmallest(arr, k));
    }

    public int findKthSmallest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.add(num);
        }

        int kthSmallest = -1;
        for (int i = 0; i < k; i++) {
            kthSmallest = minHeap.poll();
        }

        return kthSmallest;
    }


}
