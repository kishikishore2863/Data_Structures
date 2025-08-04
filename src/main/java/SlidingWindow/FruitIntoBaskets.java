package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBaskets {
    public static void main(String[] args) {
        FruitIntoBaskets ob = new FruitIntoBaskets();
        int[] fruits = new int[]{3,3,3,1,2,1,1,2,3,3,4};
        int res = ob.totalFruit(fruits);
        System.out.println(res);
    }

    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0, max = 0;

        for (int right = 0; right < fruits.length; right++) {
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            while (map.size() > 2) {
                map.put(fruits[left], map.get(fruits[left]) - 1);
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }
                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
