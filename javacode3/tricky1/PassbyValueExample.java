package tricky1;
public class PassbyValueExample {

    public static void main(String[] args) {
        int x=10;
        System.out.println("before calling method x= "+x);
        changeValue(x);
        System.out.println("after calling method x= "+x);
    }
    public static void changeValue(int value) {
        value=20;
        
    }
    
}
