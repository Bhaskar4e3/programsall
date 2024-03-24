package java8;

import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
        String str=null;
        Optional<String> optional=Optional.ofNullable(str);
        if(optional.isPresent()){
            System.out.println("optional value present "+str);
        }
        else{
      String s=optional.orElse("default");
            System.out.println("optional value is not present "+s);
        }
    }
}
