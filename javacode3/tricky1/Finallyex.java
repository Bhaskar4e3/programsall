package tricky1;

public class Finallyex {
  public static void main(String[] args) {
    
  
    try{
        String s="zoya";
        System.out.println("in try");
        
        int len=s.length();
System.out.println(len);
  //System.exit(0);

    }
    catch(Exception e){
        System.out.println(e);
        System.out.println("in catch block");
      
    }
finally{
    System.out.println("finally block");
}
    
}
}