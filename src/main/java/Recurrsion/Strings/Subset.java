package Recurrsion.Strings;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    List<String> list = new ArrayList<>();


    public static void main(String[] args) {
        Subset subset = new Subset();
        subset.solve("ab","");
        System.out.println(subset.list);
    }

    public  void solve(String input,String output){
        if(input.isEmpty()){
            list.add(output);
            return;
        }
        char c = input.charAt(0);
        String output1 = output;
        String output2 = output+c;
        solve(input.substring(1),output1);
        solve(input.substring(1),output2);

    }
}
