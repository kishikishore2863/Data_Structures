package Recurrsion.Strings;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation784 {
    List<String> result = new ArrayList<>();

    public static void main(String[] args) {
        LetterCasePermutation784 l = new LetterCasePermutation784();
        List<String> res = l.letterCasePermutation("a1b2");
        System.out.println(res);
    }

    public List<String> letterCasePermutation(String s) {
        caseP(s.toLowerCase(), "");
        return result;
    }

    public void caseP(String input, String output) {
        if (input.isEmpty()) {
            result.add(new String(output));
            return;
        }

        char c = input.charAt(0);
        if (c >= 'a' && c <= 'z') {
            char l = (char) (c - 32);
            String output1 = new String(output);
            String output2 = new String(output);
            output1 = output1 + c;
            output2 = output2 + l;

            caseP(input.substring(1), output1);
            caseP(input.substring(1), output2);

        } else {
            input = input.substring(1);
            output = output + c;
            caseP(input, output);
        }

    }
}
