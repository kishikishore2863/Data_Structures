package Algo;

public class Kadane {
    public static void main(String[] args) {
        int [] nums = {-2,-3,4,-1,-2,1,5,-3};
        int maxSubarraySum = kadane(nums);
        System.out.println("Maximum subarray sum is: " + maxSubarraySum);
    }

    // Kadane's Algorithm: Maximum Subarray Sum
    public static int kadane(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
