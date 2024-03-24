import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        int[] arr={2,3,4,6,7,8};
        String gHvalue="";
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]<arr[j]){
                       int temp=arr[i];
                       arr[i]=arr[j];
                       arr[j]=temp;
                       //int arr1[] =new int[arr.length];
                       
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<=arr.length-1;i++){
            gHvalue=gHvalue+arr[i];

        }

       System.out.println(gHvalue);
    }
}
