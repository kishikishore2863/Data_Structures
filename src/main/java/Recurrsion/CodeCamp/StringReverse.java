package Recurrsion.CodeCamp;

public class StringReverse {
    public static void main(String[] args) {
      String s =   reverseString("the simple engineer");
      System.out.println(s);
    }
    public static   String reverseString(String s){
        return reverse(s,s.length(),"");
    }

    static String reverse(String process,int n,String s){
        if(n==0){
            return s;
        }
        return reverse(process,n-1,s+process.charAt(n-1));
    }
}
