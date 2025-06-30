package Hashing;

import java.util.HashMap;
import java.util.Map;

public class Maximum_Number_of_Balloons {
    public static void main(String[] args) {
//       int res = maxNumberOfBalloons("loonbalxballpoon");
       int res = maxNumberOfBalloons("nlaebolko");
        System.out.println(res);
    }

    public static int maxNumberOfBalloons(String text) {
        Map<Character,Integer> store = new HashMap<>();
        String loader = "balon";
        for(int i=0; i<loader.length(); i++){
            store.put(loader.charAt(i),0);
        }

        for (int i = 0; i <text.length() ; i++) {
            if(store.containsKey(text.charAt(i))){
                store.put(text.charAt(i), store.getOrDefault(text.charAt(i),0)+1);
            }

        }
        store.compute('l', (k, l) -> l / 2);
        store.compute('o', (k, o) -> o / 2);

        int min = Integer.MAX_VALUE;
        for(Integer i:store.values()){
            if(i<min){
                min = i;
            }
        }

        return min==Integer.MAX_VALUE?0:min;
    }
}
