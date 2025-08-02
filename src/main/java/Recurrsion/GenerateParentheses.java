package Recurrsion;

import java.util.List;
import java.util.ArrayList;

public class GenerateParentheses {
    public static void main(String[] args) {
        GenerateParentheses gp = new GenerateParentheses();
        System.out.println("n = 3: " + gp.generateParenthesis(3));
    }

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        int open = n;
        int close = n;
        String output = new String();
        solve(open, close, output, list);
        return list;
    }

    public void solve(int open, int close, String op, List<String> list) {
        if (open == 0 && close == 0) {
            list.add(op);
            return;
        }

        if (open != 0) {
            String op1 = new String(op);
            op1 = op + "(";
            solve(open - 1, close, op1, list);
        }

        if (close > open) {
            String op1 = new String(op);
            op1 = op1 + ")";
            solve(open, close - 1, op1, list);
        }

    }
}
