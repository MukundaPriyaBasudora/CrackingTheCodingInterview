//import java.util.HashMap;
import java.util.*;

public class OneAway {
    public static boolean isOneAway(String s1,String s2){
        if(Math.abs(s1.length()-s2.length())>1)return false;
        String max="",min="";
        if(s1.length()>s2.length()){
            max=s1;
            min=s2;
        }
        else{
            max=s2;
            min=s1;
        }
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:min.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);

        }
        int c=0;
        for(char ch:max.toCharArray()){
            if(!map.containsKey(ch)){
                c++;
                continue;
            }
            if(c>1)return false;
            map.put(ch,map.get(ch)-1);
            if(map.get(ch)==0)map.remove(ch);
        }
        if(map.size()>1)return false;
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isOneAway("pale","pales"));
    }
}
