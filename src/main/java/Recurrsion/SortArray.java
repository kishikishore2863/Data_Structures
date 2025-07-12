package Recurrsion;

import java.util.ArrayList;
import java.util.List;

public class SortArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(0);
        list.add(2);
        sort(list);
        System.out.println(list);
    }

    public static void sort(List<Integer> list){
        if(list.size()==1)return;

        int val = list.get(list.size()-1);
        list.remove(list.size()-1);
        sort(list);
        insert(list,val);
    }

    public static void insert(List<Integer> list ,int val){
        if(list.size()==0 || list.get(list.size()-1)<=val  ){
            list.add(val);
            return;
        }

        int temp = list.get(list.size()-1);
        list.remove(list.size()-1);
        insert(list,val);
        list.add(temp);
    }
}
