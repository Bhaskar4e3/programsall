package streams5;

import java.util.Arrays;

public class MergeArrasAndSort {
    public static void main(String[] args) {
      int[] a={10,20,30,40,50};
      int[] b={9,18,27,36,45};
      int[] mergeArrasAndSort=new int[a.length+b.length];
    //   int index=0;
    //   for(int i=0;i<a.length;i++){
    //     mergeArrasAndSort[index]=a[i];
    //     index++;
    //   }
    //     for(int i=0;i<b.length;i++){
    //     mergeArrasAndSort[index]=b[i];
    //     index++;
    //   }
    //   System.out.println(Arrays.toString(mergeArrasAndSort));
    //   Arrays.sort(mergeArrasAndSort);
    //   System.out.println(Arrays.toString(mergeArrasAndSort));
    System.arraycopy(a, 0, mergeArrasAndSort, 0  ,a.length);
    System.arraycopy(b, 0, mergeArrasAndSort, a.length, b.length);
    System.out.println(Arrays.toString(mergeArrasAndSort));
    Arrays.sort(mergeArrasAndSort);
      System.out.println(Arrays.toString(mergeArrasAndSort));
      for(int element : mergeArrasAndSort){
       System.out.print(element+" ");
      }
}
    
}
