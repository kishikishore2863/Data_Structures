package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4};
       List<Integer> res =  nextGreaterLeft(arr);
        System.out.println(res);
    }

    public static List<Integer> nextGreaterLeft(int[] nums){
        List<Integer> out = new ArrayList<>();
        int n = nums.length;
        for(int i=n-1; i>=1; i--){
            boolean found =false;
            for(int j=i-1; j>=0; j--){
                if(nums[j]>nums[i]){
                    out.add(nums[j]);
                    found = true;
                    break;
                }
            }
            if(!found) out.add(-1);
        }
        out.add(-1);
        Collections.reverse(out);
        return out;
    }

//    public static List<Integer> nextGreaterLeftOptimized(int[] nums){
//        List<Integer> out = new ArrayList<>();
//        Stack<Integer> stack = new Stack<>();
//        for()
//    }

}
