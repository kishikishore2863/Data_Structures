package Hashing;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthSorterArray {
    public static void main(String[] args) {
        List<Integer> sort = kSort(new int[]{6,5,3,1,8,9,2},3);
        System.out.println(sort);
    }

    public static List<Integer> kSort(int[] arr,int k ){
        List<Integer> list= new ArrayList<>();
        Queue<Integer> minHeap = new PriorityQueue<>();
        for(int i =0; i< arr.length; i++){
            minHeap.add(arr[i]);
            if(minHeap.size()>k){
                list.add(minHeap.poll());
            }
        }
        return list;
    }
}
