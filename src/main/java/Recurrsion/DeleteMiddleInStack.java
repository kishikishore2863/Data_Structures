package Recurrsion;

import java.util.Stack;

public class DeleteMiddleInStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        int mid = stack.size()/2 +1;
        dealer(stack,mid);
        System.out.println(stack);
    }

    public static void dealer(Stack<Integer> stack, int k){
        if(k==1){
            stack.pop();
            return;
        }
        int temp = stack.pop();
        dealer(stack,k-1);
        stack.push(temp);
    }
}
