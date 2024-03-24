import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeDriver {
    public static void main(String[] args) {
        
        List<Employe> empList=new ArrayList<>();
        empList.add(new Employe(1, "alla", "IT", 4500));
        empList.add(new Employe(2, "bk", "IT", 6500));
        empList.add(new Employe(3, "nag", "HR", 5500));
        empList.add(new Employe(4, "sudha", "IT", 7500));
        empList.add(new Employe(5, "pk", "HR", 3500));
 Map<String, Optional<Employe>> maxByDept=  empList.stream().
     collect(Collectors.groupingBy(Employe::getDept,Collectors.
     maxBy(Comparator.comparingInt(Employe::getSal))));
     maxByDept.forEach((k,v)->System.out.println(k+" ->"+v));

    //  System.out.println(empList);
     // empList.stream().filter(emp->emp.getSal()<5000).
     // forEach(e->e.setSal(e.getSal()+1000)); 
    //   empList.forEach(System.out::println);
           ///////////////and//////////////////////////////////
  Map<String,Optional<Employe>> maxSalByDept= empList.stream().collect(Collectors.groupingBy(Employe::getDept,
  Collectors.maxBy(Comparator.comparingInt(Employe::getSal))));
//     System.out.println(maxSalByDept);
     ////////////////////////////////and/////////////////////
    // List<Employe> salDescOrder= empList.stream().
    // sorted(Comparator.comparingInt(Employe::getSal).reversed()).
    //  collect(Collectors.toList());
    //  System.out.println(salDescOrder);

    // List<Employe> nameDescOrder= empList.stream().
    // sorted(Comparator.comparing(Employe::getName).reversed()).
    //  collect(Collectors.toList());
    //  System.out.println(nameDescOrder);

    // Map<String,Long> countByDept= empList.stream().
    //collect(Collectors.groupingBy(Employe::getDept,Collectors.counting()));
    //  System.out.println(countByDept);
//////////////////////////////////////////////////////////
//     String s="programming";
//     List<Character> sl=new LinkedList<>();
//     StringBuffer sb=new StringBuffer();
//     for(char c:s.toCharArray()){
//        if(!sl.contains(c)){
//         sl.add(c);
//         sb.append(c);
//        }
//     }
//    System.out.println(sb.toString()); 

 int num=1234;
  OptionalInt sumNum= Stream.of(String.valueOf(num).
  split("")).mapToInt(Integer::valueOf).reduce((c1,c2)->c1+c2);
  System.out.println(sumNum.getAsInt());
 Integer sumNum2= Stream.of(String.valueOf(num).split("")).
       collect(Collectors.summingInt(Integer::valueOf));
       System.out.println(sumNum2);
}
}
