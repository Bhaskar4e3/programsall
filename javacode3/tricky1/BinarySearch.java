package tricky1;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        int last=arr.length-1;
        int key=50;
        search(arr, 0,last, key);
    }

    public static void search(int arr[],int first,int last,int key){
        while(first <= last){
            int mid = (first+last)/2;
           if(key < arr[mid]){
            last=mid-1;

           }
           else if(key == arr[mid]){
            System.out.println("element found at location "+mid);
            break;

           }
           else{
            first=mid+1;
           }
        }
    }
    
}
