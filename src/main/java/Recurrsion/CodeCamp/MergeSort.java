package Recurrsion.CodeCamp;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] data = {-1,-5,5,90,-3,12};
        sort(data,0, data.length-1);
        System.out.println(Arrays.toString(data));


    }

    static void sort(int[] arr, int start, int end){
        if(start<end) {
            int mid = (start + end)  / 2;
            sort(arr, start, mid);
            sort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }
    public static void merge(int [] arr ,int start,int mid,int end){
        int [] temp = new int [end-start+1];

        int i=start, j = mid+1,k=0;
        while (i<=mid && j<=end){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
                k++;
            }else{
                temp[k]=arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
           temp[k] = arr[i];
           k++;
           i++;
        }
        while(j<=end){
           temp[k]=arr[j];
           k++;
           j++;
        }
        for(i=start; i<=end; i++){
            arr[i]=temp[i-start];
        }
    }
}
