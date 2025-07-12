package Recurrsion;

import java.util.ArrayList;
import java.util.List;

public class InsertElementInSortedArr {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);
        System.out.println(list );
        insert(list,4);
        System.out.println(list);

    }

    public static void insert(List<Integer> list , int elem){
        if(list.isEmpty() || list.get(list.size()-1) <= elem){
            list.add(elem);
            return;
        }

        int last = list.get(list.size()-1);
        list.remove(list.size()-1);
        insert(list,elem);
        list.add(last);

    }


}
