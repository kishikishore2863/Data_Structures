package SlidingWindow;

import java.util.*;

public class LongestNiceSubstring {
    public static void main(String[] args) {
        LongestNiceSubstring lg = new LongestNiceSubstring();
         String res1 =lg.longestNiceSubstring("YazaAay");
        String res2 =lg.longestNiceSubstring("Bb");
        String res3 =lg.longestNiceSubstring("c");
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);


    }

    public String longestNiceSubstring(String s) {
        Set<Character> set = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c>='A'&&c<='Z'){
                set.add(c);
                set.add((char)(c+32));
            }
        }
        List<String> list = new ArrayList<>();

        int left=0;
        StringBuilder sb = new StringBuilder();
        for(int right=0; right<s.length(); right++){
            char c = s.charAt(right);
            sb.append(c);

            if(!set.contains(c)){
                while(!sb.isEmpty()){
                    char leftChar = s.charAt(left);
                    if((leftChar>= 'A' && leftChar<='Z') && (set.contains(leftChar))){
                        set.remove(Character.toLowerCase(leftChar));
                        set.remove(Character.toUpperCase(leftChar));
                    }
                    sb.deleteCharAt(sb.length()-1);
                    left++;
                }
            }

            list.add(sb.toString());

        }
        String maxStr = "";
        for (String str : list) {
            if (str.length() > maxStr.length()) {
                maxStr = str;
            }
        }
        return maxStr;
    }
}
