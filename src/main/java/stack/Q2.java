package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q2 {
    public static void main(String[] args) {
        int[] nums = {1,3,2,4};
        List<Integer> res=  nextLeftGraterOptimize(nums);
        System.out.println(res);
    }

    public static List<Integer> nextLeftGrater(int[] arr){
        List<Integer> list = new ArrayList<>();

        int n = arr.length;
        for(int i=0; i<n; i++){
            int greater =-1;
            for(int j=i-1; j>=0; j--){
                if(arr[i]<arr[j]){
                    greater = arr[j];
                    break;
                }
            }
            list.add(greater);
        }

        return list;
    }

    public static List<Integer> nextLeftGraterOptimize(int[] arr){
        List<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        int n = arr.length;
        for(int i=0; i<n; i++){
            if(stack.isEmpty()){
                list.add(-1);
            }else if(stack.peek()>arr[i]){
                list.add(stack.peek());
            }else if(stack.peek()<arr[i]){
                while(!stack.isEmpty() && stack.peek()<arr[i]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    list.add(-1);
                }else {
                    list.add(stack.peek());
                }
            }
            stack.add(arr[i]);
        }
        return list;
    }
}
