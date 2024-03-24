import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> l=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
     int sum= l.stream().filter(n->n%2==0).reduce(0,(a,b)->a+b);
     System.out.println(sum);
    }
    
}
