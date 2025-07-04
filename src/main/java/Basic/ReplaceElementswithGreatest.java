package Basic;

import java.util.Arrays;

public class ReplaceElementswithGreatest {
    public static void main(String[] args) {
       int[] res = replaceElements(new int[]{17,18,5,4,6,1});
        System.out.println(Arrays.toString(res));
    }

    public static int[] replaceElements(int[] arr) {
        int[] replaced = new int[arr.length];

        for(int i=0; i<arr.length-1; i++){
            int max = 0;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]>arr[i]){
                    max = Math.max(max,arr[j]);
                    replaced[i]=max;

                }
            }
        }
        replaced[arr.length-1] = -1;
        return replaced;
    }
}
