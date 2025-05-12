package SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class Template2 {
    public static void main(String[] args) {
//        int res = problem1(new int[]{3,1,2,7,4,2,1,1,5},8);
//        System.out.println(res);

//        int res2 = problem2("1101100111");
//        System.out.println(res2);
//        char[] arr = {'0','1'};
//        System.out.println(arr[1]=='0');

//       List<List<Integer>> res = numberOfSubArray(new int[]{1,2,3});
//       for (List<Integer> sub:res ){
//           System.out.print(sub);
//       }
        List<List<Integer>> res1 = numberOfSubArray1(new int[]{1,2,3});
        System.out.println(res1);

    }

    //problem1
//    nums = {1,2,3,5,6,7} and integer k
//    find the length of longest subarray sum <= k
    static int problem1(int [] arr , int k){
        int longestLength=Integer.MIN_VALUE;
        int left =0;
        int curr =0;
        for(int right=0; right< arr.length; right++ ){
           curr = curr+arr[right];
           while(curr>k){
              curr = curr-arr[left];
              left++;
           }
           longestLength =Math.max(longestLength,right-left+1);
        }

        return longestLength;
    }

    static int problem2(String s){
        int maxLength =0;
        char[] arr = s.toCharArray();
        int index = 0;

        int left =0;
        for(int right=0; right<arr.length; right++){
            if(arr[right] == '0'){
                index++;
            }
            while(index>1){
                if(arr[left] == '0'){
                    index--;
                }
                left++;
            }
            maxLength = Math.max(maxLength, right-left+1);
        }


       return maxLength;
    }


//    problem3

    static List<List<Integer>> numberOfSubArray(int [] arr){
        int left =0;
        List<List<Integer>> allSubArray = new ArrayList<>();
         for(int right=0; right<=arr.length; right++){
            List<Integer> list  = new ArrayList<>();
            while(right == arr.length && left!= arr.length){
                left++;
                right = left;
            }
            if(right> arr.length)return allSubArray;
            int end = right;
            for(int start = left; start<=end; start++){
                list.add(arr[start]);
            }
            allSubArray.add(list);
             System.out.println(allSubArray);
        }
         return allSubArray;

    }

    static List<List<Integer>> numberOfSubArray1(int[] arr) {
        List<List<Integer>> allSubArrays = new ArrayList<>();

        for (int start = 0; start < arr.length; start++) {
            List<Integer> currentSubArray = new ArrayList<>();
            for (int end = start; end < arr.length; end++) {
                currentSubArray.add(arr[end]);
                allSubArrays.add(new ArrayList<>(currentSubArray));
            }
        }

        return allSubArrays;
    }


}
