package streams7;

import java.util.Arrays;

public class JustTry4 {
    public static void main(String[] args) {
        int[] a={3,30,34,5,9};//9534303
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        String str="";
     for(int s:a){
        str=s+str;
     }
     System.out.println(str);
     int num=Integer.parseInt(str);
     System.out.println(num);
     
   int[] a=new int[str.length()];
   
    }
}
