package Dynamic_Programming.knapsack_Base;

import java.util.ArrayList;
import java.util.List;

public class SubsetSum {
    public static void main(String[] args) {
//        boolean res = isSubsetSum(new int[]{3,34,4,12,5,2},9);
//        boolean res = isSubsetSum(new int[]{3, 34, 4, 12, 5, 2},30);
//        boolean res = isSubsetSum(new int[]{1, 2, 3},6);
        boolean res = isSubsetSum(new int[]{6,6,6,3,8},16);
        System.out.println(res);
    }

   static List<List<Integer>> result = new ArrayList<>();
    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        List<Integer> list = new ArrayList<>();
        subset(arr,0,list);

        for(List<Integer> li:result){
            int count =0;
            for(Integer i:li){
                count = count+i;

            }
            if(count == sum)return true;
        }
        return false;

    }

    public static void subset(int[] input,int n, List<Integer> output){
        if(n == input.length){
             result.add(output);
             return;
        }

        int c = input[n];
        List<Integer> output1 = new ArrayList<>(output);
        List<Integer> output2 = new ArrayList<>(output);
        output2.add(c);

        subset(input,n+1,output1);
        subset(input,n+1,output2);

    }
}
