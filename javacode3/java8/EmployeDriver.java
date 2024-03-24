package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeDriver {
    public static void main(String[] args) {
        List<Emloyee> list=new ArrayList<>();
        list.add(new Emloyee("abc", 25, "female", "hr"));
        list.add(new Emloyee("def", 35, "male", "IT"));
        list.add(new Emloyee("xyz", 23, "male", "hr"));
        list.add(new Emloyee("mno", 15, "female", "IT"));
       Map<String,List<Emloyee>> l= list.stream().
       collect(Collectors.groupingBy(Emloyee::getGender));
       
       System.out.println(l);
    }
}
