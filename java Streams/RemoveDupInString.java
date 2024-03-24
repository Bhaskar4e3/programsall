import java.util.HashSet;
import java.util.Set;

public class RemoveDupInString {
    public static void main(String[] args) {
        String s="saandeepa";
        String rs="";
         Set<Character> c=new HashSet<>();
        for(int i=0;i<s.length();i++){
        
         if(c.contains(s.charAt(i))){
            rs=rs+s.charAt(i);
         }
            }
            System.out.println(rs);
              
        }
  
}
