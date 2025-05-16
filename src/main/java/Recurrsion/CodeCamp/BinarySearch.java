package Recurrsion.CodeCamp;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {1,2,34,4,7,90};
       int res = search(arr,0, arr.length-1,100 );
        System.out.println(res);
    }

    public static int search(int [] arr, int start, int end , int target){
        if(start>end){
            return -1;
        }
        int mid = start+(end-start)/2;
        if(arr[mid] == target){
            return mid;
        }else if(arr[mid] < target ){
            return search(arr,start,mid-1,target);
        }else{
            return search(arr,mid+1,end,target);
        }

    }
}
