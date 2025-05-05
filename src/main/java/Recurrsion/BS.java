package Recurrsion;

public class BS {
    public static void main(String[] args) {
        BS bs = new BS();
        int[] arr = {1,2,3,4,5,6};
        System.out.println(bs.binary(arr,0,arr.length-1,6));
    }

    public int binary(int[] arr,int start, int end, int target ){
        if(start>end)return -1;

        int mid = start+(end - start)/2;

        if(arr[mid] == target){
            return mid;
        }

        if(target<arr[mid]){
            return binary(arr,start,mid-1,target);
        }
        return binary(arr,mid+1,end,target);
    }
}
