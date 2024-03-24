package streams2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StringLen {
    public static void main(String[] args) {
List<String> l=Arrays.asList("bhaskar","ravi","ramu","kiran","praveen","ravi","praveen");
Map<Integer,Set<String>> m=  l.stream().collect(Collectors.groupingBy
(String::length,Collectors.toSet()));
System.out.println(m);
    }
    
}
