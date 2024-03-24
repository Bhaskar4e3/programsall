import java.util.Arrays;

public class EvenOddArray {
    public static void main(String[] args) {
        int[] arr={1,2,4,3,6,5,9,7,310,11};
        int[] newarr=new int[arr.length];
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                newarr[index]=arr[i];
                index++;
            }
        }
         for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                newarr[index]=arr[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(newarr));
    }
}
