package Recurrsion;

public class Rec {
    public static void main(String[] args) {
    int res =    fac(4);
        System.out.println(res );
        caller();
    }

    static int fac(int n){
        if(n==0)return 1;
        return n * fac(n - 1);
    }

    public static void caller() {
        int result = fib(0, 1, 10);
        System.out.println("Fibonacci result: " + result);
    }

    public static int fib(int a, int b, int count) {
        if (count == 0) {
            return a;
        }
        int res = a + b;
        System.out.println(res);
        return fib(b, res, count - 1);
    }
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        return (n & (n - 1)) == 0;
    }
}
