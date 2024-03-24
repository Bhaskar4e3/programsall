package streams5;

import java.util.Arrays;
import java.util.List;

public class OccurencesofList {
    public static void main(String[] args) {
 List<String> list=Arrays.asList("apple","banana","apple","orange","apple");
 String target="apple";
 Long count=list.stream().filter(s->s.equals("apple")).count();
 System.out.println(count);
    }
    
}
