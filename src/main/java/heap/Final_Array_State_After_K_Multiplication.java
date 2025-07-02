package heap;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Final_Array_State_After_K_Multiplication {
    public static void main(String[] args) {
        int [] res = getFinalState(new int[]{2,1,3,5,6},5,2);
        System.out.println(Arrays.toString(res));
    }

    public static int[] getFinalState(int[] nums, int k, int multiplier) {
        Queue<Integer> minHeap = new PriorityQueue<>();

        for(int i=0; i<nums.length; i++){
            minHeap.add(nums[i]);
        }
        System.out.println(minHeap);
        for(int i=1; i<=k; i++){
            int min = minHeap.poll();
            System.out.println(min);
            minHeap.add(min*multiplier);
            System.out.println(minHeap);
        }
        System.out.println(minHeap);

        int[] res = new int[nums.length];
        int i=0;
        for(Integer element:minHeap){
            res[i]=element;
            i++;
        }

        return res;
    }
}
