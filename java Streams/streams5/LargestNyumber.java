package streams5;

import java.util.Arrays;

public class LargestNyumber {
    public static void main(String[] args) {
        int[] arr={19,32,23,14,50,46};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
        int largestNumber=0;
        int temp=0;
        for(int i=0;i<arr.length;i++){
            if(largestNumber<arr[i]){
             temp=arr[i];
             largestNumber=arr[i];
             arr[i]=temp;
            }
        }
        System.out.println(largestNumber);
    }
    
}
