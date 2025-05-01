package Basic;



public class Programs {
    public static void main(String[] args) {
        Programs p = new Programs();
//        p.revString("hello");
//        p.palindrome("hello");
//        p.anagram("listen","silent");
//        p.anagram("hello","world");
//        p.panagram("The quick brown fox jumps over the lazy dog");
//        p.panagram("Hello world");
//        p.isEven(2);
//        p.isEven(7);
//        p.prime(7);
//        p.prime(11);
//        p.prime(15);
//        p.prime(20);
//        p.allPrimeUnderRage(100);
//        p.LargestOfNum(50,29,49);
//        p.armstrong(153);
//        p.armstrong(143);
//        p.fibnocci(5);

        p.sumOfDigits(1234);







    }

    public void revString(String str){
        StringBuilder sb = new StringBuilder(str);
        int start = 0;
        int end = sb.length()-1;
        while(start < end){
            char temp  = sb.charAt(start);
            sb.setCharAt(start , sb.charAt(end));
            sb.setCharAt(end,temp);
            start++;
            end--;
        }
        System.out.println("input:"+str);
        System.out.println("output:"+sb);
    }

    public void palindrome(String str){
        int start = 0;
        int end = str.length()-1;
        boolean notPalin = false;
        while(start < end){
           if(str.charAt(start)!=str.charAt(end)){
               notPalin = true;
              break;
           }
           start++;
           end--;
        }
        if(notPalin){
            System.out.println(false);
        }else {
            System.out.println(true);
        }
    }

    public void anagram(String str1 , String str2){
       String sortedstr1 = sort(str1);
       String sortedstr2 = sort(str2);
       if(sortedstr1.equals(sortedstr2)){
           System.out.println("true");
       }else{
           System.out.println("false");
       }
    }

    public String sort(String str){
        char [] arr = str.toCharArray();
        for(int i=0; i< arr.length-1; i++){
            for(int j=i+1; j< arr.length; j++){
                if(arr[i]>arr[j]){
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return new String(arr);
    }

    public void panagram(String str){
        boolean is_panagram =true;
        str =  str.toLowerCase();
        char[] hash = new char[26];
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                hash[str.charAt(i)-97] = 1;
            }
        }

        for(int i=0; i<hash.length; i++){
            if(hash[i]!=1){
                is_panagram = false;
                break;
            }
        }
        System.out.println(is_panagram);
    }

    public void isEven(int n){
        System.out.println(n%2==0);
    }

    public void factorial(int n){

    }

//    public int  recursion(int n){
//        if(n==0)return n;
//
//    }

    public boolean prime(int n){
        boolean isPrime = true;
        if(n==1){
            System.out.println("false");
            return false;
        }else{
            for(int i=2; i<n; i++){
                if(n%i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }


    public void allPrimeUnderRage(int n){
        for (int i = 1; i<=n; i++){
            if(prime(i)){
                System.out.println(i);
            }
        }
    }

   public void LargestOfNum(int n1, int n2 , int n3){
      int large = Math.max(n2,n1);
      large = Math.max(large,n3);
       System.out.println(large);

   }


   public void armstrong(int n1){
        int digits = 0;
        int n = n1;
        int n2 = n1;
       while(n>0){
          digits++;
          n = n/10;
       }
       int sum =0;
       while (n2>0){
           int lastDigit = n2%10;
           sum = sum + (int) (Math.pow(lastDigit,digits));
           n2 = n2/10;
       }

       System.out.println(sum == n1);
   }


   public void fibnocci(int n){
        int first = 0;
        int second = 1;
        int start =2;
        while(start<=n){
            int sum = first + second;
            System.out.println(sum);
            first = second;
            second = sum;

            start++;
        }
   }


   public void sumOfDigits(int n){
        int sum =0;
        while(n>0){
            int lastDigit = n%10;
            sum = sum + lastDigit;
            n = n/10;
        }
       System.out.println(sum);
   }







}
