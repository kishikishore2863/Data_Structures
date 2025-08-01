package Hashing;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DestinationCity {

    public static void main(String[] args) {
        DestinationCity solution = new DestinationCity();
        List<List<String>> paths = List.of(
                List.of("London", "New York"),
                List.of("New York", "Lima"),
                List.of("Lima", "Sao Paulo")
        );
        String result = solution.destCity(paths);
        System.out.println("Destination city: " + result);
    }

    public String destCity(List<List<String>> paths) {
        Map<String, String> hashMap = new HashMap<>();
        for (List<String> path : paths) {
            hashMap.put(path.get(0), path.get(1));
        }
        System.out.println(hashMap);
        for (String s : hashMap.values()) {
            if (!hashMap.containsKey(s)) {
                return s;
            }
        }

        return null;
    }
}
