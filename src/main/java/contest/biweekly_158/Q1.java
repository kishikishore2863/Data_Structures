package contest.biweekly_158;

import java.util.*;

public class Q1{
    public static void main(String[] args) {
        int [] x = {1,2,1,3,2};
        int [] y = {5,3,4,6,2};

        System.out.println(maxSumDistinctTriplet(x,y));
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
}
