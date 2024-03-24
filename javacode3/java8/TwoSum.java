package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        
    
    List<Integer> nums=new ArrayList<>();
        int[] arr={1,11,2,15,7};
        for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++) {
            if(arr[i]+arr[j]==9){
                nums.add(arr[i]);
                nums.add(arr[j]);
                break;
            }
           }

      
        }
         System.out.println(nums);
}
}