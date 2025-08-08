package heap;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        TopKFrequentElements ob = new TopKFrequentElements();
        int[] nums = {1,1,1,2,2,3};
        int k=2;
        int [] res = ob.topKFrequent(nums,k);
        System.out.println(Arrays.toString(res));
    }

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hashMap = new HashMap<>();

        for(int i:nums){
            hashMap.put(i,hashMap.getOrDefault(i,0)+1);
        }

        Queue<Integer> heap = new PriorityQueue<>(
                (n1,n2)->hashMap.get(n1)-hashMap.get(n2)
        );

        for(Integer key:hashMap.keySet()){
            heap.add(key);
            if(heap.size()>k){
                heap.remove();
            }
        }

        int[] arr = new int[k];
        for(int i=0; i<k; i++){
            arr[i]=heap.remove();
        }

        return arr;

    }
}
