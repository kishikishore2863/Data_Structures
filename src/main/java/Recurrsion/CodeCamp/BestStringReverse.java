package Recurrsion.CodeCamp;

public class BestStringReverse {
    public static void main(String[] args) {
        System.out.println( rev("the simple enginner"));
    }

    public static String rev(String str){
        if(str.isEmpty()){
            return "";
        }
        return rev(str.substring(1))+str.charAt(0);
    }
}
