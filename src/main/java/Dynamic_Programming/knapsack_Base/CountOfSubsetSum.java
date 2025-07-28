package Dynamic_Programming.knapsack_Base;

public class CountOfSubsetSum {
    public static void main(String[] args) {
        CountOfSubsetSum c = new CountOfSubsetSum();
        int[] arr = {2, 3, 5, 6, 8, 10};
        int sum = 10;
        int n = arr.length;

        int count = c.solve(arr, n, sum);
        System.out.println("Number of subsets with sum " + sum + ": " + count);
    }

    public int  solve(int[] arr,int n, int sum){
        if(sum == 0  )return 1;
        if(n==0) return 0;

        if(arr[n-1]<= sum ){
            return solve(arr,n-1,sum-arr[n-1])+solve(arr,n-1,sum);

        }else{
           return solve(arr,n-1, sum);
        }

    }
}
