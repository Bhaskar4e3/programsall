package tricky1;

class Vehicle{
    public void accelerate(String speed){
        System.out.println("accelerate the vehicle String");
    }
     public void accelerate(Object speed){
        System.out.println("accelerate the vehicle object");
    }
}

public class Tricky {
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        v.accelerate(null);
    }

    
}
