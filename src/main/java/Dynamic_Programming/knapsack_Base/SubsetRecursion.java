package Dynamic_Programming.knapsack_Base;

public class SubsetRecursion {
    public static void main(String[] args) {
          SubsetRecursion subsetRecursion = new SubsetRecursion();
         int [] arr = new int[]{1, 2, 3};
         int sum = 6;
         int n = 3;

         boolean res = subsetRecursion.solve(arr,n,sum);
        System.out.println(res);

    }


    public boolean solve(int[] arr,int n, int sum ){
        if(sum == 0  )return true;
        if(n==0) return false;

        if(arr[n-1] <=sum){
            return solve(arr,n-1,sum)||solve(arr,n-1,sum-arr[n-1]);
        }else{
            return solve(arr,n-1,sum);
        }

    }
}
