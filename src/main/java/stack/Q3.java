package stack;

import java.util.Arrays;
import java.util.Stack;

public class Q3 {
    public static void main(String[] args) {
        int[] nums = {4,5,2,10,8};
        int[] res = nearestLeftSmallerOptimized(nums);
        System.out.println(Arrays.toString(res));

    }

    public static int[] nearestLeftSmaller(int[] nums){
        int[] res = new int[nums.length];

        int n = nums.length;
        for(int i=0; i<n; i++){
            int smaller =-1;
            for(int j=i-1; j>=0; j--){
                if(nums[i]>nums[j]){
                    smaller = nums[j];
                    break;
                }
            }
            res[i] = smaller;
        }
        return res;
    }

    public static int[] nearestLeftSmallerOptimized(int[] nums){
        int[] res= new int[nums.length];
        Stack<Integer> stack = new Stack<>();

        int n = nums.length;
        for(int i=0; i<n; i++){
            if(stack.isEmpty()){
                res[i] = -1;
            } else if (stack.peek()<nums[i]) {
                res[i] = stack.peek();
            } else if (stack.peek()>nums[i]) {
                while (!stack.isEmpty() && stack.peek()>nums[i]){
                    stack.pop();
                }
                if (stack.isEmpty()){
                    res[i] = -1;
                }else {
                    res[i] = stack.peek();
                }
            }
            stack.push(nums[i]);
        }
        return res;
    }



}
