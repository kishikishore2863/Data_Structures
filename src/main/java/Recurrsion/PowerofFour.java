package Recurrsion;

public class PowerofFour {
    public static void main(String[] args) {
        PowerofFour ob = new PowerofFour();
        System.out.printf("testcase1: input:%d output:%b\n",16,ob.isPowerOfFour(16));
        System.out.printf("testcase2: input:%d output:%b\n",5,ob.isPowerOfFour(5));
        System.out.printf("testcase3: input:%d output:%b\n",1,ob.isPowerOfFour(1));
        System.out.printf("testcase4: input:%d output:%b\n",0,ob.isPowerOfFour(0));
    }

    public boolean isPowerOfFour(int n) {
        return solve(n);
    }

    public boolean solve(int n){
        if( n==1)return true;
        if(n<1) return false;
        if(n%4 != 0)return false;
        return solve(n/4);
    }
}
