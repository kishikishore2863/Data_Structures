package Recurrsion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,2,3,5,7,8};
        sort(arr, arr.length-1,0,Integer.MAX_VALUE);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int [] arr ,int r,int c, int max){
        if(r==0)return ;
        if(c<r){
            if(arr[c]>max){
                max = arr[c];
            }
             sort(arr,r,c+1,max);

        }else{
            int temp =arr[r];
            arr[r]=max;
            arr[c] = temp;
             sort(arr,r-1,0,Integer.MIN_VALUE);
        }
    }
}
