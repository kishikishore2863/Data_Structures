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


        System.out.println("Subsets:");
        generateSubsets(new int[]{1, 2, 3});
        System.out.println("Permutations:");
        generatePermutations(new int[]{1, 2, 3});
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

    public static void generateSubsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrackSubsets(nums, 0, new ArrayList<>(), result);
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }

    private static void backtrackSubsets(int[] nums, int index, List<Integer> path, List<List<Integer>> result) {
        result.add(new ArrayList<>(path));
        for (int i = index; i < nums.length; i++) {
            path.add(nums[i]);
            backtrackSubsets(nums, i + 1, path, result);
            path.remove(path.size() - 1);
        }
    }

    public static void generatePermutations(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrackPermutations(nums, new ArrayList<>(), new boolean[nums.length], result);
        for (List<Integer> perm : result) {
            System.out.println(perm);
        }
    }

    private static void backtrackPermutations(int[] nums, List<Integer> path, boolean[] used, List<List<Integer>> result) {
        if (path.size() == nums.length) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            path.add(nums[i]);
            backtrackPermutations(nums, path, used, result);
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }
}
