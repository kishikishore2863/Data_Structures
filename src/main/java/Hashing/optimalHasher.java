package Hashing;

import java.util.ArrayList;
import java.util.List;

public class optimalHasher {

    public static void main(String[] args) {
       List<Integer> res = findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});
        System.out.println(res);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();


            // Mark visited indices
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1; // Convert to 0-based index
            if (nums[index] > 0) {
                nums[index] = -nums[index]; // Mark as visited
            }
        }

            // Find indices that were not visited
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1); // Missing numbers
            }
        }

            return result;

        }
    }
