import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8 {
    public static void main(String[] args) {
        String s="java is not easy";
      String revS=  Stream.of(s).map(str->new StringBuffer(str).reverse()).
        collect(Collectors.joining());
        System.out.println(revS);
        /////////////////////////or///////////////////////////
    Optional<String> revs=  Stream.of(s.split("")).
    reduce((c1,c2)->c2+c1);
    System.out.println(revs);
    /////////////////////////////////////////////////////
     Map<Character,Long> sfreq=  s.chars().mapToObj(a->(char)a).
     filter(w->!w.equals(' ')).collect(Collectors.
          groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
      System.out.println(sfreq);
      ///////////////////////////////////////////////////////////
      int num=1234;
   Optional<String> revNum= Stream.of(String.valueOf(num).
   split("")).reduce((c1,c2)->c2+c1);
   System.out.println(Integer.parseInt(revNum.get()));
   //////////////////////////////////////////////////////
  int sum=  Stream.of(String.valueOf(num).split(""))
  .collect(Collectors.summingInt(Integer::valueOf));
  System.out.println(sum);
  ///////////////////////////////////////////////////////////////
  List<String> list=Arrays.asList("SMith","jaCK","PeRRy");
     list.stream().map(e->e.toUpperCase()).forEach(System.out::println);
     ////////////////////////////////////////////////
   List<String> l1=Arrays.asList("bhaskar","alla","nag","genz");
  List<String> revL1= l1.stream().sorted(Comparator.reverseOrder())
       .collect(Collectors.toList());
       System.out.println(revL1);
List<Integer> l2=Arrays.asList(2,4,1,3,8,5,9,6);
      l2.stream().sorted((c1,c2)->c2-c1).forEach(System.out::println);
      //////////////////////////////
      String str="programming java";
       String revSTR= Stream.of(str).map(str1->new StringBuilder(str1).reverse()).
        collect(Collectors.joining()).toString();
        System.out.println(revSTR);
        ////////////////////////////////or///////////////////
  System.out.println(Stream.of(str.split("")).
  reduce((c1,c2)->c2+c1).get());
        ////////////////////////////////
     Map<Character,Long> mapstr=  str.chars().mapToObj(c->(char)c).filter(m->m!=' ').collect(Collectors.groupingBy
       (Function.identity(),LinkedHashMap::new,Collectors.counting())) ;
       mapstr.forEach((k,v)->System.out.print(k+" -> "+v+"  "));
       ///////////////////////////////////////////////////
       List<Double> d=Arrays.asList(1.2,4.5,9.8,2.0);
       d.stream().sorted(Comparator.reverseOrder()).
       forEach(System.out::println);


  }
}
