package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {

    }

    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();

        for(int i=0; i<nums1.length; i++){
            map1.put(nums1[i],map1.getOrDefault(nums1[i],0)+1);
        }

        for(int i=0; i<nums2.length; i++){
            map2.put(nums2[i],map2.getOrDefault(nums2[i],0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums1.length; i++){
            if(map1.containsKey(nums1[i]) && map2.containsKey(nums1[i])) {
                int one = map1.get(nums1[i]);
                int two = map2.get(nums1[i]);
                int min = Math.min(one, two);
                list.add(min);
            }
        }

        int[] res = new int[list.size()];
        for (int i=0; i<list.size(); i++){
            res[i]= list.get(i);
        }

        return res;
    }
}
