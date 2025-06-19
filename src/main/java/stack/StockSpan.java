package stack;

import java.util.ArrayList;
import java.util.List;

public class StockSpan {
    public static void main(String[] args) {
        int[] arr = {100,80,60,70,60,75,86};
        List<Integer> res = span(arr);
        System.out.println(res);
    }

    public static List<Integer> span(int[] arr ){
        List<Integer> list = new ArrayList<>();
        for (int i =0; i< arr.length; i++){
            int count =0;
            for(int j=i; j>=0; j--){
                if(arr[j]<=arr[i]){
                    count++;
                }else{
                    break;
                }
            }
            list.add(count);
        }
        return list;
    }
}
