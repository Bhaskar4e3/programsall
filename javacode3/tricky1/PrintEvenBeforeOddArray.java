package tricky1;

import java.util.Arrays;

public class PrintEvenBeforeOddArray {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,6,8,9,10,11,13,14};
        int[] resarr=new int[arr.length];
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                resarr[index]=arr[i];
              index++;
            }
        }
             for(int j=0;j<arr.length;j++){
            if(arr[j]%2!=0){
                resarr[index]=arr[j];
                index++;

            }
        }
    
        System.out.println(Arrays.toString(resarr));
    }
    
}
