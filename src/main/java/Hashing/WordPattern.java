package Hashing;

import java.util.*;

public class WordPattern {
    public static void main(String[] args) {
        WordPattern ob = new WordPattern();
        boolean res = ob.wordPattern("abba", "dog cat cat dog");
        System.out.println(res);
    }

    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String> charToWord = new HashMap<>();
        Set<String> seenWords = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = words[i];

            if (charToWord.containsKey(c)) {
                if (!charToWord.get(c).equals(w)) {
                    return false;
                }
            } else {
                if (seenWords.contains(w)) {
                    return false;
                }
                charToWord.put(c, w);
                seenWords.add(w);
            }
        }
        return true;
    }
}
