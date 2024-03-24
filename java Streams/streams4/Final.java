package streams4;
class Driver{
int wheels=10;
}
 class Car{
    Driver d=new Driver();


}

public class Final {
    public static void main(String[] args) {
        int a=0;
        int b=10;
        Car c=new Car();
        System.out.println(c.d.wheels);
        
        try{
            int r=b/a;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e);
              System.exit(a);
        }
      
        finally{
            System.out.println("it is finally block");
        }
    }
    
}
