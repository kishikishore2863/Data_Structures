package heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class HeapPlayGround {
    public static void main(String[] args) {
        Queue<Integer> heap = new PriorityQueue<>();
        heap.add(7);
        heap.add(10);
        heap.add(4);
        heap.add(3);
        heap.add(20);
        heap.add(15);
        System.out.println(heap);
        int unknow = heap.poll();
        System.out.println(unknow);

    }

    public static List<Integer> kthLargestElement(int [] arr,int k){
        List<Integer> list = new ArrayList<>();
        Queue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0; i< arr.length; i++){
            minHeap.add(arr[i]);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        for(Integer n:minHeap){
            list.add(n);
        }
        return list;
    }

    public static void printer(){

        for(int i=0; i<6; i++){
            char c = 'A';
            for(int j=0; j<6-i; j++){
                System.out.print(c++);
            }
            System.out.println();
        }
    }

    public int[] numberGame(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer> heap = new PriorityQueue<>();

        while(!heap.isEmpty()){
            int alice = heap.poll();
            int bob = heap.poll();
            list.add(bob);
            list.add(alice);
        }

        int[] arr = new int[nums.length];
        int start=0;

        for(Integer e:list){
            arr[start]=e;
            start++;
        }

        return arr;
    }

}
