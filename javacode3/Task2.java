import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String> l=Arrays.asList("apple","pear","grape","banana");
Map<Integer,List<String>> m=l.stream().collect
                        (Collectors.groupingBy(String::length));
                        System.out.println(m);
    }
}

