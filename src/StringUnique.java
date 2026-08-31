
import java.io.*;
import java.util.*;
public class StringUnique {
    private boolean isUnique(String s){
        char[] alphabets=s.toCharArray();
        Arrays.sort(alphabets);
        for(int i=1;i<alphabets.length;i++){
            if(alphabets[i]==alphabets[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        StringUnique s=new StringUnique();
        System.out.println(s.isUnique(" " +
                "Nfdgrr"));
    }

}
