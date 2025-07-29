package Hashing;

import java.util.*;

public class UniqueOccurrences {
    public static void main(String[] args) {
        UniqueOccurrences ob = new UniqueOccurrences();
        int[] arr1 ={1,2,2,1,1,3};
        int[] arr2 ={1,2};
        int[] arr3 ={-3,0,1,-3,1,1,1,-3,10,0};
        System.out.printf("testcase 1 input arr :%s output:%b \n",Arrays.toString(arr1),ob.uniqueOccurrences(arr1));
        System.out.printf("testcase 2 input arr :%s output:%b \n",Arrays.toString(arr2),ob.uniqueOccurrences(arr2));
        System.out.printf("testcase 3 input arr :%s output:%b \n",Arrays.toString(arr3),ob.uniqueOccurrences(arr3));
    }

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        List<Integer> list = new ArrayList<>();
        list.addAll(map.values());

        Set<Integer> set = new HashSet<>();
        for(Integer i:list){
            if(!set.contains(i)){
                set.add(i);
            }else{
                return false;
            }
        }

        return true;
    }
}
