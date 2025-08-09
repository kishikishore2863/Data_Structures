package Recurrsion;

public class Pow {
    public static void main(String[] args) {
        Pow ob = new Pow();
        double res =ob.myPow(2.0,10);
        System.out.println(res);
        double x = 2.10000; int n = 3;
        double res2 =ob.myPow(x,n);
        System.out.println(res2);
    }

    public double myPow(double x, int n) {
        return solve(x,n);
    }

    public double solve(double x,int n){
        if(n==1){
            return x;
        }

        return solve(x,n-1)*x;
    }
}
