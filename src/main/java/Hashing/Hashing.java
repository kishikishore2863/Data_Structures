package Hashing;

import java.util.HashMap;
import java.util.Map;

public class Hashing {
    public static void main(String[] args) {
//        Map<Character,Integer> map = new HashMap<>();
//        map.
//        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println(firstMissingPositive(new int[]{1,2,0}));
        System.out.println(firstMissingPositive(new int[]{3,4,-1,1}));
        System.out.println(firstMissingPositive(new int[]{7,8,9,11,12}));
    }


    public static boolean checkIfPangram(String sentence) {
        int[] hash = new int[26];
        for(int i=0; i<sentence.length(); i++){
            hash[ sentence.charAt(i)-'a'] = 1;
        }

        for(int i=0; i<hash.length; i++){
            if(hash[i]!=1){
                return false;
            }
        }
        return true;
    }

    public static int firstMissingPositive(int[] nums) {
        Map<Integer,Integer> hash = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            hash.put(nums[i],0);
        }
        int start =1;
        int n=Integer.MAX_VALUE;
        while(start<n){
            if(!hash.containsKey(start)){
                return start;
            }
            start++;
        }
        return 1;
    }
}
