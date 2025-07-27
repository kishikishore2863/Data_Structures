package SlidingWindow.fixedSizeWindow;

import java.util.ArrayList;
import java.util.List;

public class FirstNegInt {
    public static void main(String[] args) {

    }

    static List<Integer> firstNegInt(int arr[], int k) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<=arr.length-k; i++){
            boolean foundNegative = false;
            for(int j=i; j<i+k; j++){
                if( arr[j] < i+k){
                    foundNegative = true;
                    list.add(arr[j]);
                    break;
                }
            }
            if(!foundNegative){
                list.add(0);
            }
        }
        return list;
    }
}
