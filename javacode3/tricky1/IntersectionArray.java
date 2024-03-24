package tricky1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionArray {
    public static void main(String[] args) {
        int arr1[]={80,10,4,35,60,45};
        int arr2[]={80,11,3,35,60,48};
        // for(int i=0;i<=arr1.length-1;i++){
        //     for(int j=0;j<=arr2.length-1;j++){
        //         if(arr1[i]==arr2[j]){
        //            System.out.println(arr1[i]);
                   
        //         }
        //     }
        // }

        Set<Integer> s=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            s.add(arr1[i]);

        }
        for(int j=0;j<arr2.length;j++){
            if(s.add(arr2[j])){
                
            }
            else{
                System.out.println(arr2[j]);
            }
        }
    }
}
