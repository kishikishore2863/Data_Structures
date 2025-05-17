package Recurrsion.CodeCamp;

import java.util.HashMap;
import java.util.Map;

public class FibonacciOptimized {
    public static void main(String[] args) {
        Map<Integer,Integer> memoizedCache = new HashMap<>();
        memoizedCache.put(0,0);
        memoizedCache.put(1,1);

       int result = fibnoacci(8,memoizedCache);
        System.out.println(result);

    }

    public static int fibnoacci(int n,Map<Integer,Integer> memoizedCache){
        if(memoizedCache.containsKey(n)){
            return memoizedCache.get(n);
        }

        int result = fibnoacci(n-1,memoizedCache)+fibnoacci(n-2,memoizedCache);
        memoizedCache.put(n,result);
        return result;

    }


}
