package stack;

import java.util.Stack;

public class DailyTemperatures {

    public static void main(String[] args) {
        DailyTemperatures solution = new DailyTemperatures();

        int[][] inputs = {
                {73, 74, 75, 71, 69, 72, 76, 73},
                {30, 40, 50, 60},
                {30, 60, 90},
                {90, 80, 70, 60}
        };
        int[][] expecteds = {
                {1, 1, 4, 2, 1, 1, 0, 0},
                {1, 1, 1, 0},
                {1, 1, 0},
                {0, 0, 0, 0}
        };

        for (int i = 0; i < inputs.length; i++) {
            System.out.println("Input:    " + java.util.Arrays.toString(inputs[i]));
            System.out.println("Output:   " + java.util.Arrays.toString(solution.dailyTemperatures(inputs[i])));
            System.out.println("Expected: " + java.util.Arrays.toString(expecteds[i]));
            System.out.println("Output (Optimal):   " + java.util.Arrays.toString(solution.dailyTemperaturesOptimal(inputs[i])));
            System.out.println("Expected: " + java.util.Arrays.toString(expecteds[i]));
            System.out.println();
        }
    }
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        int n = temperatures.length-1;
        for(int i=n; i>=0; i--){

            if(stack.isEmpty()){
                res[i] =0;
            }

            if(!stack.isEmpty() && stack.peek()>temperatures[i]){
                res[i] = 1;
            }

            if(!stack.isEmpty() && stack.peek()<temperatures[i]){
                int count =0;
                while(!stack.isEmpty() && stack.peek()<temperatures[i]){
                    count++;
                    stack.pop();
                }

                if(stack.isEmpty()){
                    res[i] = 0;
                }else{
                    res[i] = count;
                }
            }
            stack.push(temperatures[i]);
        }

        return res;
    }

    public int[] dailyTemperaturesOptimal(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        int n = temperatures.length - 1;
        for (int i = n; i >= 0; i--) {

            while (!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                res[i] = 0;
            } else {
                res[i] = stack.peek() - i;
            }

            stack.push(i);
        }

        return res;
    }
}
