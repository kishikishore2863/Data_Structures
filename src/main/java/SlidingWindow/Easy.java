package SlidingWindow;

public class Easy {
    public static void main(String[] args) {
        double res = findMaxAverage(new int[]{-1},1);
        System.out.println(res);
    }
    public static double findMaxAverage(int[] nums, int k) {
        int left =0;
        int summ =0;
        for(int right=k-1; right<nums.length; right++){
            int start = left;
            int end = right;
            int sum = 0;
            while(start<=end){
                sum = sum + nums[start];
                start++;
            }
            summ = Math.max(sum,summ);
            left++;
        }
        return (double)summ/(double)k;
    }
}
