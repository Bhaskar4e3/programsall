package tricky1;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountCharacterInString {
    public static void main(String[] args) {
        String str="hello";
        
      Map<String,Long> count=  Arrays.stream(str.split("")).collect(Collectors
        .groupingBy(s->s,Collectors.counting()));

        System.out.println(count);
    }
}
