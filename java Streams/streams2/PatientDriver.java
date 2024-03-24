package streams2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PatientDriver {
    public static void main(String[] args) {
        
    
    Patient patient1=new  Patient("p1",26,"fever",1500);
     Patient patient2=new  Patient("p2",23,"carona",2500);
      Patient patient3=new  Patient("p3",36,"carona",3500);
       Patient patient4=new  Patient("p4",29,"flue",1700);
        Patient patient5=new  Patient("p5",31,"carona",1200);
    
List<Patient> patients=Arrays.asList(patient1,patient2,patient3,patient4,patient5);
System.out.println("patients list "+patients);
int totalAmount=patients.stream().mapToInt(Patient::getAmount).reduce(0, (a,b)->a+b);
System.out.println("total patents amount "+totalAmount);

//Double AvgBillPaidByCarona=
patients.stream().filter(p->p.getDisease().
equals("carona") && p.getAge() >30).forEach(System.out::println);
//.collect(Collectors.averagingDouble(Patient::getAmount));
//System.out.println("AvgBillPaidByCarona  "+AvgBillPaidByCarona);
System.out.println("  ");
Map<String, List<Patient>> p=patients.stream().
collect(Collectors.groupingBy(Patient::getDisease,Collectors.toList()));
System.out.println(p);
}
}