package Recurrsion;

public class JosephusProblem {
    public static void main(String[] args) {
        int n = 40;
        int k = 7;
        int survivor = josephus(n, k);
        System.out.println("The survivor is  " + (survivor + 1));
    }


    public static int josephus(int n, int k) {
        if (n == 1)
            return 0;

        return (josephus(n - 1, k) + k) % n;
    }

}
