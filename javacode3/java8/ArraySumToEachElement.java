//package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraySumToEachElement {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
    int sum=   Arrays.stream(arr).sum();
   // System.out.println(sum);
Arrays.stream(arr).map(x->x+Arrays.stream(arr).sum()).forEach(System.out::println);
    }
}
