package java8;

public class Demo1 {
    public static void main(String[] args) {
        String s="madam";
        StringBuilder sb=new StringBuilder(s);
       
      String sb1=sb.reverse().toString();
        if(s.equals(sb1)){
            System.out.println("polindrome");
        }
        else{
            System.out.println("not polindrome");
        }
    }
    
}
