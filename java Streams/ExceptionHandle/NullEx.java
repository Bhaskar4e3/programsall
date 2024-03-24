package ExceptionHandle;
class NullPointerException extends RuntimeException{
    NullPointerException(String s){
        super(s);
        System.out.println(s);
    }
}

public class NullEx {
    public static void main(String[] args) {
        String s=null;
        if(s!=null){
           System.out.println(s.length());
        }
        else{
            throw new NullPointerException("s is null");
        }
    }
    
}
