package Hashing;

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements {
    public static void main(String[] args) {
        SumOfUniqueElements ob = new SumOfUniqueElements();
        int[] nums = {1,2,3,2};
        int result = ob.sumOfUnique(nums);
        System.out.println(result);
    }

    public int sumOfUnique(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int count =0;
        for(Integer key:map.keySet()){
            if(map.get(key)==1){
                count = count+key;
            }
        }
        return count;
    }
}
