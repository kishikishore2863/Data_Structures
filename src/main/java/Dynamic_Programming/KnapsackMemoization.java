package Dynamic_Programming;

import java.util.Arrays;
import java.util.Scanner;

public class KnapsackMemoization {
//    public static void main(String[] args) {
//        int [] weight = new int[]{1,3,4,5};
//        int [] value = new int[]{1,4,5,7};
//        int w = 7;
//
//        int[][] t = new int[weight.length + 1][w + 1];
//
//        minSet(t, t.length, w + 1, -1);
//        for (int[] row : t) {
//            System.out.println(Arrays.toString(row));
//        }
//        System.out.println("Max profit: " + knapsack(weight, value, w, weight.length, t));
//
//    }

    public static int knapsack(int[] wt, int[] val, int w, int n, int[][] t){
        if(n==0 || w==0) return  0;

        if (t[n][w] != -1) return t[n][w];

        if(wt[n-1]<=w){
            return t[n][w] = Math.max(
                val[n-1] + knapsack(wt,val,w-wt[n-1],n-1, t),
                knapsack(wt,val,w,n-1, t)
            );
        } else {
            return t[n][w] = knapsack(wt,val,w,n-1, t);
        }
    }

    public static void minSet(int[][] t, int rows, int cols, int fill) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                t[i][j] = fill;
            }
        }
    }

    public static void main(String[] args) {

//        for (int i=0; i<10; i++){
//            System.out.println(i+"%4="+i%4);
//        }
//        System.out.println((int)Character.MAX_VALUE);
//        System.out.println((int)Character.MIN_VALUE);


        System.out.println(Byte.MIN_VALUE);
        byte b = 011;
    }
}
