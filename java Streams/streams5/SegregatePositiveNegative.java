package streams5;

import java.util.Arrays;

public class SegregatePositiveNegative {
    public static void main(String[] args) {
        int[] a={9,10,-18,20,-27,30,-36,40,45,50};
        int countPositive=0;
        int countNegative=0;
        
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                countPositive++;
            }
            else{
                countNegative++;
            }
        }
        int[] positive=new int[countPositive];
        int[] negative=new int[countNegative];
        int index=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                positive[index]=a[i];
                index++;
            }}
            int index2=0;
            for(int i=0;i<a.length;i++){
            if(a[i]<0){
                negative[index2]=a[i];
                index2++;
            }}

        System.out.println(Arrays.toString(positive));
          System.out.println(Arrays.toString(negative));
    }
    
}
