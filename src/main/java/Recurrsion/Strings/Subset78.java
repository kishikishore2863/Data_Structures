package Recurrsion.Strings;

import java.util.ArrayList;
import java.util.List;

public class Subset78 {
    List<List<Integer>> result = new ArrayList<>();

    public static void main(String[] args) {
        Subset78 subset78 = new Subset78();
        List<List<Integer>> res = subset78.subsets(new int[]{1,2});
        System.out.println(res);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> output = new ArrayList<>();
        solve(nums, 0, output);
        return result;
    }

    public void solve(int[] nums, int n, List<Integer> output) {
        if (n == nums.length) {
            result.add(new ArrayList(output));
            return;
        }
        int c = nums[n];
        List<Integer> output1 = new ArrayList<>(output);
        List<Integer> output2 = new ArrayList<>(output);
        output2.add(c);

        solve(nums, n+1, output1);
        solve(nums, n+1, output2);

    }
}
