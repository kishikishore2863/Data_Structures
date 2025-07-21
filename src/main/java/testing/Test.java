package testing;

import Leetcode.ListNode;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
//        test.print1toN(10);
//        test.printNto1(10);
        System.out.println(test.fib(10));
        System.out.println(test.factorial(5));
        System.out.println(test.sumOfNatural(5));

    }

    public void print1toN(int n){
        if (n==0)return;
        print1toN(n-1);
        System.out.println(n);
    }

    public void printNto1(int n){
        if(n==0)return;
        System.out.println(n);
        printNto1(n-1);
    }

    public int fib(int n){
        if(n==0)return 0;
        if(n==1)return 1;

        return fib(n-1)+fib(n-2);
    }

    public int factorial(int n){
        if(n==0)return 1;

        int prev =factorial(n-1);
        return prev*n;
    }

    public int sumOfNatural(int n){
        if(n==1)return 1;

        int prev = sumOfNatural(n-1);
        return prev+n;
    }

    public boolean isPalindrome(String s){
        String reversed = palindromeReverse(s, 0, "");
        return s.equals(reversed);
    }

    private String palindromeReverse(String s, int n, String newS){
        if(n == s.length()){
            return newS;
        }
        newS = s.charAt(n) + newS;
        return palindromeReverse(s, n+1, newS);
    }
}
