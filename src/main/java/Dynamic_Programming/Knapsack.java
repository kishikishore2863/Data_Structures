package Dynamic_Programming;

public class Knapsack {

    public static void main(String[] args) {
        Knapsack knapsack = new Knapsack();
        int[] wt={1,3,4,5};
        int[] price={1,4,5,7};
        int bagW =7;
        int n = 4;
        int recursionResult = knapsack.knapsackSolve(wt,price,bagW,n);
        int topDownResult  = knapsack.topDown(wt,price,bagW);
        System.out.println("recursionResult :"+recursionResult);
        System.out.println("topDownResult :"+topDownResult);
    }

    public int knapsackSolve(int[] wt, int[] price, int bagW, int n){
        if(bagW == 0 || n==0){
            return 0;
        }

        if(wt[n-1]<=bagW){
            return Math.max(price[n-1]+knapsackSolve(wt,price,bagW - wt[n-1],n-1),knapsackSolve(wt,price,bagW,n-1));
        }else {
            return knapsackSolve(wt, price, bagW, n-1);
        }
    }

    public int topDown(int[] wt,int[] price, int bagW ){
        int n = wt.length;
        int w = bagW;
        int [][] t = new int[n+1][w+1];

        for(int i=0; i<n+1; i++){
            for(int j=0; j<n+1; j++){
                if(i==0||j==0) t[i][j]=0;
            }
        }

        for(int i=1; i<n+1; i++){
            for(int j=1; j<w+1; j++){
                if(wt[i-1]<=j){
                    t[i][j] = Math.max(price[i-1] + t[i-1][j-wt[i-1]],
                            t[i-1][j]);
                }else {
                    t[i][j] = t[i-1][j];
                }
            }
        }
        System.out.println("DP Matrix:");
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= w; j++) {
                System.out.print(t[i][j] + "\t");
            }
            System.out.println();
        }


        return t[n][w];
    }
}
