package streams2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class ArraySort {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(2,4,6,7,9,20,1,3);

       List<Integer> sortedList= list.stream().sorted().collect(Collectors.toList());
    System.out.println("sorted list  "+sortedList);
    
    }
    
}
