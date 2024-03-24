package streams5;

import java.util.Arrays;

public class SumArray {
    public static void main(String[] args) {
       int[] arr={1,2,3,4,5,6,7,8,9,10};
    
      int sumArr=  Arrays.stream(arr).filter(s->s%2==0).reduce(0,(a,b)->(a+b));

    System.out.println(sumArr);
    }
}
