package streams4;
@FunctionalInterface
 interface Face{
    void fly();
    default void call(){
        System.out.println("call block");
        fly();
    }

}
public class InterFce implements Face {
    public static void main(String[] args) {
        InterFce i=new InterFce();
        i.fly();
        i.call();
    }
    public void fly() {
       System.out.println("a bird can fly");
    }
    public void call(){
    System.out.println("default call method overridden in implemented class");
    fly();
    }

    
}
