package tricky1;

public class StringEqual {
    public static void main(String[] args) {
        String s1="hello";
        String s2=new String("hello");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        StringBuilder sb=new StringBuilder();
        sb.append("hello").append(" ").append("world").append("!");
        String str=sb.toString();
        System.out.println(str);
    }
    
}
