package testing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaximumUniqueSubarraySum {

    public static void main(String[] args) {
        MaximumUniqueSubarraySum maximumUniqueSubarraySum = new MaximumUniqueSubarraySum();
       int res = maximumUniqueSubarraySum.maxSum(new int[]{1,2,3,4,5});
    }

    Set<List<Integer>> result = new HashSet<>();
//    List<List<Integer>> result = new ArrayList<>();
    public int maxSum(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(Integer i:nums){
            set.add(i);
        }

        List<Integer> input = new ArrayList<>(set);
        List<Integer> output = new ArrayList<>();
        List<Integer> maximumSub = new ArrayList<>();
        subsetArray(input,0,output);
        int max = 0;
//        for (List<Integer> i:result){
//            if()
//        }

        System.out.println(result);
        return -1;
    }

    public void subsetArray(List<Integer> input,int n,List<Integer> output){
        if(n==input.size()){
            result.add(output);
            return;
        }

        int c = input.get(n);
        List<Integer> output1 = new ArrayList<>(output);
        List<Integer> output2 = new ArrayList<>(output);
        output2.add(c);


        subsetArray(input,n+1,output1);
        subsetArray(input,n+1,output2);
     }
}
