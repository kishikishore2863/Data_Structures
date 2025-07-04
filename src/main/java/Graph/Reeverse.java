package Graph;


import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Reeverse {
    public static void main(String[] args) {

//        printDescending(5);
//        printAscending(5);
//        System.out.println(sum(5)); // Output: 15
//        System.out.println(sum(100)); // Output: 5050

//        System.out.println(factorial(5));
//        System.out.println(factorial(0));

//        int[] arr1 = {1, 2, 3, 2, 1};       // true
//        int[] arr2 = {1, 2, 3, 4, 5};       // false
//        int[] arr3 = {7};                   // true
//        int[] arr4 = {};                    // true
//
//        System.out.println(isPalindrome(arr1));
//        System.out.println(isPalindrome(arr2));
//        System.out.println(isPalindrome(arr3));
//        System.out.println(isPalindrome(arr4));

        int[] arr = {1, 2, 3};
//        subArray(arr);

        System.out.println("Subsets:");
        generateSubsets(arr);

    }

    public static void printDescending(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        printDescending(n-1);

    } // Example: 5 4 3 2 1
    public static void printAscending(int n) {
        if(n==0){
            return;
        }

        printAscending(n-1);
        System.out.println(n);
    }  // Example: 1 2 3 4 5

    public static int sum(int n){
        if(n==0){
            return 0;
        }
       int prev =   sum(n-1);
        return prev+n;
    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int prev =factorial(n-1);
        return prev*n;
    }

    public static boolean isPalindrome(int[] arr) {
        int[] original = arr;
        int [] temp  = new int[arr.length];
        int i=0;
        for(int o:original){
            temp[i]=o;
            i++;
        }

         isPalindrome(temp, 0, temp.length - 1);
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(temp));
         if(Arrays.equals(original, temp)){
             return true;
         }else {
             return false;
         }

    }

    public static void isPalindrome(int[] arr, int left, int right){
       if(left>=right){
           return ;
       }
       int temp = arr[left];
       arr[left] = arr[right];
       arr[right] = temp;
       isPalindrome(arr,left+1,right-1);
    }

    public static int sumArray(int[] arr, int index){
        if(index == -1){
            return 0;
        }
        int sum = sumArray(arr,index-1);
        return sum+arr[index];
    }

   public static void  subArray(int[] arr){
        for(int start =0; start<arr.length; start++){
            int end =start;
            while (end<arr.length){
                for (int i=start; i <= end; i++){
                    System.out.print(arr[i]+"");
                }
                System.out.println();
                end++;
            }
        }
   }


   public static void generateSubsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrackSubsets(nums, 0, new ArrayList<>(), result);

        for (List<Integer> subset : result) {
            System.out.println(subset);

        }
    }

    private static void backtrackSubsets(int[] nums, int index, List<Integer> path, List<List<Integer>> result) {
        result.add(new ArrayList<>(path));
        System.out.println("Add subset to result: " + path);

        for (int i = index; i < nums.length; i++) {
            path.add(nums[i]);
            System.out.println("Added: " + nums[i] + ", Path now: " + path);
            backtrackSubsets(nums, i + 1, path, result);
            System.out.println("Backtracking from: " + path.get(path.size() - 1) + ", Path before removing: " + path);
            path.remove(path.size() - 1);
            System.out.println("Path after removing: " + path);
        }
    }



}
