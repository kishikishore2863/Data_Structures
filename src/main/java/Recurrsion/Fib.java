package Recurrsion;

public class Fib {
    public static void main(String[] args) {
        System.out.println(fibno(9));
        System.out.println(reverseString("kishi",5,""));
    }

    static int fibno(int n){
        if(n <=1){
            return n;
        }
        return fibno(n-2) + fibno(n-1);
    }

    static String reverseString(String str ,int n ,String out){
        if(n==0){
            return out;
        }
        return reverseString(str,n-1,out+str.charAt(n-1));
    }



}
