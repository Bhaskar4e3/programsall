package java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CharacterOccurences {
   public static void main(String[] args) {
    String input="hellohl";
    char[] ch=input.toCharArray();
    Map<Character,Integer> m=new HashMap<>();
    for(char c:ch){
        if(!m.containsKey(c)){
            m.put(c, 1);
        }
        else{
            int cnt=m.get(c);
            m.put(c, cnt+1);
        }
    }
    System.out.println(m);
   } 
}
