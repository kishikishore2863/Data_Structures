package testing;

public class ProcessString {
    public static void main(String[] args) {
        ProcessString processString = new ProcessString();
        String s = "a#b%*";
       String result =  processString.processStr(s);
        System.out.println(result);
    }

    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c>='a' && c<='z'){
                sb.append(c);
            }else{
               if(c=='*'){
                   if(!sb.isEmpty()){
                       sb.deleteCharAt(sb.length()-1);
                   }
               }
               if(c == '#'){
                   StringBuilder copy = new StringBuilder(sb);
                   sb.append(copy);
               }
               if( c == '%'){
                   sb.reverse();
               }
            }
        }
       return sb.toString();
    }
}
