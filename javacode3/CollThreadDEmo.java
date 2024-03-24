import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CollabDemo implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        System.out.println("callable thread "+Thread.currentThread().getName());
        return 1;  
    }   
}
public class CollThreadDEmo {
    public static void main(String[] args) {
       CollabDemo c=new CollabDemo() ;
       ExecutorService e=Executors.newSingleThreadExecutor();
       Future f=e.submit(c);
         try{
        int r=(int) f.get();
      System.out.println(r);}
         catch(Exception err){
            System.out.println(err);
         }
         System.out.println(Thread.currentThread().getName());
       
        
    }
    
}
