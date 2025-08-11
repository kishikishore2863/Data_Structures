package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        WordPattern ob = new WordPattern();
        boolean res = ob.wordPattern("abba","dog cat cat dog");
        System.out.println(res);
    }

    public boolean wordPattern(String pattern, String s) {

        Map<Character, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) != ' ') {
                sb.append(s.charAt(j));
            } else {
                list.add(sb.toString());
                sb= new StringBuilder();
            }
            if(j == s.length()-1){
                list.add(sb.toString());
            }

        }
        System.out.println(list);
        for (int i = 0; i < pattern.length(); i++) {
            System.out.println(map);
            if (map.containsKey(pattern.charAt(i))) {
                String value = map.get(pattern.charAt(i));
                if (!(value.equals(list.get(i)))) return false;
            }
            map.put(pattern.charAt(i), list.get(i));
        }



        return true;


    }
}
