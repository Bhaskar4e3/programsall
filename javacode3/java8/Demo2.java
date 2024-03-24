package java8;

import java.util.StringJoiner;

public class Demo2 {
    public static void main(String[] args) {
        
    
    String s="abcd";
    StringJoiner s1=new StringJoiner(",","[","]");
   
    s1.add(s).add("efgh");
    StringJoiner s2=new StringJoiner("...");
    s2.add("xyz").add("pqr");
   System.out.println(s1);
   System.out.println(s2);
   s1.merge(s2);
   System.out.println(s1);
   
}
}