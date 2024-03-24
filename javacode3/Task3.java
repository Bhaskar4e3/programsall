import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<String> l=Arrays.asList("hello"," ","world","!");
       String s= l.stream().collect(Collectors.joining());
       System.out.println(s);
    }
}
