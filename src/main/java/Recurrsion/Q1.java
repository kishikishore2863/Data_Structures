package Recurrsion;

import java.util.ArrayList;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
//     q1(5);
//        System.out.println(sumOfDigits(32,0));r
//        System.out.println(productOfDigits(222,1));
//        List<Integer> list = new ArrayList<>();
//        int [] arr = new int[]{1,2,3,4,5,5,5,6};
//        List<Integer> res =duplicate(arr,0,5,list);
//        System.out.println(list);
        pattern1(4,0);
    }

    public static void q1(int n){
        if(n==0)return;
        System.out.print(n);
        q1(n-1);
    }

    public static int  sumOfDigits(int number,int sum){
        if(number==0){
            return sum;
        }
        sum = sum+(number%10);
        return sumOfDigits(number/10,sum);
    }

    public static int productOfDigits(int number, int prod){
        if(number == 0) return prod;
        prod = prod * (number%10);
        return productOfDigits(number/10, prod);
    }

    public static List<Integer> duplicate(int [] arr , int  index , int target , List<Integer> list){
        if(index == arr.length-1){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return duplicate(arr,index+1,target,list);
    }


//    ****
//    ***
//    **
//    *

    public static void pattern1(int r, int c) {
        if(r==0){
            return;
        }
        if(c<r){
            pattern1(r,c+1);
            System.out.print("*");

        }else {
            pattern1(r-1,0);
            System.out.println();
        }
    }




}


//class Solution {
//
//    public static void main(String[] args) {
//       int res = reverse(123);
//        System.out.println(res);
//    }
//    public static int reverse(int x) {
//        boolean isNegative = x < 0;
//        return rev(x,0);
//    }
//
//    public static int rev(int number , int newNumber){
//        if(number == 0) return newNumber;
//        newNumber = newNumber*10+ (number%10);
//        return rev(number/10,newNumber);
//    }
//
//
//}
