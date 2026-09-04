import java.util.*;
public class StringCompression {
    public static String compress(String s){
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<s.length()){
            int j=i;
            while(j<s.length()&&s.charAt(j)==s.charAt(i)){
                j++;
            }
            sb.append(s.charAt(i)).append(j-i);
            i=j;
        }
        if(sb.length()>s.length()){
            return s;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(compress("abcdef"));
    }
}
