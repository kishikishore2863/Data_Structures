package Recurrsion;

public class Q1 {
    public static void main(String[] args) {
//     q1(5);
        System.out.println(sumOfDigits(1342,0));
    }

    public static void q1(int n){
        if(n==0)return;
        System.out.print(n);
        q1(n-1);
    }

    public static int  sumOfDigits(int number,int sum){
        if(number==0){
            return sum;
        }
        sum = sum+(number%10);
        return sumOfDigits(number/10,sum);
    }
}
