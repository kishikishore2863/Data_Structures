package stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack1<Integer> stack1 = new Stack1<Integer>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        System.out.println(stack1);
        stack1.pop();
        System.out.println(stack1);
    }
}
