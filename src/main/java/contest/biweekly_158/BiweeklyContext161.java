package contest.biweekly_158;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BiweeklyContext161 {
    Boolean[] memo = new Boolean[100000];

    public static void main(String[] args) {
        BiweeklyContext161 test = new BiweeklyContext161();
        long res = test.splitArray(new int[]{-1, 5, 7});
        System.out.println(res);
    }



    public long splitArray(int[] nums) {

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (isPrime(i)) {
                a.add(nums[i]);
            } else {
                b.add(nums[i]);
            }
        }

        long sumA = 0;
        long sumB = 0;

        for (Integer i : a) {
            sumA += i;
        }

        for (Integer i : b) {
            sumB += i;
        }

        return Math.abs(sumA - sumB);
    }

    public boolean isPrime(int n) {
        if (n < 2) return false;
        if (memo[n] != null) return memo[n];

        boolean initial =true;

        for (int i = 2; i*i<=n; i++) {
            if (n % i == 0) {
                initial = false;
                break;
            }
        }

        memo[n] = initial;
        return initial;
    }
}