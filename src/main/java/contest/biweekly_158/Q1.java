package contest.biweekly_158;

import java.util.*;

public class Q1{
    public static void main(String[] args) {
        int [] x = {1,2,1,3,2};
        int [] y = {5,3,4,6,2};

//        System.out.println(maxSumDistinctTriplet(x,y));
        int number =-123;
        int res= reverse(number);
        System.out.println(res);
        System.out.println(Integer.MAX_VALUE);
        int res1 =2147483647;int com =1534236469;
        if(com<res1) System.out.println(0);


    }

    public static int maxSumDistinctTriplet(int[] x, int[] y) {
        Map<Integer, Integer> bestY = new HashMap<>();

        for (int i = 0; i < x.length; i++) {
            bestY.put(x[i], Math.max(bestY.getOrDefault(x[i], 0), y[i]));
        }

        if (bestY.size() < 3) return -1;

        List<Integer> topY = new ArrayList<>(bestY.values());
        topY.sort(Collections.reverseOrder());


        return topY.get(0) + topY.get(1) + topY.get(2);

    }

    public static int reverse(int x) {
        boolean isNegative=false;
        if(x<0){
            isNegative = true;
        }
        int reversed = 0;
        x= Math.abs(x);
        while(x>0){
            int lastDigit = x%10;
            reversed =reversed*10+lastDigit;
            x = x/10;
        }
        return isNegative?-reversed:reversed;

    }
}
