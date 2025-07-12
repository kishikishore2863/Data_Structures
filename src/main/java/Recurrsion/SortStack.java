package Recurrsion;

import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(0);
        stack.push(2);
        System.out.println(stack);
        sort(stack);
        System.out.println(stack);
    }

    public static void sort(Stack<Integer> stack){
        if(stack.size()==1)return;
        int temp = stack.pop();
        sort(stack);
        insert(stack,temp);
    }

    public static void insert(Stack<Integer> stack , int val){
        if(stack.size()==0 || stack.peek()<=val){
            stack.push(val);
            return;
        }
        int last = stack.pop();
        insert(stack,val);
        stack.push(last);
    }
}
