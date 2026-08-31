import java.io.*;
import java.util.*;
public class StringPermutation {
    public static boolean isPermutation(String s,String t){
        int[] freqS=new int[26];
        int[] freqT=new int[26];
        for(int  i=0;i<s.length();i++){
            freqS[s.charAt(i)-'a']++;
        }
        for(int  i=0;i<t.length();i++){
            freqT[t.charAt(i)-'a']++;
        }
        for (int i=0;i<26;i++){
            if(freqS[i]!=freqT[i])return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPermutation(
                "jsdf","husi"));
    }

}
