package Recurrsion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringRecursion {
    public static void main(String[] args) {
        String str = "baccad";
        System.out.println(q1(str,0,'a',new StringBuilder()));
    }

    public static String q1(String str,int index,char target,StringBuilder sb){
       if(index == str.length()){
           return sb.toString();
       }
       if(str.charAt(index) != target){
           sb.append(str.charAt(index));
       }
       return q1(str,index+1,target,sb);
    }



}

class Subseq{
    public static void main(String[] args) {
        subseq("","abc");
    }

    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));


    }
}

class Question1{
    public static void main(String[] args) {

    }

    static void q1(String p , String up){
        if(up.isEmpty()){
            return ;
        }


    }
}


class Solution {
    public static void main(String[] args) {
       double res = myPow(2.00000,9);
        System.out.println(res);
    }

    public static double myPow(double x, int n) {
        return pow(x,n,1);
    }

    static double pow(double x ,int n,double ans){
        if(n == 0){
            return ans;
        }
        ans =ans * (2* pow(x,n-1,ans));
        return ans;
    }
}


class Solution1 {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
       int ans= s.scoreOfString("hello");
        System.out.println(ans);
    }
    public int scoreOfString(String s) {
        List<Integer> list = new ArrayList<>();
        for(int i=1 ; i<s.length(); i++){
            list.add(Math.abs(s.charAt(i-1)-s.charAt(i)));
            System.out.println(list);
        }
        int ans = 0;
        for(int l:list){
            ans = ans+l;
        }
        return ans;
    }


}

class BasicRecursion{
    static int ans=1;
    public static void main(String[] args) {
//       int res = sumOfN(3);
//        System.out.println(res);
//        int [] arr = {1,2,3,4,5,6,7,8,9};
//
//        int [] out = reverse(arr,0, arr.length-1);
//        System.out.println(Arrays.toString(out));

        System.out.println(palindrome("malayala"));
    }
    public static int sumOfN(int n ){
        if(n==0){
            return ans;
        }
        ans = ans*n;
        return sumOfN(n-1);


    }

    static int[] reverse(int [] arr ,int start, int end){
        if(start == arr.length/2){
            return arr;
        }

        int temp =arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        return reverse(arr,start+1,end-1);

    }

    static boolean palindrome(String str ){
        System.out.println(reversed(str,str.length()-1,""));
       return  str.equals(reversed(str,str.length()-1,""));
    }

    static  String reversed(String str ,int index, String s){
        if(index < 0){
            return s;
        }
        return str.charAt(index)+reversed(str,index-1,s);
    }

}