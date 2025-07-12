package Recurrsion;

import java.util.ArrayList;
import java.util.List;

public class RecursionArraySort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(1);
        list.add(96);
        list.add(2);
        sort(list);
        System.out.println(list);

    }

    public static void sort(List<Integer> list){
        if(list.size() == 1)return;

        int temp = list.get(list.size()-1);
        list.remove(list.size()-1);
        sort(list);
        insert(list,temp);
    }

    public static void insert(List<Integer> list, int temp){
        if(list.size() == 0 ||  list.get(list.size()-1)<= temp){
            list.add(temp);
            return;
        }

        int val = list.get(list.size()-1);
        list.remove(list.size()-1);
        insert(list,temp);
        list.add(val);
    }
}
