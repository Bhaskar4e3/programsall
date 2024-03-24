package java8;

public class ArraysEqual {
    public static void main(String[] args) {
        int[] arr1={3,2,7,9};
           int[] arr2={7,6,2,3};
 int index=0;
 if(arr1.length!=arr2.length){
    System.out.println("both will be diifernet becoz of size");
 }
 else{
           for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr1[i]==arr2[j]){
index++;
                }
            }
           }
        
           if(index==arr1.length){
            System.out.println("both are same");
           }
           else{
            System.out.println("both are different");
           }
        }
    
        int value=12345;
        
      int sum=0;
      while (value>0) {
        int remainder=value%10;
        sum=sum+remainder;
        value=value/10;

      }
      
      System.err.println(sum);
        
    }
}
