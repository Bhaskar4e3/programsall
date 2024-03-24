package java8;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class Sort {
	public static void main(String[] args) {
		Map<Character,Integer> list=new HashMap<>();
		list.put('a',3);
		list.put('b',5);
		list.put('e',2);
		list.put('c',4);
		list.put('d',1);
		System.out.println(list);
		LinkedHashMap<Character,Integer> sortedList=
				list.entrySet().stream().sorted((t1,t2)->(t1.getValue().
						compareTo(t2.getValue())))
		.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
				(t1,t2)->t1,LinkedHashMap::new));
		System.out.println(sortedList);
		
	}

}
