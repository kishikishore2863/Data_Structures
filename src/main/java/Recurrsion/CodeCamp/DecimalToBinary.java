package Recurrsion.CodeCamp;

public class DecimalToBinary {
    public static void main(String[] args) {
        String s =findBinary(2863,"");
        System.out.println(s);


    }

    public static String findBinary(int decimal,String result){
        if(decimal == 0){
            return result;
        }

        result = decimal%2+result;
        System.out.println(decimal+"->"+result);

        return findBinary(decimal/2,result);

    }
}
