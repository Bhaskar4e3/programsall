import java.sql.Array;
import java.util.Arrays;

public class ArrayDElEle {
    public static void main(String[] args) {
        int[] a={2,4,6,8,9};//delete element from array
       int deleteElement=2;
       int[] b=new int[a.length-1];
       int index=0;
       for(int i=0;i<a.length;i++){
         if(a[i]!=deleteElement){
                b[index]=a[i];
                index++;
          }
          }
System.out.println(Arrays.toString(b));
       
    }
    
}
