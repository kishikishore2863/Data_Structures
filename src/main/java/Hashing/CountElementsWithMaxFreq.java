package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountElementsWithMaxFreq {
    public static void main(String[] args) {
        CountElementsWithMaxFreq ob = new CountElementsWithMaxFreq();
        int[] nums = {1,2,2,3,1,4};
        int[] nums2 = {1,2,3,4,5};
        System.out.printf("testCase 1 arr:%s output:%d \n", Arrays.toString(nums),ob.maxFrequencyElements(nums));
        System.out.printf("testCase 2 arr:%s output:%d \n", Arrays.toString(nums2),ob.maxFrequencyElements(nums2));
    }

    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int max = 0;
        for (Integer i : map.values()) {
            if (i > max) {
                max = i;
            }
        }

        int count = 0;
        for (int freq : map.values()) {
            if (freq == max) {
                count += freq;
            }
        }

        return count;
    }
}
