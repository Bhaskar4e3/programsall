import java.util.HashSet;
import java.util.Set;

public class FirstNonRepet {
    public static void main(String[] args) {
        String s="sandeepsa";
        Set<Character> c=new HashSet<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            c.add(s.charAt(i));}
            for(int i=0;i<s.length();i++){
                if(c.contains(s.charAt(i))){
                  //System.out.println(s.charAt(i));
                    count++;
                    
                    break;
                }
            }
            
    }
}