package heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class MinimumOperationstoHalveArraySum {
    public static void main(String[] args) {
        MinimumOperationstoHalveArraySum solution = new MinimumOperationstoHalveArraySum();
        int[] nums = {5, 19, 8, 1};
        int result = solution.halveArray(nums);
        System.out.println("Minimum operations to halve array sum: " + result);
    }

    public int halveArray(int[] nums) {
        int count = 0;

        Queue<Double> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        double sum = 0.0;

        for (int i : nums) {
            sum = (double) sum + i;
            maxHeap.add((double) (i));
        }

        double needed = (double) (sum / 2.0);

        while (sum > needed) {
            count++;
            double temp = maxHeap.remove();
            maxHeap.add((double) (temp / 2.0));
            sum = (double) (sum - (temp / 2.0));
        }

        return count;
    }
}
