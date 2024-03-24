package java8;

import java.util.Arrays;

public class EvenFirseOddNextArray {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,7,8,20,11};
        int[] newArr=new int[arr.length];
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                newArr[index]=arr[i];
                index++;
            }
        }
         for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                newArr[index]=arr[i];
                index++;
            }
        }

        System.out.println(Arrays.toString(newArr));
    }
    
}
