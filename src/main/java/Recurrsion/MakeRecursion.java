package Recurrsion;

import java.util.ArrayList;
import java.util.List;

public class MakeRecursion {
    List<Integer> resList = new ArrayList<>();

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

       MakeRecursion m = new MakeRecursion();
       m.outerLoop(list,0);
        System.out.println(m.resList);


    }

    public void outerLoop(List<Integer> list, int i){
        if(i==list.size())return;
        innerLoop(list,i,0,1);
        outerLoop(list,i+1);
    }

    public void innerLoop(List<Integer> list, int i,int j,int prod){
        if(j==list.size()){
            resList.add(prod);
            return;
        }
        if(i!=j){
            prod=prod*list.get(j);
        }
        innerLoop(list,i,j+1,prod);
    }
}











//input : 1,2,3,4
//output: 24,12,8,4