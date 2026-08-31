import java.util.*;
public class URLify {
    public static String urlify(String s){
        char[] arr=new char[s.length()];
        int i=0,j=0;
        while(j<arr.length&&i<s.length()){
            if(s.charAt(i)==' '){
                arr[j++]='%';
                arr[j++]='2';
                arr[j++]='0';
                i++;
            }
            else{
                arr[j]=s.charAt(i);
                i++;
                j++;
            }
        }
        return String.valueOf(arr);
    }
    public static void main(String[] args) {
        System.out.println(urlify("   "));
    }
}
