package inter;

import java.util.*;

public class Goodperson {
    public static void main(String[] args) {
//       int res =  goodPerson("aabbc","aaaccbb");
//        System.out.println(res);
       int res2 =  goodPerson("aabbjfd","aaabbbjkg");
        System.out.println(res2);

    }

    private static int goodPerson(String s1,String s2){
        Map<Character,Integer> s1Hash = new HashMap<>();
        Map<Character,Integer> s2Hash = new HashMap<>();

        for(int i=0; i<s1.length(); i++){
            s1Hash.put(s1.charAt(i), s1Hash.getOrDefault(s1.charAt(i),0)+1);
        }

        for(int i=0; i<s2.length(); i++){
            s2Hash.put(s2.charAt(i),s2Hash.getOrDefault(s2.charAt(i),0)+1);
        }

//        2forms1Hash
//        for(int c: s1Hash.keySet()){
//            if(s1Hash.get(c)==2 ){
//
//            }
//        }

        System.out.println(s1Hash);
        System.out.println(s2Hash);

        Set<Character> set = new HashSet<>();
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();

        for(Character c: s1Hash.keySet()){
            if(s1Hash.get(c) == 2){
              list1.add(c);
            }
        }

        for(Character c: s2Hash.keySet()){
            if(s2Hash.get(c) == 3){
                list2.add(c);
            }
        }

//        System.out.println(set);
//        System.out.println("list1"+list1);
//        System.out.println("list2"+list2);

        set.addAll(list1);

        List<Character> res = new ArrayList<>();
        for(Character c:list2){
            if(set.contains(c)){
               res.add(c);
            }
        }
//        System.out.println(res);


        return res.size();

    }
}
