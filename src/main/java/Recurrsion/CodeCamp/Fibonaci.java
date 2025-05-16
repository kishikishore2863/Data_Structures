package Recurrsion.CodeCamp;

public class Fibonaci {
    public static void main(String[] args) {
      int res =  fib(7);
        System.out.println(res);
    }

    static int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
