package heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class RemoveStonestoMinimizetheTotal {

    public static void main(String[] args) {
        RemoveStonestoMinimizetheTotal solution = new RemoveStonestoMinimizetheTotal();

        int[] piles1 = {5, 4, 9};
        int k1 = 2;
        System.out.println("Test 1: " + solution.minStoneSum(piles1, k1));

        int[] piles2 = {4, 3, 6, 7};
        int k2 = 3;
        System.out.println("Test 2: " + solution.minStoneSum(piles2, k2));

        int[] piles3 = {1, 1, 1, 1};
        int k3 = 4;
        System.out.println("Test 3: " + solution.minStoneSum(piles3, k3));

        int[] piles4 = {10};
        int k4 = 5;
        System.out.println("Test 4: " + solution.minStoneSum(piles4, k4));
    }

    public int minStoneSum(int[] piles, int k) {
        Queue<Integer> maxHeap = new PriorityQueue<>((a, b)->Integer.compare(b,a));

        int sum = 0;
        for(Integer i:piles){
            sum = sum+i;
            maxHeap.add(i);
        }

        int count =0;
//        while(count!=k && !maxHeap.isEmpty()){
//            count++;
//            int temp =maxHeap.remove();
//            sum = sum - temp/2;
//
//            if((temp/2) > 0){
//                maxHeap.add(temp/2);
//            }
//
//        }

        while(count!=k && !maxHeap.isEmpty()){
            count++;
            int temp = maxHeap.poll();
            int reduced = temp / 2;
            int remaining = temp - reduced;
            sum -= reduced;
            maxHeap.add(remaining);

        }

        return sum;
    }
}
