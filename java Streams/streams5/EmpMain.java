package streams5;

public class EmpMain {
    public static void main(String[] args) {
        Emp e1=new Emp();
        e1.setId(1);
        e1.setName("tom");
        Emp e2=new Emp();
        e2.setId(1);
        e2.setName("tom");
        System.out.println(e1.toString()+"  "+e2.toString());
        System.out.println("memory compare "+(e1.getId()==e2.getId()));

        System.out.println("original object compare "+(e1.getName().equals(e2.getName())));
   System.out.println("class compare "+(e1.getClass()==e2.getClass()));
   System.out.println(e1.getClass());
   System.out.println("equals compare "+(e1.getClass().equals(e2.getClass())));
   System.out.println(e1.hashCode());
   System.out.println(e2.hashCode());
    }
    
}
