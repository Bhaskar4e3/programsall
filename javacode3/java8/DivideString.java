package java8;

public class DivideString {
    public static void main(String[] args) {
        String s="abcdef";
        String s1="";
        String s2="";
        System.out.println(s.length());
        if (s.length() % 2 != 0) {
            System.out.println("this string cant be divided into equal parts");
        }
        else{
            int mid=s.length()/2;
            for(int i=0;i<mid;i++){
                s1=s1+s.charAt(i);
            }
             for(int i=mid;i<s.length();i++){
                s2=s2+s.charAt(i);
            }
             System.out.println(s1); 
       System.out.println(s2);
        }
     
    }
    
}
