package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Demoin {
    public static void main(String[] args) {
    List<String> s=Arrays.asList("java","php","angular","python","r","c++");
   List<String> s1= s.stream().filter(e->e.length()>3).collect(Collectors.toList());
 System.out.println(s1);  
}
}
