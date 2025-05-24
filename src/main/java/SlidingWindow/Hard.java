package SlidingWindow;


public class Hard {

        public static void main(String[] args) {
//        int [] cards = {1,2,3,4,5,6,1};
            int [] cards = {9,7,7,9,7,7,9};
            int res = maxScore(cards,7);
            System.out.println(res);

        }

        public static int maxScore(int[] cardPoints, int k) {
            int sum = 0;
            int n = cardPoints.length;;

            for (int window=n-k; window<n; window++){
                sum = sum+cardPoints[window];
            }

            int left =0;
            int right = n-k;
            int maxScore = sum;
            for (;left<k; right++,left++){
                sum += cardPoints[right];
                sum -= cardPoints[left];
                maxScore = Math.max(maxScore,sum);
            }

            return maxScore;
        }


}
