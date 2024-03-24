package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Code1 {
    public static void main(String[] args) {
        
    
    List<String> l=Arrays.asList("bhaskar","ravi","arun"); 
    // for(int i=0;i<l.size();i++){
    //     String s=l.get(i);
    //     System.out.print(s+"  :: "+s.length()+"  ");

    // }
    System.out.println(l.stream().count());
}
}