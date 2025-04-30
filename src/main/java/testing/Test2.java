package testing;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(makeGood("abBAcC"));
    }

//    public static int[] twoSum(int[] nums, int target) {
//        Map<Integer,Integer> map = new HashMap<>();
//        for(int i=0; i<nums.length; i++){
//            int value =target - nums[i];
//            if(map.containsKey(value)){
//                return new int[]{map.get(value),i};
//            }
//            map.put(nums[i],i);
//        }
//        System.out.println(map);
//    return new int[]{0,0};
//    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(!stack.isEmpty() && stack.peek()==s.charAt(i)){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }

    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(!stack.isEmpty() && stack.peek()==s.charAt(i)){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : stack) {
            sb.append(ch);
        }
        return sb.toString();
    }



    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> s_stack = new Stack<>();
        Stack<Character> t_stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(!s_stack.isEmpty() && s.charAt(i)=='#'){
                s_stack.pop();
            }
            if(s.charAt(i)!='#'){
                s_stack.push(s.charAt(i));
            }
        }
        for(int i=0; i<t.length(); i++){
            if(!t_stack.isEmpty() && t.charAt(i)=='#'){
                t_stack.pop();
            }
            if(t.charAt(i)!='#'){
                t_stack.push(t.charAt(i));
            }
        }
        System.out.println("s :"+s_stack);
        System.out.println("t :"+t_stack);
        return s_stack.toString().equals(t_stack.toString());
    }

    public  static boolean isPalindrome(int x) {
        if(x<0)return false;
        int clone =x;
        int x1 =0;
        while(x>0){
            int lastDigit = x%10;
            x1 = x1*10+lastDigit;
            x=x/10;
        }
        System.out.println(clone);
        System.out.println(x1);
        return clone==x1;
    }
    public static String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && Math.abs(stack.peek() - c) == 32) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }
}
