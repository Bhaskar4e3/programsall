package java8;

import java.text.Collator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TeachersDriver {
    public static void main(String[] args) {
        List<Teachers> t=new LinkedList<>();
        t.add(new Teachers("abc", 29, 90));
        t.add(new Teachers("def", 23, 75));
        t.add(new Teachers("pqr", 27, 100));
        t.add(new Teachers("xyz", 23, 10));
       List<Double> ut= t.stream().filter(s->s.getAge()>25).map
        (k->k.getSalary()*(1.10)).collect(Collectors.toList());
        System.out.println(ut);

       List<Teachers> rt= t.stream().map(e->{
            if(e.getAge()>25){
                e.setSalary(e.getSalary()*1.10);
               
            }
             return e;
        }).collect(Collectors.toList());

       System.out.println(rt);

      Optional<Teachers> ts= t.stream().findFirst();
      if(ts.isPresent())
        System.out.println(ts);


//         String str="cloudtechcjp";
//       // String ustr= str.replaceAll("c", "");
//         String ustr="";
//         for(int i=0;i<str.length();i++){
//             if(str.charAt(i)!='c'){
//                 ustr=ustr+str.charAt(i);
//             }
//         }
        
// System.out.println(ustr);
    }
}
