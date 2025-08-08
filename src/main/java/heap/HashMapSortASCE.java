package heap;

import javax.print.attribute.HashPrintJobAttributeSet;
import java.security.Key;
import java.util.*;

public class HashMapSortASCE {
    public static void main(String[] args) {
        HashMapSortASCE ob = new HashMapSortASCE();
        ob.sort();
    }

    public void sort(){
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,3);
        map.put(2,2);
        map.put(3,1);
        Queue<Integer> queue = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        queue.addAll(map.keySet());

        List<Integer> sortedKeys = new ArrayList<>();
        while (!queue.isEmpty()){
            sortedKeys.add(queue.remove());
        }

        System.out.println("Sorted keys by value: " + sortedKeys);
    }
}
