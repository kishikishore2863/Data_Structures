package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
//        int [] arr = {4,5,0,-2,-3,1};
//        int res = s.subarraysDivByK(arr,5);
//        System.out.println(res);

       int res =s.lengthOfLongestSubstring("abcabcbb");
        System.out.println(res);

    }
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum =0;
        int count =0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            System.out.println(map);
            if(map.containsKey(sum%k)){
                count +=map.get(sum%k);
            }
            map.put(sum%k,map.getOrDefault(sum%k,0)+1);
        }
        return count;
    }


    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int max=0;
        int left =0;
        for(int right=0; right<s.length(); right++){
            if(!map.containsKey(s.charAt(right))){
                map.put(s.charAt(right),0);
            }else {
                System.out.println("start");
                while (left <= right) {
                    map.remove((s.charAt(left)));
                    map.put(s.charAt(right),0);
                    left++;
                }
            }
            max = Math.max(max,(right-left)+1);

        }
        return max;
    }
}
