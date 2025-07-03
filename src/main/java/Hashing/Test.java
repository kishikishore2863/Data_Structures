package Hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Test {
    public static void main(String[] args) {

        List<Integer> li=new ArrayList<>();
        int[] a={1,2,5,3,7};

        for(int i=a.length-1;i>0;i--){
            boolean found =false;
            for(int j=i-1;j>=0;j--){

                if(a[i]<a[j]){
                    li.add(a[j]);
                    break;
                }
            }
            if(!found){
                li.add(-1);
            }


        }
        Collections.reverse(li);

        System.out.println(li);
    }

 }
