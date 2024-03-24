package streams5;

public class ExceptonDemo {
    public static String exception(){
        return "Exception is cannot divided by zero";

    }
    public static void main(String[] args) {
        
    
  int a=0;
  int b=10;
  int c=20;
    try{
        int r=b/a;
        System.out.println(c);
    }
    catch(Exception e){
        System.out.println(exception());
        
    }

    
}
}