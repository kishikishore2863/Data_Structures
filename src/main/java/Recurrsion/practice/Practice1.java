package Recurrsion.practice;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
//        print1toN(5);
//        printNto1(5);
//        System.out.println( sumOfN(5));
//        int[] arr = {1, 2, 3, 4, 5};
//        System.out.println(isSorted(arr, 0));  // true
//
//        int[] arr2 = {5, 3, 2, 4};
//        System.out.println(isSorted(arr2, 0));  // false

//        int[] arr = {1, 2, 3, 4, 5};
//        System.out.println(sumArray(arr, 0));  // 15

//        int[] arr = {1, 5, 3, 9, 2};
//        System.out.println(findMax(arr, 0,0));  // 9

//        String s = "abcde";
//        reverseString(s,0);

        int [] people = {3,2,2,1};
        System.out.println(numRescueBoats(people,3));
    }

    public static void print1toN(int n){
        if(n==0)return;
        print1toN(n-1);
        System.out.println(n);
    }

    public static void printNto1(int n){
        if (n==0)return;
        System.out.println(n);
        printNto1(n-1);
    }

    public static int sumOfN(int n){
        if(n==0)return 0;
        return  sumOfN(n-1)+n;
    }

    public static boolean isSorted(int[] arr, int index){
        if(index == arr.length-2)return true;

        if(arr[index]<=arr[index+1]){
           return isSorted(arr,index+1);
        }else{
            return false;
        }
    }

    public static int sumArray(int[] arr, int index){
        if(index == arr.length)return 0;
        return sumArray(arr,index+1)+arr[index];
    }

    public static int findMax(int[] arr, int index ,int track){
        if(index == arr.length)return track;

         track = Math.max(arr[index],track);
        return findMax(arr, index+1, track);
    }

    public static void reverseString(String s, int index){
        if(index == s.length())return;
        reverseString(s,index+1);
        System.out.print(s.charAt(index));
    }

    public static int numRescueBoats(int[] people, int limit) {
        int start =0;
        int end =people.length-1;
        int boat=0;

        Arrays.sort(people);

        while(start<=end) {
            if(people[start] == limit){
                boat++;
                start++;
            }else if(people[end] == limit){
                boat++;
                end--;
            }else if(people[start]+people[end] <= limit){
                boat++;
                start++;
                end--;
            }else{
                boat++;
                end--;
            }
        }
        return boat;
    }
}
