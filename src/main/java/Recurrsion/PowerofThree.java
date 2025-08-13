package Recurrsion;

public class PowerofThree {
    public static void main(String[] args) {
        PowerofThree ob = new PowerofThree();
        System.out.printf("testcase:1 input:%d output:%b\n",27,ob.isPowerOfThree(27));
        System.out.printf("testcase:2 input:%d output:%b\n",0,ob.isPowerOfThree(0));
        System.out.printf("testcase:3 input:%d output:%b\n",-1,ob.isPowerOfThree(-1));

    }

    public boolean isPowerOfThree(int n) {
        return helper(n);
    }

    public boolean helper(int n){
        if(n==1)return true;
        if(n<1)return false;
        if(n%3 != 0)return false;
        return isPowerOfThree(n/3);
    }
}
