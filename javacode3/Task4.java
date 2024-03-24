public class Task4 {
    public static void main(String[] args) {
        String s1=new String("cloudtech");
         String s2=new String("cloudtech");
         if(s1==s2){
            System.out.println("s1==s2");
         }
         else{
            System.out.println("s1!=s2");
         }

        if(s1.equals(s2)) {
            System.out.println("s1 equals s2");
        }
        else{
            System.out.println("s1 not equal s2");
        }
    }
}
