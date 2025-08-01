package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class FrequencySort {
    public static void main(String[] args) {
        FrequencySort ob = new FrequencySort();
        String s1 = "tree";
        System.out.printf("testcase1 input:%s output:%s \n",s1,ob.frequencySort(s1));
        String s2 = "cccaaa";
        System.out.printf("testcase2 input:%s output:%s \n",s2,ob.frequencySort(s2));
        String s3 = "Aabb";
        System.out.printf("testcase3 input:%s output:%s \n",s3,ob.frequencySort(s3));

    }

    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        Queue<Map.Entry<Character, Integer>> queue = new PriorityQueue<>(
                (a, b) -> b.getValue() - a.getValue()
        );

        queue.addAll(map.entrySet());


        StringBuilder result = new StringBuilder();
        while (!queue.isEmpty()) {
            Map.Entry<Character, Integer> entry = queue.poll();
            result.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }

        return result.toString();
    }

}
