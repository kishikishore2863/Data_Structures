package Recurrsion.CodeCamp;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
       int result = sumOfN(3);
        System.out.println(result);
    }

    public static int sumOfN(int n){
        if(n==0){
            return 0;
        }
        int sum = sumOfN(n-1)+n ;
        System.out.println(sum);
        return sum ;
    }
}
