package SlidingWindow;

public class Minimum_Size_Subarray_Sum {
    public static void main(String[] args) {
        int [] nums = {2,3,1,2,4,3};
        int target = 7;
       int res = minSubArrayLen(target,nums);
        System.out.println(res);
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int left =0;
        int curr =0;
        int min=Integer.MAX_VALUE;
        for(int right =0; right<nums.length; right++){
            curr += nums[right];

            while(curr>=target){
                min =  Math.min(min,right-left+1);
                curr -= nums[left];
                left++;
            }
        }
        return min;
    }
}
