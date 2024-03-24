package streams7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class JustTry {
    public static void main(String[] args) {
        
    
    List<Integer> l=Arrays.asList(1,2,3,5,6,3,2,49,10);
    Set<Integer> s=new HashSet<>();
    l.stream().filter(e->!(s.add(e))).forEach(System.out::println);

    List<String> ls=Arrays.asList("bhaskar","ram","","","tom");
    System.out.println(ls);
    ls=ls.stream().filter(e->!(e.isEmpty())).collect(Collectors.toList());
      System.out.println(ls);
}
}