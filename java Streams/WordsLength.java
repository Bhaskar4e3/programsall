import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class WordsLength {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("bhaskar","ravi","ramu","kumar","ram");
     //Map<String,Integer> list2=list.stream().forEach(String::length);
     Map<Integer,List<String>> l=list.stream().collect
     (Collectors.groupingBy(String::length));
     System.out.println(l);
    }
    
}
