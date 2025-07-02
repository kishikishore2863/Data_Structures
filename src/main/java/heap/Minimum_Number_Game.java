package heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Minimum_Number_Game {
    public static void main(String[] args) {

    }
    public int[] numberGame(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer> heap = new PriorityQueue<>();

        for(int i=0; i<nums.length; i++){
            heap.add(nums[i]);
        }

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
