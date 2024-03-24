import java.util.Arrays;

public class Test7 {
    public static void main(String[] args) {
        int[] arr={3,4,5,6,7,2,10};
        System.err.println(Arrays.toString(arr)); 
        for(int i=0;i<=arr.length-1;i++){
             for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                   // System.out.println(Arrays.toString(arr));
                }

             }
            
        }
         System.out.println(arr[arr.length-2]);
    }
    
}
