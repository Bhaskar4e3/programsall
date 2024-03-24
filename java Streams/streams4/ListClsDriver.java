package streams4;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ListClsDriver {
    public static void main(String[] args) {
        
        ListClass lc=new ListClass();
        List<ListClass> l=new LinkedList<>();
  l.add(new ListClass("p1",26,"fever",1500));
    l.add(new ListClass("p2",23,"carona",2500));
      l.add(new  ListClass("p3",36,"carona",3500));
       l.add(new  ListClass("p4",29,"flue",1700));
        l.add(new  ListClass("p5",31,"carona",1200));
       Double averageBillByCarona= l.stream().filter(p->p.getDisease().equals("carona"))
        .collect(Collectors.averagingDouble(ListClass::getAmount));
    System.out.println(averageBillByCarona);
    }
    
}
