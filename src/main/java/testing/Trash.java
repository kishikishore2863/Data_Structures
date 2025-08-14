package testing;

import java.util.*;

public class Trash {
    public static void main(String[] args) {
        Trash ob = new Trash();
        List<List<String>> result = ob.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        System.out.println(result);

        System.out.printf("testcase1 input:%s output:%s\n","",ob.largestGoodInteger("6777133339"));
        System.out.printf("testcase2 input:%s output:%s\n","",ob.largestGoodInteger("2300019"));
        System.out.printf("testcase3 input:%s output:%s\n","",ob.largestGoodInteger("42352338"));
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            if (!map.containsKey(sortHelper(str))) {
                map.put(sortHelper(str), new ArrayList<>());
            }
            map.get(sortHelper(str)).add(str);

        }
        result.addAll(map.values());
        return result;

    }

    public String sortHelper(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        return Arrays.toString(ch);
    }

    public String largestGoodInteger(String num) {
        if(num.contains("999")){
            return "999";
        }else if(num.contains("888")){
            return "888";
        }else if(num.contains("777")){
            return "777";
        }else if(num.contains("666")){
            return "666";
        }else if(num.contains("555")){
            return "555";
        }else if(num.contains("444")){
            return "444";
        }else if(num.contains("333")){
            return "333";
        }else if(num.contains("222")){
            return "222";
        }else if(num.contains("111")){
            return "111";
        }else if(num.contains("000")){
            return "000";
        }else {
            return "";
        }
    }
}
