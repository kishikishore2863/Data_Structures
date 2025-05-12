package PlayGround;

import Leetcode.ListNode;

import java.util.Arrays;


public class Runner1 {
    public static void main(String[] args) {
        Runner1 run = new Runner1();


    }

}


class Solution {

    public static void main(String[] args) {
        int [] nums = {-7,-3,2,3,11};
       int [] res =  sortedSquares(nums);
        System.out.println(Arrays.toString(res));
    }

    public static int[] sortedSquares(int[] nums) {
        int start =0;
        int end = nums.length-1;
        int numsEnd = nums.length-1;
        int[] res = new int[nums.length];

        while(start<=end){
            int squareOfStart = nums[start]*nums[start];
            int squareOfEnd = nums[end]*nums[end];
            if(squareOfStart < squareOfEnd  ) {
                res[numsEnd] = squareOfEnd;
                end--;
            }else{
                res[numsEnd]=squareOfStart;
                start++;
            }
            numsEnd--;

        }
        return res;

    }
}

