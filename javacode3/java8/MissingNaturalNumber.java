package java8;

public class MissingNaturalNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,8,7,9,10};
        //int len=arr[arr.length-1];
        System.out.println(arr.length+1);
        int n=arr.length+1;
        int sum=(n*(n+1))/2;
        //System.out.println(len);
    int actualSum=0;
    for(int i=0;i<arr.length;i++){
        actualSum=actualSum+arr[i];

    }
    System.out.println("missing natural number is  "+(sum-actualSum));
    
    }
}
