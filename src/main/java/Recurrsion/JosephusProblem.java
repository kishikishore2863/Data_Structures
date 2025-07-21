package Recurrsion;

public class JosephusProblem {
    public static void main(String[] args) {
        int n = 40;
        int k = 7;
        int josephus = josephus(n, k);
        System.out.println(" survivor  " + josephus);
    }

    public static int josephus(int n, int k) {
        if (n == 1)
            return 1;
        else
            return (josephus(n - 1, k) + k - 1) % n + 1;
    }
}

