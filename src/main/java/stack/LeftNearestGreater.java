package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeftNearestGreater {
    public static void main(String[] args) {
        int [] arr = {100,80,60,70,60,75,85};
        List<Integer> res = greater(arr);
        System.out.println(res);
    }

    public static List<Integer> greater(int [] arr ){
        List<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<arr.length; i++){
            if(stack.isEmpty()){
                list.add(-1);
            }else if(!stack.isEmpty() && arr[i]>stack.peek()){
                while (arr[i]> stack.peek()){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    list.add(-1);
                }else{
                    list.add(stack.peek());
                }
            }else{
                list.add(stack.peek());
            }
            stack.add(arr[i]);
        }
        return list;
    }
}
