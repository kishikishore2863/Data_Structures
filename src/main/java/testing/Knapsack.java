package testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Knapsack {
    public static void main(String[] args) {
        Knapsack knapsack = new Knapsack();
//        int [] weights = {1,2,3,4,5};
        int [] weights = {1,3,4,5};
//        int [] prices = {1,10,4,5,7};
        int [] prices = {1,4,5,7};
//        int bagMaxWeight = 7;
        int bagMaxWeight = 7;
//        int n = 5;
        int n = 4;

        int [][] t = new int[n+1][bagMaxWeight+1];
        knapsack.minSet(t,-1,t.length,bagMaxWeight+1);

        int res = knapsack.solve(weights,prices,bagMaxWeight,n,t);
        System.out.println(res);

        knapsack.dpPrint(t);

    }

    public void dpPrint(int[][] t){
        System.out.println("\n🧾 DP Table (Rows = items, Columns = bag weight):");

        System.out.print("     ");
        for (int w = 0; w < t[0].length; w++) {
            System.out.printf("%4d", w);
        }
        System.out.println();

        for (int i = 0; i < t.length; i++) {
            System.out.printf("i=%d ", i);
            for (int j = 0; j < t[0].length; j++) {
                if (t[i][j] == -1)
                    System.out.printf("%4s", "-");
                else
                    System.out.printf("%4d", t[i][j]);
            }
            System.out.println();
        }
    }

    public void minSet(int [][] t, int val ,int n, int bag){
        for(int i=0; i<n; i++){
            for(int j=0; j<bag; j++){
                t[i][j]=val;
            }
        }

    }

    public int solve(int[] weights, int[] prices, int bagMaxWeight, int n,int [][] t){
        if(n==0 || bagMaxWeight == 0)return 0;

        if(t[n][bagMaxWeight] != -1){
            return t[n][bagMaxWeight];
        }

        if(weights[n-1] <= bagMaxWeight){
            int include = prices[n-1]+ solve(weights,prices,bagMaxWeight-weights[n-1],n-1,t);
            int exclude =solve(weights,prices,bagMaxWeight,n-1,t);
            int res = Math.max(include, exclude);
            t[n][bagMaxWeight] = res;
            return res;
        }else{
            int res = solve(weights,prices,bagMaxWeight,n-1,t);
            t[n][bagMaxWeight] = res;
            return res;
        }
    }
}
