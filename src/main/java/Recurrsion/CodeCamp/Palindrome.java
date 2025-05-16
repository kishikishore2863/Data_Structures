package Recurrsion.CodeCamp;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPlaindrome("kishore"));
        System.out.println(isPlaindrome("madam"));
    }

    public static boolean isPlaindrome(String str){
        return str.equals(palindromeRev(str));
    }

    private static String palindromeRev(String str){
        if(str.isEmpty()){
            return "";
        }

        return palindromeRev(str.substring(1))+str.charAt(0);

    }
}
