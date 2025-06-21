package Recurrsion.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

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

//        int [] people = {3,2,2,1};
//        System.out.println(numRescueBoats(people,3));

//        int [] skill = {1,1,2,3};
//        System.out.println(dividePlayers(skill));

        String[] event1 ={"01:15","02:00"};
        String[] event2 ={"02:00","03:00"};
       boolean res = haveConflict(event1,event2);
        System.out.println(res);
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

    public static long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        List<List<Integer>> container = new ArrayList<>();
        int start =0;
        int end =skill.length-1;
        while(start<=end){
            List<Integer> store = new ArrayList<>();
            store.add(skill[start]);
            store.add(skill[end]);
            container.add(store);
            start++;
            end--;
        }
        System.out.println(container);

        List<Integer> productOfTeam = new ArrayList<>();
        List<Integer> sumOfTeam = new ArrayList<>();
        for(List<Integer> team:container){
            int prod =1;
            int sum = 0;
            for(int i=0; i<team.size(); i++){
                prod = prod * team.get(i);
                sum = sum + team.get(i);
            }
            sumOfTeam.add(sum);
            productOfTeam.add(prod);
        }
        int comp =sumOfTeam.get(0);
        for(Integer s:sumOfTeam){
            if(comp != s){
                return -1;
            }
        }

        System.out.println(productOfTeam);
        long sum =0;
       for(Integer i:productOfTeam){
           sum = sum+i;
       }
       return sum;

    }

    public boolean haveConflict1(String[] event1, String[] event2) {
        int event1int= 0;
        int event2int=0;

        for(int i=0; i<event1[1].length(); i++){
            if(event1[1].charAt(i)>='0' && event1[1].charAt(i)<='9'){
                event1int = event1int*10+event1[1].charAt(i);
            }
        }

        for(int i=0; i<event2[0].length(); i++){
            char event2ref = event2[0].charAt(i);
            if(event2ref>='0' && event2ref<='9'){
                event2int = event2int*10+event2ref;
            }
        }
        System.out.println(event1int);
        System.out.println(event2int);

        if(event2int>event1int){
            return true;
        }
        return false;
    }

    public static boolean haveConflict(String[] event1, String[] event2) {
        int event1Start = toMinutes(event1[0]);
        int event1End = toMinutes(event1[1]);
        int event2Start = toMinutes(event2[0]);
        int event2End = toMinutes(event2[1]);

        return !(event1End < event2Start || event2End < event1Start);
    }

    private static int toMinutes(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }
}
