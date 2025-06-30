package stack;

import java.time.temporal.JulianFields;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Maximum_Area_Histogram {
    public static void main(String[] args) {
        int [] arr = {2,1,5,6,2,3};
        List<Integer> right = nearestSmallestRight(arr);
        List<Integer> left = nearestSmallestLeft(arr);
        List<Integer> width =  widthFinder(right,left);
        List<Integer> areas = areas(width,arr);
        int res = maxArea(areas);
        System.out.println(res);

    }

    private static List<Integer> nearestSmallestLeft(int [] arr ){
        List<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        for (int i = 0; i <n ; i++) {
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            if (stack.isEmpty()){
                list.add(-1);
            }else{
                list.add(stack.peek());
            }
            stack.add(i);
        }
        return list;
    }

    private static List<Integer> nearestSmallestRight(int [] arr){
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        int n = arr.length;

        for(int i = n - 1; i >= 0; i--){
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                list.add(n);
            } else {
                list.add(stack.peek());
            }
            stack.push(i);
        }

        Collections.reverse(list);

        return list;
    }

    private static List<Integer> widthFinder(List<Integer>right , List<Integer> left){
        List<Integer> width = new ArrayList<>();
        for(int i=0;i< right.size(); i++){
            width.add(right.get(i)-(left.get(i))-1);
        }
        return width;
    }

    private static List<Integer> areas(List<Integer> width, int[] heights){
        List<Integer> areas = new ArrayList<>();
        for (int i = 0; i <heights.length ; i++) {
            areas.add(width.get(i)*heights[i]);
        }
        return areas;
    }

    private static  int maxArea(List<Integer> area){
        int max = 0;
        for (Integer integer : area) {
            if (max < integer) {
                max = integer;
            }
        }
        return max;
    }
}
