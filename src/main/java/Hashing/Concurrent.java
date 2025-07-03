package Hashing;

import java.util.HashMap;
import java.util.Map;

public class Concurrent {
    public static void main(String[] args) {
      Map<Character,Integer> map =   count("javajava");
        System.out.println(map);
    }

    public static Map<Character, Integer> count(String str){
        Map<Character,Integer> hash = new HashMap<>();
        for(int i=0; i<str.length(); i++){
                hash.put(str.charAt(i),hash.getOrDefault(str.charAt(i),0)+1);
        }
        return hash;
    }
}
