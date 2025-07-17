package Recurrsion.Strings;

import java.util.*;

public class SubsetsII_90 {

        Set<List<Integer>> set = new LinkedHashSet<>();

        public List<List<Integer>> subsetsWithDup(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> output = new ArrayList<>();
            solve(nums,0,output);

            for(List<Integer> list:set){
                result.add(list);
            }

            return result;
        }

        public void solve(int[] nums, int n, List<Integer> output){
            if(n == nums.length){
                Collections.sort(output);
                set.add(output);
                return;
            }
            int c = nums[n];
            List<Integer> output1 = new ArrayList<>(output);
            List<Integer> output2 = new ArrayList<>(output);
            output2.add(c);

            solve(nums,n+1,output1);
            solve(nums,n+1,output2);
        }

}
