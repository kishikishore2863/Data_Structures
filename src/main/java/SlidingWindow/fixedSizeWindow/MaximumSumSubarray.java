package SlidingWindow.fixedSizeWindow;

import java.util.Arrays;

public class MaximumSumSubarray {
    public static void main(String[] args) {
        MaximumSumSubarray max= new MaximumSumSubarray();
        int [] input1 = {100, 200, 300, 400}; int k= 2;
        int res1 = max.maximumSumSubarray(input1,k);

        int [] input2 ={100, 200, 300, 400}; int k2=4;
        int res2 = max.maximumSumSubarray(input2,k2);

        int [] input3 ={100, 200, 300, 400}; int k3=1;
        int res3 = max.maximumSumSubarray(input3,k3);

        System.out.printf("test case input : arr:%s, k:%d  output:%d \n", Arrays.toString(input1),k,res1);
        System.out.printf("test case input : arr:%s, k:%d  output:%d \n", Arrays.toString(input2),k2,res2);
        System.out.printf("test case input : arr:%s, k:%d  output:%d \n", Arrays.toString(input3),k3,res3);
    }

    public int maximumSumSubarray(int[] arr, int k) {
        int sum =0;
        int right;
        int left =0;

        for(right=0; right<k; right++){
            sum = sum + arr[right];
        }

        int maxSum = sum;
        int max = sum;

        for(;right<arr.length; right++){
            maxSum = maxSum + arr[right];
            maxSum = maxSum - arr[left];

            max = Math.max(maxSum,max);
            left++;
        }

        return max;

    }
}
