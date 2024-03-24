package streams;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test3Driver{
    public static void main(String[] args) {
        List<Test3> list=new ArrayList<>();
        Test3 t=new Test3(30, "bk", "hyderabad", 5);
        list.add(t);
        list.add(new Test3(25,"ak","banglore",4));
        list.add(new Test3(25,"bk","kolkata",4));
        list.add(new Test3(25,"srk","chennai",4));
        list.add(new Test3(25,"srk","banglore",4));


        //Map<String,List<Long>> map= new HashMap<>();

 Map<String,Long> map2=list.stream().collect(Collectors.groupingBy(Test3::getAddress,
        Collectors.counting()));
 List<Test3> s1=list.stream().filter(s->s.getName().equals("srk")).collect(Collectors.toList());      
        
 System.out.println(s1);
        System.out.println(map2);
    }
}