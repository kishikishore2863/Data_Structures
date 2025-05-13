package SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class ProductOfSubArray {
    public static void main(String[] args) {
//        looper();
        int [] arr = {11,5,2,6};
//        int [] arr = {1,2,3};
        int res = numSubarrayProductLessThanK1(arr,100);
        System.out.println(res);

    }
//    10,5,2,6
//    5,2,6
//    2,6
//    6

//    static void looper(){
//        int [] arr = {10,5,2,6};
//        for(int i=0; i< arr.length; i++){
//            for(int j=i; j< arr.length; j++){
//                System.out.print(arr[j]);
//            }
//            System.out.println();
//        }
//    }

    static int numSubarrayProductLessThanK(int [] nums,int k){
        List<List<Integer>> allSubs = new ArrayList<>();

        for(int i = 0; i<nums.length; i++){
            List<Integer> list = new ArrayList<>();
            for(int j=i; j<nums.length; j++){
                list.add(nums[j]);
                allSubs.add(list);
            }
        }

        System.out.println(allSubs);
        return -1;
    }


    static int numSubarrayProductLessThanK1(int [] nums,int k){
        int ans = 0;
       int left =0;
       int curr = 1;
       for(int right =0; right<nums.length; right++){
           curr = curr*nums[right];
           while(curr>=k){
               curr = curr/nums[left];
               left++;
           }
           ans += right - left + 1;

       }
       return ans;
    }





}
