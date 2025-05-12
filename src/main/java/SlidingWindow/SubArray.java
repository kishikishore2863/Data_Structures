package SlidingWindow;

public class SubArray {
    public static void main(String[] args) {
//       int res =numSubarrayProductLessThanK(new int[]{10,5,2,6},100);
//       int res =numSubarrayProductLessThanK(new int[]{1,2,3},0);
//        System.out.println(res);
    }
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int left =0;
        int prod =1;
        int count =0;
        for(int right=0; right<nums.length ; right++){
            prod = prod*nums[right];
            while(prod >= k ){
                prod = prod/nums[left];
                left++;
            }

            count++;

        }

        for(int start=1; start<nums.length; start++){
            if((nums[start]*nums[start])<k){
                count++;
            }
        }
        return count;
    }
}
