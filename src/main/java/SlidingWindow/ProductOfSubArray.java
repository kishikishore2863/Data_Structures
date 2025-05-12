package SlidingWindow;

public class ProductOfSubArray {
    public static void main(String[] args) {
        looper();
    }
//    10,5,2,6
//    5,2,6
//    2,6
//    6

    static void looper(){
        int [] arr = {10,5,2,6};
        for(int i=0; i< arr.length; i++){
            for(int j=i; j< arr.length; j++){
                System.out.print(arr[j]);
            }
            System.out.println();
        }
    }


}
