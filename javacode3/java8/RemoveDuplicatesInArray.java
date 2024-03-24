package java8;

import java.text.Collator;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesInArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,2,6,7,8,4,7};//2,4,7 
        List<Integer> l=Arrays.asList(1,2,3,4,2,6,7,8,4,7);
        Set<Integer> s=new HashSet<>();
        Arrays.stream(arr).filter(e->s.add(e)).forEach(System.out::println);
           //List<Integer> nl= l.stream().distinct().collect(Collectors.toList());
        }
    }
