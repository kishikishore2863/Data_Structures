package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

//public class StockSpanOptimize {
//    public static void main(String[] args) {
//    int [] arr = {100,80,60,70,60,75,85};
//
//
//    }
//
//    public static List<Integer> span(int [] arr){
//        List<Integer> list = new ArrayList<>();
//        Stack<Map<Integer,Integer>> stack = new Stack<>();
//        for(int i=0; i<arr.length; i++){
//            if(stack.isEmpty()){
//                list.isEmpty()
//            }
//        }
//    }
//
//
//
//
//
//}


class StockSpanner {

    List<Integer> list ;


    public StockSpanner() {
        this.list = new ArrayList<>();
    }

    public int next(int price) {
        int count =0;
        if(!list.isEmpty()){
            for(int j=list.size()-1; j>=0; j--){
                if(list.get(j)<=price){
                    count++;
                }else{
                    break;
                }
            }
        }
        list.add(price);
        return count + 1;

    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
