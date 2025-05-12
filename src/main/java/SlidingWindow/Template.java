package SlidingWindow;

public class Template {
    public static void main(String[] args) {
        int[] arr = {1,1,1,3};
        int k = 3;
        System.out.println( slider(arr,k));

    }
    //s = "1101100111"
    static int  slider(int [] arr ,int k){
        int curr =0;
        int left =0;
        int ans  =0;
        for(int right =0; right< arr.length; right++){
            curr = curr+arr[right];
            while(curr>k){
                curr = curr - arr[left];
                left++;
            }
            ans = Math.max(ans,right-left+1);
        }

        return ans;
    }


    static int example(String s,int flip){
        int left =0;
        int flipped =0;
        int max = 0;


        for(int right=0; right<s.length(); right++){
            if(s.charAt(right) == 0){
                flipped++;
            }
            while(flipped>flip){
                left++;
                flipped--;
            }
            max = Math.max(max ,right-left+1);
        }
        return max;

    }


}
