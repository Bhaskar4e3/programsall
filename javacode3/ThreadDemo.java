class Runnademo implements Runnable{

    @Override
    public void run() {
         System.out.println("runnable thread "+Thread.currentThread().getName());
    }
    
}
public class ThreadDemo{
    public static void main(String[] args) {
        Runnademo r=new Runnademo();
        Thread t1=new Thread(r);
        t1.start();
        System.out.println(Thread.currentThread().getName());
    }
}