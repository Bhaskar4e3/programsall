import java.util.HashMap;
import java.util.Map;

public class Test6 {
    public static void main(String[] args) {
        Map<Integer,String> map= new HashMap<>();
        map.put(1, "bhaskar");
        map.put(2, "hari");
         map.put(3, "vamsi");
          map.put(4, "alms");
        
            System.out.println(map.putIfAbsent(5, "vamsi"));
            System.out.println(map);
        };
    }

