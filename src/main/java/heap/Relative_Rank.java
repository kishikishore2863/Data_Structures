package heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Relative_Rank {



    class Pair {
        int value;
        int index;

        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }


    public static void main(String[] args) {
        Relative_Rank r = new Relative_Rank();
       String [] res = r.findRelativeRanks(new int[]{10,3,8,9,4});
        System.out.println(Arrays.toString(res));
    }

    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Pair> heap = new PriorityQueue<>(
                (a, b) -> Integer.compare(b.value, a.value)
        );

        for ( int i=0; i< score.length; i++){
        heap.add(new Pair(score[i], i));
        }

        String[] award = new String[score.length];
        int start=0;
        while (!heap.isEmpty()){
            Pair  top = heap.poll();
            int rank =start+1;
            if(start == 0 ){
               award[top.index] = "Gold Medal";
            }else if(start == 1 ){
                award[top.index] = "Silver Medal";
            } else  if(start == 2 ){
                award[top.index] = "Bronze Medal";
            }else award[top.index]= ""+rank;
            start++;
        }
        return award;
    }
}