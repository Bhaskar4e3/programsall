package streams5;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Brake {
    public static void main(String[] args) {
   int[] a={0,1,1,2,1,0,2,0,2,1,2,0,0,2,1,1,1,0};
   int[] b=new int[a.length];
   int[] c=new int[a.length];
  
   int index=0;
   for(int i=0;i<a.length;i++){
    if(a[i]==0){
        b[index]=a[i];
        index++;
    }
 }
   for(int i=0;i<a.length;i++){
    if(a[i]==1){
        b[index]=a[i];
        index++;
    }
}
 for(int i=0;i<a.length;i++){
    if(a[i]==2){
        b[index]=a[i];
        index++;
    }
    }
    System.out.println(Arrays.toString(b));
     Arrays.sort(a);
     System.out.println(Arrays.toString(a));
}

}  


